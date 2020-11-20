package support;

import definitions.hooks;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class util extends hooks {
    public static WebDriverWait wait;
    public static Actions actions;
    public static TouchAction touchHere;

    public util() {
        wait = new WebDriverWait(driver,30);
        touchHere = new TouchAction(driver);
    }

    public void Scroll() throws InterruptedException {
        Dimension dimension = driver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.width * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.width * 0.2);

        TouchAction touch = new TouchAction(driver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();
    }

    public void cerrarVentana() throws InterruptedException {
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(992,149)).release().perform();
        Thread.sleep(2000);
    }


}
