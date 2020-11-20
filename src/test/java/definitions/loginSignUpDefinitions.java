package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.LoginPage;
import pageobjects.MenuPage;
import pageobjects.SignUpPage;

public class loginSignUpDefinitions {
    MenuPage menu;
    LoginPage login;
    SignUpPage signup;

    public loginSignUpDefinitions() {
        menu = new MenuPage();
        login = new LoginPage();
        signup = new SignUpPage();
    }

    @Given("cargar la vista del app")
    public void cargarLaVistaDelApp() throws InterruptedException {
        Thread.sleep(2000);
    }

    @When("hago clic en el botón Login")
    public void hagoClicEnElBotónLogin() {
        menu.clicLogin();
    }

    @And("ingreso el correo {string} en la vista Login")
    public void ingresoElCorreoEnLaVistaLogin(String correo) {
        login.escribirCorreo(correo);
    }

    @And("ingreso el password {string} en la vista Login")
    public void ingresoElPasswordEnLaVistaLogin(String password) {
        login.escribirPassword(password);
    }

    @And("hago clic en el botón Login en la vista Login")
    public void hagoClicEnElBotónLoginEnLaVistaLogin() {
        login.clicBotonLOGIN();
    }

    @Then("se muestra alerta con el mensaje {string}")
    public void seMuestraAlertaConElMensaje(String mensaje) {
        Assert.assertEquals("El mensaje correcto es: "+mensaje,true,login.validarMensajePopUp(mensaje));
    }

    @And("hago clic en el botón OK de la alerta")
    public void hagoClicEnElBotónOKDeLaAlerta() throws InterruptedException {
        login.clicOKPopUp();
        Thread.sleep(6000);
    }

    @And("hago clic en el tap Sign Up en la vista Login")
    public void hagoClicEnElTapSignUpEnLaVistaLogin() {
        signup.clicTapSignUp();
    }

    @And("ingreso el correo {string} en la vista Sign Up")
    public void ingresoElCorreoEnLaVistaSignUp(String correo) {
        signup.escribirCorreo(correo);
    }

    @And("ingreso el password {string} en la vista Sign Up")
    public void ingresoElPasswordEnLaVistaSignUp(String password) {
        signup.escribirPassword(password);
    }

    @And("ingreso la confirmación {string} en la vista Sign Up")
    public void ingresoLaConfirmaciónEnLaVistaSignUp(String confirmar) {
        signup.escribirConfirmarPassword(confirmar);
    }

    @And("hago clic en el botón Sign Up en la vista Sign Up")
    public void hagoClicEnElBotónSignUpEnLaVistaSignUp() {
        signup.clicSignUp();
    }
}
