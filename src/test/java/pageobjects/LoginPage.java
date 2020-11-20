package pageobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class LoginPage extends util {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"input-email\"]") private AndroidElement txtCorreo;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"input-password\"]") private AndroidElement txtPassword;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup") private AndroidElement btnLOGIN;
    @AndroidFindBy(id = "android:id/message") private AndroidElement lblMensaje;
    @AndroidFindBy(id = "android:id/button1") private AndroidElement btnOK;

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void escribirCorreo(String usuario){
        wait.until(ExpectedConditions.visibilityOf(txtCorreo));
        txtCorreo.sendKeys(usuario);
    }

    public void escribirPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(password);
    }

    public void clicBotonLOGIN(){
        wait.until(ExpectedConditions.elementToBeClickable(btnLOGIN));
        btnLOGIN.click();
    }

    public boolean validarMensajePopUp(String mensaje){
        wait.until(ExpectedConditions.visibilityOf(lblMensaje));
        if (mensaje.equals(lblMensaje.getText())){
            return true;
        } else {
            return false;
        }
    }

    public void clicOKPopUp(){
        wait.until(ExpectedConditions.elementToBeClickable(btnOK));
        btnOK.click();
    }
}
