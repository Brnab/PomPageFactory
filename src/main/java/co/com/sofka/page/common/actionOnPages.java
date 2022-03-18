package co.com.sofka.page.common;


import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class actionOnPages {

    private static final Logger LOGGER = Logger.getLogger(actionOnPages.class);
    private static final String WEBDRIVER_NULL_MESSAGE = "\nWARNING!\n\rThe Webdriver is null, please check it.\n";
    private WebDriver driver;

    //Constructor
    public actionOnPages() {
        //Constructor por defecto.
    }
    public actionOnPages(WebDriver driver) {
        try{
            if(driver == null)
                LOGGER.warn(WEBDRIVER_NULL_MESSAGE);

            this.driver = driver;

        } catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }


    // inicializacion de POM con page factory
    protected void pageFactoryInitElement(WebDriver driver, Object page){
        PageFactory.initElements(driver, page);
    }


    //funcionalidades
    protected void clearOn(WebElement webElement){
        webElement.clear();
    }
    protected void clickOn(WebElement webElement){  webElement.click(); }

    protected void typeOn(WebElement webElement, CharSequence... keysToSend){
        webElement.sendKeys(keysToSend);
    }
    protected void scrollOn(WebElement webElement){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].scrollIntoView();", webElement);
    }

    protected void doSubmit(WebElement webElement){
        webElement.submit();
    }


}
