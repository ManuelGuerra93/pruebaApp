package definitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class hooks {
    public static AndroidDriver<WebElement> driver;

    @Before
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"NXPDU17828000499");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("appPackage","com.wdiodemoapp");
        capabilities.setCapability("appActivity",".MainActivity");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @After
    public static void tearDown(){
        driver.quit();
    }
}
