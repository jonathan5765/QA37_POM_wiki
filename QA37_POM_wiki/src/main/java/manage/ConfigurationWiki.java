package manage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class ConfigurationWiki {

    protected static AppiumDriver<MobileElement> driver;

    @BeforeSuite

    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities= new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("deviceName", "N37");

        capabilities.setCapability("platformVersion","8.0");

        capabilities.setCapability("appPackage", "org.wikipedia");

        capabilities.setCapability("appActivities", ".main.MainActivity");



        capabilities.setCapability("automationName", "Appium");

        capabilities.setCapability("app","\"C:\\Users\\david\\Downloads\\org.wikipedia.apk");

        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);





    }



 @AfterSuite

    public void tearDown(){

        driver.quit();

    }
}
