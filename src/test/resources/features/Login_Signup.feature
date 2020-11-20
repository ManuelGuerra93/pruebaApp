@Todo
Feature: Login y Signup del usuario
  Como usuario necesito poder realizar Login y Signup en el app

  @Login
  Scenario Outline: Login del usuario
    Given cargar la vista del app
    When hago clic en el botón Login
    And ingreso el correo "<email>" en la vista Login
    And ingreso el password "<password>" en la vista Login
    And hago clic en el botón Login en la vista Login
    Then se muestra alerta con el mensaje "<mensaje>"
    And hago clic en el botón OK de la alerta

    Examples:
      | email             | password | mensaje            |
      | manu100@gmail.com | 12345678 | You are logged in! |

  @SignUp
  Scenario Outline: SignUp del usuario
    Given cargar la vista del app
    When hago clic en el botón Login
    And hago clic en el tap Sign Up en la vista Login
    And ingreso el correo "<email>" en la vista Sign Up
    And ingreso el password "<password>" en la vista Sign Up
    And ingreso la confirmación "<confirmarPassword>" en la vista Sign Up
    And hago clic en el botón Sign Up en la vista Sign Up
    Then se muestra alerta con el mensaje "<mensaje>"
    And hago clic en el botón OK de la alerta

    Examples:
      | email             | password | confirmarPassword | mensaje                     |
      | manu100@gmail.com | 12345678 | 12345678          | You successfully signed up! |