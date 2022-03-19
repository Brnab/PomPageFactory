package co.com.sofka.runners.runner.formLogIn;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = { "src/test/resources/formLogIn/formLogIn.feature"},
        glue = "co.com.sofka.stepdefinition.forms.formLogIn"
)
public class formLogIn {
}
