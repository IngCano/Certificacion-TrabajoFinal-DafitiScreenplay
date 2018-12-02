package co.com.dafiti.certification.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/co/com/dafiti/certification/features/DafitiRegister.feature",
		glue = "co.com.dafiti.certification.stepdefinitions.DafitiRegisterStepDefinition.java",
		snippets = SnippetType.CAMELCASE,
		tags = "@Register")
public class DafitiRegisterRunner {

}
