package co.com.dafiti.certification.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/co/com/dafiti/certification/features/DafitiLogin.feature",
		glue = "co.com.dafiti.certification.stepdefinitions",
		snippets = SnippetType.CAMELCASE,
		tags = "@Login")
public class DafitiLoginRunner {

}
