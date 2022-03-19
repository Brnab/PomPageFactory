Feature: Yo como usuario del banco
  Quiero poder comunicarme con el banco
  Para poder manifestarles mis inquietudes y que ellos se comuniquen conmigo

  Scenario: Ingreso correcto de todos los campos
    Given el usuario se encuentra en la pagina para contactarse con el banco
    When el usuario llena todos campos necesarios y presiona enviar
    Then el mensaje debe ser enviado

