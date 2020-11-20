package pageobjects;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class WebViewPage extends util {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Docs']") private AndroidElement tapDocs;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='API']") private AndroidElement tapApi;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Help']") private AndroidElement tapHelp;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Versions']") private AndroidElement tapVersions;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Blog']") private AndroidElement tapBlog;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contribute']") private AndroidElement tapContribute;
    @AndroidFindBy(xpath = "//android.view.View[7]") private AndroidElement txtBuscar;
    @AndroidFindBy(xpath = "//android.widget.EditText") private AndroidElement txtBuscar2;
    @AndroidFindBy(xpath = "//android.widget.ListView[@resource-id=\"algolia-autocomplete-listbox-0\"]") private AndroidElement lstBusqueda;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='x']") private AndroidElement btnX;
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'browser')]") private AndroidElement lblBusqueda;

    public WebViewPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void clicTapDocs(){
        wait.until(ExpectedConditions.elementToBeClickable(tapDocs));
        tapDocs.click();
    }

    public void clicTapApi(){
        wait.until(ExpectedConditions.elementToBeClickable(tapApi));
        tapApi.click();
    }

    public void clicTapHelp(){
        wait.until(ExpectedConditions.elementToBeClickable(tapHelp));
        tapHelp.click();
    }

    public void clicTapVersions(){
        wait.until(ExpectedConditions.elementToBeClickable(tapVersions));
        tapVersions.click();
    }

    public void clicTapBlog(){
        wait.until(ExpectedConditions.elementToBeClickable(tapBlog));
        tapBlog.click();
    }

    public void clicTapContribute(){
        wait.until(ExpectedConditions.elementToBeClickable(tapContribute));
        tapContribute.click();
    }

    public void escribirBusqueda(String valor){
        wait.until(ExpectedConditions.elementToBeClickable(txtBuscar));
        txtBuscar.click();
        txtBuscar2.sendKeys(valor);
    }

    public void clicBuscar() {
        wait.until(ExpectedConditions.elementToBeClickable(lstBusqueda));
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(300,700)).release().perform();
    }

    public void clicXBanner(){
        wait.until(ExpectedConditions.elementToBeClickable(btnX));
        btnX.click();
    }

    public void validarBusqueda(String busqueda){
        wait.until(ExpectedConditions.visibilityOf(lblBusqueda));
        if (lblBusqueda.isDisplayed()){
            return;
        } else {
            System.out.println("No se encontró: "+busqueda);
        }
    }
}
