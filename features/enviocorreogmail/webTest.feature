@WEB_TEST_PRUEBA
Feature: LOGIN_CUENTA
  Como usuario de Gmail
  Quiero Logearme a mi cuenta Gmail
  Para  comprobar de que este Test funciona

  Background:
    Given Cargar la pagina de Login
   # And Dar click en opcion Iniciar Sesion

  Scenario Outline: Poc de prueba automatiza - version 1
    Given Que inicio sesion con mis credenciales: "<user>" y "<password>"
    When Estoy en el home doy click en redactar
    And Ingresar datos del mensaje: "<receptor>","<asunto>" y "<mensaje>"
    #Then Validar si se logea correctamente

    Examples:
      | user                     | password   | receptor                 | asunto  | mensaje    |
      | eysson.pruebas@gmail.com | rusia_2020 | eysson.pruebas@gmail.com | Mensaje | Ya terminé |


