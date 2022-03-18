package co.com.sofka.stepdefinition.forms.formRegisterStepDefinition;

import co.com.sofka.model.Register.pageModelRegister;
import co.com.sofka.page.practiceForm.formRegister;
import co.com.sofka.runners.runner.formRegister.formRegisterPage;
import co.com.sofka.stepdefinition.setUp.webUiRegister;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class formRegisterStepDefiniton extends webUiRegister {

    private static final Logger LOGGER = Logger.getLogger(formRegisterPage.class);
    private pageModelRegister PageModelRegister;
    private formRegister FormRegister;
    String Textop;



    @Given("dado que me encuentro en la pagina web")
    public void dado_que_me_encuentro_en_la_pagina_web() {
        try {

            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            PageModelRegister = new pageModelRegister();
            PageModelRegister.setFirstName("Bernabe");
            PageModelRegister.setLastName("Mercado");
            PageModelRegister.setAddress("calle 65 #56-84");
            PageModelRegister.setCity("Medellin");
            PageModelRegister.setState("Antioquia");
            PageModelRegister.setZipCode("50001");
            PageModelRegister.setPhone("3015146039");
            PageModelRegister.setSSN("20032614");
            PageModelRegister.setUserName("Brnab37");
            PageModelRegister.setPassWord("fullclip12");
            PageModelRegister.setConfirmPass("fullclip12");

        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }

    }
    @When("lleno los campos obligatorios y presiono registrar")
    public void lleno_los_campos_obligatorios_y_presiono_registrar() {
        try {

            formRegister  FormRegister = new formRegister(driver,PageModelRegister);
            FormRegister.llenarcampos();
            Textop= FormRegister.Retornar();


        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }


    }
    @Then("el sistema debe crear la cuenta")
    public void el_sistema_debe_crear_la_cuenta() {

        String Mensaje = "Welcome Brnab37";
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(Textop,Mensaje);
        quiteDriver();

    }

}


