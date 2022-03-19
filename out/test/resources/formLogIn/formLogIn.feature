Feature: Yo como usuario del banco
  Quiero poder ingresar a mi cuenta
  Para poder consultar mis transacciones

  Scenario: Ingreso exitoso a la pagina
    Given el usuario esta en la pagina de inicio de sesion
    When el usuario ingresa correctamente sus credenciales
    Then deberia ingresar a su cuenta en el banco

    Scenario: Ingreso invalido a la pagina
      Given el usuario se encuentra en la pagina para iniciar sesion
      When el usuario ingresa de manera incorrecta sus credenciales
      Then el sistema deberia indicar el error
