package pages.utils;

public interface Config {

    // Environment for remote
    String environment = System.getProperty("env","dev");
    String host = System.getProperty("host", "local");

    //SauceLabs Chrome Web Variables
    String browserName =System.getProperty("browserName","Chrome");
    String browserVersion = System.getProperty("version","latest");
    String platform = System.getProperty("platform","Windows 10");
    String screenResolution = System.getProperty("screenResolution", "1920x1080");

    //SauceLabs MobileAndroidWeb Variables
    String mobileBrowserName=System.getProperty("mobileBrowserName", "Chrome");
    String appiumVersion = System.getProperty("appiumVersion", "1.8.0");
    String deviceName = System.getProperty("deviceName","Samsung Galaxy S9 WQHD GoogleAPI Emulator");
    String deviceOrientation = System.getProperty("deviceOrientation", "portrait");
    String platformVersion=System.getProperty("platformVersion", "");
    String platformName=System.getProperty("platformName","Android");
    String timeout=System.getProperty("timeout","1000");
}
