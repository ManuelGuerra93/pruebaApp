@Todo
Feature: Buscar y navegar en WebView
  Como usuario deseo poder buscar y navegar en WebView

  @Busqueda
  Scenario Outline: Buscar en webview
    Given cargar la vista del app
    When hago clic en el botón WebView
    And escribo el "<busqueda>" en la caja de texto de la vista WebView
    And hago clic en el botón Buscar de la vista WebView
    Then valido que se visualice la busqueda "<busqueda>"

    Examples:
      | busqueda |
      | browser  |

  @Navegacion
  Scenario: Navegar en webview
    Given cargar la vista del app
    When hago clic en el botón WebView
    And hago clic en el tap Docs
    And hago clic en el tap API
    And hago clic en el tap Help
    And hago clic en el tap Versions
    And hago clic en el tap Blog
    And hago clic en el tap Contribute