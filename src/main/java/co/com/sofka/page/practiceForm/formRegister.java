package co.com.sofka.page.practiceForm;

import co.com.sofka.page.common.actionOnPages;
import co.com.sofka.model.Register.pageModelRegister;
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



    public formRegister(WebDriver driver, pageModelRegister pageModelRegister) {
        super(driver);
        pageFactoryInitElement(driver, this);
        this.pageModelRegister = pageModelRegister;
    }

    // funcionalidades de la pagina
public void llenarcampos() throws InterruptedException {
    scrollOn(firstName);
    clickOn(firstName);
    clearOn(firstName);
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


}










}
