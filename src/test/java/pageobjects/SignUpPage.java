package pageobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class SignUpPage extends util {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView\n")
    private AndroidElement tapSignUp;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"input-email\"]")
    private AndroidElement txtCorreo;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"input-password\"]")
    private AndroidElement txtPassword;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"input-repeat-password\"]")
    private AndroidElement txtConfirmarPassword;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"button-SIGN UP\"]/android.view.ViewGroup")
    private AndroidElement btnSignUp;
    @AndroidFindBy(id = "android:id/message") private AndroidElement lblMensaje;
    @AndroidFindBy(id = "android:id/button1") private AndroidElement btnOK;

    public SignUpPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void clicTapSignUp(){
        wait.until(ExpectedConditions.elementToBeClickable(tapSignUp));
        tapSignUp.click();
    }

    public void escribirCorreo(String correo){
        wait.until(ExpectedConditions.visibilityOf(txtCorreo));
        txtCorreo.sendKeys(correo);
    }

    public void escribirPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(txtPassword));
        txtPassword.sendKeys(password);
    }

    public void escribirConfirmarPassword(String confirmarPassword){
        wait.until(ExpectedConditions.visibilityOf(txtConfirmarPassword));
        txtConfirmarPassword.sendKeys(confirmarPassword);
    }

    public void clicSignUp(){
        wait.until(ExpectedConditions.elementToBeClickable(btnSignUp));
        btnSignUp.click();
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
