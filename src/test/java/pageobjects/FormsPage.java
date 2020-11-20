package pageobjects;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

import java.time.Duration;

public class FormsPage extends util {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Form components']") private AndroidElement lblTitulo;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"text-input\"]") private AndroidElement txtInputField;
    @AndroidFindBy(xpath = "//android.widget.Switch[@content-desc=\"switch\"]") private AndroidElement swpSwitch;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'OFF')]") private AndroidElement txtSwitchOFF;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'ON')]") private AndroidElement txtSwitchON;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Select')]") private AndroidElement cboDropDown;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup") private  AndroidElement btnActive;

    public FormsPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public boolean validarVista(){
        wait.until(ExpectedConditions.visibilityOf(lblTitulo));
        if (lblTitulo.getText().equals("Form components")){
            return true;
        } else {
            return false;
        }
    }

    public void escribirInputField(String input){
        wait.until(ExpectedConditions.visibilityOf(txtInputField));
        txtInputField.sendKeys(input);
    }

    public void activarDesactivarSwitch(String flag){
        wait.until(ExpectedConditions.elementToBeClickable(swpSwitch));
        if (flag.equals("ON") && validarTexto(flag) == true){
            System.out.println("on");
        } else if (flag.equals("ON") && validarTexto(flag) == false){
            swpSwitch.click();
        } else if (flag.equals("OFF") && validarTexto(flag) == true){
            swpSwitch.click();
        } else if (flag.equals("OFF") && validarTexto(flag) == false){
            System.out.println("off");
        } else {
            System.out.println("Algo sucedio");
        }
    }

    public boolean validarTexto(String flag){
        if (txtSwitchON.isDisplayed()){
            return true;
        } else {
            return false;
        }
    }

    public void seleccionarDropDown(String value){
        wait.until(ExpectedConditions.elementToBeClickable(cboDropDown));
        cboDropDown.click();
        AndroidElement lista = (AndroidElement) driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@text,'"+ value +"')]"));
        lista.click();
    }

    public void clicActive(){
        btnActive.click();
    }
}
