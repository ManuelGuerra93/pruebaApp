package pageobjects;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class MenuPage extends util {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home\"]") private AndroidElement btnHome;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"WebView\"]") private AndroidElement btnWebView;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Login\"]") private AndroidElement btnLogin;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Forms\"]") private AndroidElement btnForms;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Swipe\"]") private AndroidElement btnSwipe;

    public MenuPage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void clicHome(){
        wait.until(ExpectedConditions.elementToBeClickable(btnHome));
        btnHome.click();
    }

    public void clicWebView(){
        wait.until(ExpectedConditions.elementToBeClickable(btnWebView));
        btnWebView.click();
    }

    public void clicLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        btnLogin.click();
    }

    public void clicForms(){
        wait.until(ExpectedConditions.elementToBeClickable(btnForms));
        btnForms.click();
    }

    public void clicSwipe(){
        wait.until(ExpectedConditions.elementToBeClickable(btnSwipe));
        btnSwipe.click();
    }
}
