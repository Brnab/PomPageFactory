package co.com.sofka.runners.runner.formRegister;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = { "src/test/resources/features/formRegister/formRegister.feature"},
        glue = "co.com.sofka.stepdefinition.forms.formRegisterStepDefinition"
)

public class formRegisterPageCucumber {

}
