package steps;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.UnsupportedCommandException;
import pages.utils.Config;
import pages.utils.SeleniumDriver;

import java.net.MalformedURLException;

public class BeforeActions {
    public String Url;

    @Before
    public void setUp(Scenario scenario) throws MalformedURLException {
        SeleniumDriver.setUpDriver(scenario);

        switch(Config.environment)
        {
            case "dev":
                Url = "https://axs-dev-webboxoffice.us.axs.com/login/qa";
                break;
        }
        try {
            SeleniumDriver.openPage(Url);
        }
        catch (UnsupportedCommandException | NoSuchSessionException e){
            SeleniumDriver.setUpDriver(scenario);
        }

        System.out.println("Before");
    }
}
