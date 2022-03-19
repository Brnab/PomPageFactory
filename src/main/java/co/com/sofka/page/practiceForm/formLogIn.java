package co.com.sofka.page.practiceForm;

import co.com.sofka.model.logIn.pageModellogIn;
import co.com.sofka.page.common.actionOnPages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class formLogIn extends actionOnPages {
    private static final Logger LOGGER = Logger.getLogger(formLogIn.class);
    private pageModellogIn pageModellogIn;
    public String Texto;

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")
    private WebElement login;


    @FindBy(xpath = "//h1[contains(text(),'Accounts Overview')]")
    private WebElement text;
    @FindBy(xpath = "//h1[contains(text(),'Error!')]")
    private WebElement text2;



    public formLogIn(WebDriver driver, pageModellogIn pageModellogIn) {
        super(driver, 10, true);
        pageFactoryInitElement(driver, this);
        this.pageModellogIn = pageModellogIn;
    }


    public void llenarcampos() throws InterruptedException {
        scrollOn(username);
        withExplicitWaitClickOn(username);
        withExplicitWaitClearOn(username);
        typeOn(username, pageModellogIn.getUserName());

        scrollOn(password);
        clickOn(password);
        clearOn(password);
        typeOn(password, pageModellogIn.getPassWord());


        doSubmit(login);
        scrollOn(text);
        pageModellogIn.setTexto(getText(text));


    }


    public void llenarcampos2() throws InterruptedException {
        scrollOn(username);
        withExplicitWaitClickOn(username);
        withExplicitWaitClearOn(username);
        typeOn(username, pageModellogIn.getUserName());

        scrollOn(password);
        clickOn(password);
        clearOn(password);
        typeOn(password, pageModellogIn.getPassWord());


        doSubmit(login);
        scrollOn(text2);
        pageModellogIn.setTexto2(getText(text2));


    }








}
