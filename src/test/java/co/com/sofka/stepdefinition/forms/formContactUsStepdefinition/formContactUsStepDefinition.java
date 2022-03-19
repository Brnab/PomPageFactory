package co.com.sofka.stepdefinition.forms.formContactUsStepdefinition;


import co.com.sofka.model.contacUS.pageModelContactUs;
import co.com.sofka.page.practiceForm.formContacUs;
import co.com.sofka.stepdefinition.setUp.webUiContactUs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class formContactUsStepDefinition extends webUiContactUs{

        private static final Logger LOGGER = Logger.getLogger(formContacUs.class);
        private pageModelContactUs PageModelContactUs;
        private formContacUs FormContactUs;
        String Texto;
        String Texto2;
        String Mensaje = "Customer Care";
        String Mensaje2 = "Message is required.";


    @Given("el usuario se encuentra en la pagina para contactarse con el banco")
    public void el_usuario_se_encuentra_en_la_pagina_para_contactarse_con_el_banco() {

        try {
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            PageModelContactUs = new pageModelContactUs();
            PageModelContactUs.setName("Bernabe");
            PageModelContactUs.setEmail("brrabas@hotmail.com");
            PageModelContactUs.setPhone("123456");
            PageModelContactUs.setMessage("No me gusta el servicio que estan dando");


        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }


    }
    @When("el usuario llena todos campos necesarios y presiona enviar")
    public void el_usuario_llena_todos_campos_necesarios_y_presiona_enviar() {

        try {
            formContacUs FormContacUs = new formContacUs(driver,PageModelContactUs);
            FormContacUs.llenarcampos();
            Texto= PageModelContactUs.getTexto();

        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }


    }
    @Then("el mensaje debe ser enviado")
    public void el_mensaje_debe_ser_enviado() {
        // Write code here that turns the phrase above into concrete actions
        Assertions.assertEquals(Texto,Mensaje);
        quiteDriver();

    }



    @Given("el usuario esta en la pagina para contactarse")
    public void el_usuario_esta_en_la_pagina_para_contactarse() {
        try {
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            PageModelContactUs = new pageModelContactUs();
            PageModelContactUs.setName("Bernabe");
            PageModelContactUs.setEmail("brrabas@hotmail.com");
            PageModelContactUs.setPhone("123456");
            PageModelContactUs.setMessage("");


        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }

    }
    @When("el usuario no llena el mensaje a enviar")
    public void el_usuario_no_llena_el_mensaje_a_enviar() {
        try {
            formContacUs FormContacUs = new formContacUs(driver,PageModelContactUs);
            FormContacUs.llenarcampos2();
            Texto2= PageModelContactUs.getTexto2();

        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }


    }
    @Then("el sistema debe pedir que se escriba un mensaje")
    public void el_sistema_debe_pedir_que_se_escriba_un_mensaje() {

        Assertions.assertEquals(Texto2,Mensaje2);
        quiteDriver();

    }
}
