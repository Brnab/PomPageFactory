Feature: Yo como usuario del banco
  Quiero ser capaz de registrarme en la pagina web
  con el fin de poder realizar consultas

  Scenario: llenado del formulario con todos los campos
    Given dado que me encuentro en la pagina web
    When lleno los campos obligatorios y presiono registrar
    Then el sistema debe crear la cuenta

