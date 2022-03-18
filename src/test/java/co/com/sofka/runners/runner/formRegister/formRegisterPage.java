package co.com.sofka.runners.runner.formRegister;

import co.com.sofka.model.Register.pageModelRegister;
import co.com.sofka.page.practiceForm.formRegister;
import co.com.sofka.stepdefinition.setUp.webUiRegister;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class formRegisterPage extends webUiRegister {
    private static final Logger LOGGER = Logger.getLogger(formRegisterPage.class);
    private pageModelRegister PageModelRegister;


    @BeforeEach
    public void setUP(){

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
            PageModelRegister.setUserName("Brnab245");
            PageModelRegister.setPassWord("fullclip12");
            PageModelRegister.setConfirmPass("fullclip12");


        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.error(exception.getMessage(), exception);
        }


    }

    @Test
    public void formRegisterPageFill(){

    try {

        formRegister  FormRegister = new formRegister(driver,PageModelRegister);
        FormRegister.llenarcampos();


    } catch (Exception exception){
        quiteDriver();
        Assertions.fail(exception.getMessage(), exception);
        LOGGER.error(exception.getMessage(), exception);
        }
    }

    @AfterEach
    public void tearDown(){
        quiteDriver();
    }




}
