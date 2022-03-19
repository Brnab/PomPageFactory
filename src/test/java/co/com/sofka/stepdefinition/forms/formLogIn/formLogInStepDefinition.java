package co.com.sofka.stepdefinition.forms.formLogIn;

import co.com.sofka.model.logIn.pageModellogIn;
import co.com.sofka.page.practiceForm.formLogIn;
import co.com.sofka.stepdefinition.setUp.webUILogIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class formLogInStepDefinition extends webUILogIn {
    private static final Logger LOGGER = Logger.getLogger(formLogInStepDefinition.class);
    private pageModellogIn PageModellogIn;
    private formLogIn FormLogIn;
    String Texto;
    String Texto2;
    String Mensaje = "Accounts Overview";
    String MensajeFail= "Error!";




    @Given("el usuario esta en la pagina de inicio de sesion")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion() {

        try {

            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            PageModellogIn = new pageModellogIn();
            PageModellogIn.setUserName("Brnab245");
            PageModellogIn.setPassWord("fullclip12");
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }

    }
    @When("el usuario ingresa correctamente sus credenciales")
    public void el_usuario_ingresa_correctamente_sus_credenciales() {
        try {

            formLogIn FormLogIn = new formLogIn(driver,PageModellogIn);
            FormLogIn.llenarcampos();
            Texto= PageModellogIn.getTexto();

        }catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }
    }
    @Then("deberia ingresar a su cuenta en el banco")
    public void deberia_ingresar_a_su_cuenta_en_el_banco() {
        Assertions.assertEquals(Texto,Mensaje);
        quiteDriver();
    }



    @Given("el usuario se encuentra en la pagina para iniciar sesion")
    public void el_usuario_se_encuentra_en_la_pagina_para_iniciar_sesion() {

        try {

            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            PageModellogIn = new pageModellogIn();
            PageModellogIn.setUserName("Brnab");
            PageModellogIn.setPassWord("");
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }

    }
    @When("el usuario ingresa de manera incorrecta sus credenciales")
    public void el_usuario_ingresa_de_manera_incorrecta_sus_credenciales() {

        try {

            formLogIn FormLogIn = new formLogIn(driver,PageModellogIn);
            FormLogIn.llenarcampos2();

            Texto2= PageModellogIn.getTexto2();

        }catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }


    }
    @Then("el sistema deberia indicar el error")
    public void el_sistema_deberia_indicar_el_error() {
        Assertions.assertEquals(Texto2,MensajeFail);
        quiteDriver();

    }

}



