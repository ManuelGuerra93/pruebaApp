package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.FormsPage;
import pageobjects.MenuPage;

import javax.swing.*;

public class formsDefinition {
    MenuPage menu;
    FormsPage forms;

    public formsDefinition() {
        menu = new MenuPage();
        forms = new FormsPage();
    }

    @When("hago clic en el botón Forms")
    public void hagoClicEnElBotónForms() {
        menu.clicForms();
    }

    @Then("se muestra la vista Forms")
    public void seMuestraLaVistaForms() {
        Assert.assertEquals("El titulo es incorrecto",true,forms.validarVista());
    }

    @And("escribo en Input field {string} en la vista Forms")
    public void escriboEnInputFieldEnLaVistaForms(String input) {
        forms.escribirInputField(input);
    }

    @And("hago clic en el switch {string} en la vista Forms")
    public void hagoClicEnElSwitchEnLaVistaForms(String flag) {
        forms.activarDesactivarSwitch(flag);
    }

    @And("selecciono un Dropdown {string} en la vista Forms")
    public void seleccionoUnDropdownEnLaVistaForms(String lista) {
        forms.seleccionarDropDown(lista);
    }

    @And("hago clic en el botón Active en la vista Forms")
    public void hagoClicEnElBotónActiveEnLaVistaForms() throws InterruptedException {
        forms.Scroll();
        forms.clicActive();
    }

}
