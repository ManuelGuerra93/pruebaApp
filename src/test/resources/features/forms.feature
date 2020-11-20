@Todo
Feature: Forms
  Como usuario deseo poder activar en la sección forms

  @Activar
  Scenario Outline: Activar en forms
    Given cargar la vista del app
    When hago clic en el botón Forms
    Then se muestra la vista Forms
    And escribo en Input field "<input>" en la vista Forms
    And hago clic en el switch "<switch>" en la vista Forms
    And selecciono un Dropdown "<dropdown>" en la vista Forms
    And hago clic en el botón Active en la vista Forms
    Then se muestra alerta con el mensaje "<mensaje>"
    And hago clic en el botón OK de la alerta

    Examples:
      | input | switch | dropdown          | mensaje               |
      | Manu  | OFF    | Appium is awesome | This button is active |