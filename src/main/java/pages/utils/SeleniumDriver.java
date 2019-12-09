package pages.utils;

import cucumber.api.Scenario;
import org.json.JSONException;
import org.openqa.selenium.UnsupportedCommandException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static pages.utils.Config.*;


public class SeleniumDriver {
    private static SeleniumDriver seleniumDriver;

    //initialize webdriver
    private static WebDriver driver;

    //initialize timeouts
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 20;

    //SauceLabs Config
    public static final String USERNAME = "Musha";
    public static final String ACCESS_KEY = "638faf51-da42-4a62-80d1-29c312cb321a";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
    public static String sessionId = null;
    public static String jobName = null ;

    // constructor
    private SeleniumDriver(Scenario scenario) throws MalformedURLException {

        String window;
        DesiredCapabilities caps;
        RemoteWebDriver webDriver;
        ThreadLocal<WebDriver> remoteDriver = new ThreadLocal<>();
        switch(Config.host)
        {
            case "local":
                driver = new ChromeDriver();
               driver.manage().window().maximize();
                window=driver.getWindowHandle();
                System.out.println("Window ->"+window);
                driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
                break;

            // remote desktop web
            case "Remote":
                caps = new DesiredCapabilities();
                caps.setCapability("browserName", browserName);
                caps.setCapability("version", browserVersion);
                caps.setCapability("platform", platform);
                //caps.setCapability("parentTunnel","ellentubetech@warnerbros.com");
                //caps.setCapability("tunnelIdentifier","ellentube_qa_tunnel");
                jobName = scenario.getName();
                caps.setCapability("name", jobName);
                webDriver = new RemoteWebDriver(new URL(URL),caps);
                remoteDriver.set(webDriver);
                driver = remoteDriver.get();
                sessionId = (((RemoteWebDriver) driver).getSessionId()).toString();
                driver.manage().window().maximize();
                window=driver.getWindowHandle();
                System.out.println("Window ->"+window);
                break;

        }
    }

    // method to set up the SeleniumDriver
    public static void setUpDriver(Scenario scenario) throws MalformedURLException {
        try {
            if (seleniumDriver == null)
                seleniumDriver = new SeleniumDriver( scenario);
        }
        catch (UnsupportedCommandException e){
            seleniumDriver = new SeleniumDriver( scenario);
        }
    }

    // method to tear down the SeleniumDriver
    public static void tearDown(Scenario scenario) {
        if (driver != null) {
            driver.quit();
            driver = null;
            try {
                SauceUtils.UpdateResults( USERNAME, ACCESS_KEY, !scenario.isFailed(), SeleniumDriver.sessionId);
            } catch (JSONException | IOException e) {
                e.printStackTrace();
            }
            System.out.println("SauceOnDemandSessionID="+ SeleniumDriver.sessionId + "job-name="+ SeleniumDriver.jobName);
        }
        seleniumDriver = null;
    }

    // method to open a web page
    public static void openPage(String url) {
        System.out.println(url);
        System.out.println(driver);
        driver.get(url);
    }

    // method to get the SeleniumDriver
    public static WebDriver getDriver() {
        return driver;
    }
}
