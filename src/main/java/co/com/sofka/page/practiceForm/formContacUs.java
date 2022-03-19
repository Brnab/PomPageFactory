package co.com.sofka.page.practiceForm;

import co.com.sofka.model.contacUS.pageModelContactUs;
import co.com.sofka.page.common.actionOnPages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class formContacUs extends actionOnPages {
    private static final Logger LOGGER = Logger.getLogger(formContacUs.class);
    private pageModelContactUs pageModelContactUs;
    public String Texto;

    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "email")
    private WebElement email;


    @FindBy(id = "phone")
    private WebElement phone;


    @FindBy(id = "message")
    private WebElement message;

    @FindBy(xpath = "//tbody/tr[5]/td[2]/input[1]")
    private WebElement submit;

    @FindBy(xpath = "//h1[contains(text(),'Customer Care')]")
    private WebElement text;


    public formContacUs(WebDriver driver, pageModelContactUs pageModelContactUs) {
        super(driver, 10, true);
        pageFactoryInitElement(driver, this);
        this.pageModelContactUs = pageModelContactUs;
    }


    public void llenarcampos() throws InterruptedException {
        scrollOn(name);
        withExplicitWaitClickOn(name);
        withExplicitWaitClearOn(name);
        typeOn(name, pageModelContactUs.getName());

        scrollOn(email);
        clickOn(email);
        clearOn(email);
        typeOn(email, pageModelContactUs.getEmail());


        scrollOn(phone);
        clickOn(phone);
        clearOn(phone);
        typeOn(phone, pageModelContactUs.getPhone());

        scrollOn(message);
        clickOn(message);
        clearOn(message);
        typeOn(message, pageModelContactUs.getMessage());

        doSubmit(submit);


            scrollOn(text);
            pageModelContactUs.setTexto(getText(text));


    }


}
