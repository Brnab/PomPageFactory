package co.com.sofka.page.practiceForm;

import co.com.sofka.model.Register.pageModelRegister;
import co.com.sofka.page.common.actionOnPages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class formRegister extends actionOnPages {
    private static final Logger LOGGER = Logger.getLogger(formRegister.class);
    private  pageModelRegister pageModelRegister;


    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;


    @FindBy(id = "customer.address.street")
    private WebElement address;

    @FindBy(id = "customer.address.city")
    private WebElement city;

    @FindBy(id = "customer.address.state")
    private WebElement state;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement phone;

    @FindBy(id = "customer.ssn")
    private WebElement ssn;

    @FindBy(id = "customer.username")
    private WebElement userName;

    @FindBy(id = "customer.password")
    private WebElement passWord;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPass;

    @FindBy(xpath = "//input[@value='Register']")
    private WebElement register;

    @FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
    private WebElement text;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[12]/td[3]/span[1]")
    private WebElement text2;



    public formRegister(WebDriver driver, pageModelRegister pageModelRegister) {
        super(driver, 10, true);
        pageFactoryInitElement(driver, this);
        this.pageModelRegister = pageModelRegister;
    }

    // funcionalidades de la pagina
    public void llenarcampos() throws InterruptedException {
    scrollOn(firstName);
    withExplicitWaitClickOn(firstName);
    withExplicitWaitClearOn(firstName);
    typeOn(firstName, pageModelRegister.getFirstName());

    scrollOn(lastName);
    clickOn(lastName);
    clearOn(lastName);

    typeOn(lastName, pageModelRegister.getLastName());


    scrollOn(address);
    clearOn(address);
    typeOn(address, pageModelRegister.getAddress());


    scrollOn(city);
    clearOn(city);
    typeOn(city, pageModelRegister.getCity());

    scrollOn(state);
    clearOn(state);
    typeOn(state, pageModelRegister.getCity());


    scrollOn(zipCode);
    clearOn(zipCode);
    typeOn(zipCode, pageModelRegister.getZipCode());

    scrollOn(phone);
    clearOn(phone);
    typeOn(phone, pageModelRegister.getPhone());

    scrollOn(ssn);
    clearOn(ssn);
    typeOn(ssn, pageModelRegister.getSSN());

    scrollOn(userName);
    clearOn(userName);
    typeOn(userName, pageModelRegister.getUserName());


    scrollOn(passWord);
    clearOn(passWord);
    typeOn(passWord, pageModelRegister.getPassWord());


    scrollOn(confirmPass);
    clearOn(confirmPass);
    typeOn(confirmPass, pageModelRegister.getConfirmPass());


    doSubmit(register);
        scrollOn(text);
        pageModelRegister.setTexto(getText(text));




}

    public void llenarcampos2() throws InterruptedException {
        scrollOn(firstName);
        withExplicitWaitClickOn(firstName);
        withExplicitWaitClearOn(firstName);
        typeOn(firstName, pageModelRegister.getFirstName());

        scrollOn(lastName);
        clickOn(lastName);
        clearOn(lastName);

        typeOn(lastName, pageModelRegister.getLastName());


        scrollOn(address);
        clearOn(address);
        typeOn(address, pageModelRegister.getAddress());


        scrollOn(city);
        clearOn(city);
        typeOn(city, pageModelRegister.getCity());

        scrollOn(state);
        clearOn(state);
        typeOn(state, pageModelRegister.getCity());


        scrollOn(zipCode);
        clearOn(zipCode);
        typeOn(zipCode, pageModelRegister.getZipCode());

        scrollOn(phone);
        clearOn(phone);
        typeOn(phone, pageModelRegister.getPhone());

        scrollOn(ssn);
        clearOn(ssn);
        typeOn(ssn, pageModelRegister.getSSN());

        scrollOn(userName);
        clearOn(userName);
        typeOn(userName, pageModelRegister.getUserName());


        scrollOn(passWord);
        clearOn(passWord);
        typeOn(passWord, pageModelRegister.getPassWord());


        scrollOn(confirmPass);
        clearOn(confirmPass);
        typeOn(confirmPass, pageModelRegister.getConfirmPass());


        doSubmit(register);
        scrollOn(text2);
        pageModelRegister.setTexto2(getText(text2));

    }



}
