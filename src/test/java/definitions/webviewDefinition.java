package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.MenuPage;
import pageobjects.WebViewPage;

public class webviewDefinition {
    MenuPage menu;
    WebViewPage webview;

    public webviewDefinition() {
        menu = new MenuPage();
        webview = new WebViewPage();
    }

    @When("hago clic en el botón WebView")
    public void hagoClicEnElBotónWebView() {
        menu.clicWebView();
    }

    @And("hago clic en el tap Docs")
    public void hagoClicEnElTapDocs() {
        webview.clicTapDocs();
    }

    @And("hago clic en el tap API")
    public void hagoClicEnElTapAPI() {
        webview.clicTapApi();
    }

    @And("hago clic en el tap Help")
    public void hagoClicEnElTapHelp() {
        webview.clicTapHelp();
    }

    @And("hago clic en el tap Versions")
    public void hagoClicEnElTapVersions() {
        webview.clicTapVersions();
    }

    @And("hago clic en el tap Blog")
    public void hagoClicEnElTapBlog() {
        webview.clicTapBlog();
    }

    @And("hago clic en el tap Contribute")
    public void hagoClicEnElTapContribute() {
        webview.clicTapContribute();
    }

    @And("escribo el {string} en la caja de texto de la vista WebView")
    public void escriboElEnLaCajaDeTextoDeLaVistaWebView(String valor) {
        webview.escribirBusqueda(valor);
    }

    @And("hago clic en el botón Buscar de la vista WebView")
    public void hagoClicEnElBotónBuscarDeLaVistaWebView() throws InterruptedException {
        webview.clicBuscar();
        webview.clicXBanner();
    }

    @Then("valido que se visualice la busqueda {string}")
    public void validoQueSeVisualiceLaBusqueda(String valor) {
        webview.validarBusqueda(valor);
    }
}
