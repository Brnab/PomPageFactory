package co.com.sofka.runners.runner.formContact;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = { "src/test/resources/formContactUs/formContactUs.feature"},
        glue = "co.com.sofka.stepdefinition.forms.formContactUsStepdefinition"
)
public class formContactCucumber {

}
