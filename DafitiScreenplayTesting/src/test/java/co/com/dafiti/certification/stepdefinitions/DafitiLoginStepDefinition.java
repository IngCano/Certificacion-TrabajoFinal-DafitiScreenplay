package co.com.dafiti.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;

import static co.com.dafiti.certification.exceptions.UnableToLogin.getUnableToLoginMessage;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.dafiti.certification.exceptions.UnableToLogin;
import co.com.dafiti.certification.models.DafitiUserModel;
import co.com.dafiti.certification.questions.TheDafitiLoginResultElement;
import co.com.dafiti.certification.tasks.Login;
import co.com.dafiti.certification.tasks.Navigate;
import co.com.dafiti.certification.tasks.OpenTheBrowser;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class DafitiLoginStepDefinition {
	
	@Managed(driver = "chrome")
	public static WebDriver hisBrowser;
	
	private Actor jhon = Actor.named("Jhon");
	
	private DafitiHomePage dafitiHomePage;
	
	@Before
	public void setUp() {
		givenThat(jhon).can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that jhon wants to login into dafiti$")
	public void thatJhonWantsToLoginIntoDafiti() throws Exception {
		givenThat(jhon).wasAbleTo(
				OpenTheBrowser.on(dafitiHomePage),
				Navigate.toTheDafitiLoginPage());
	}
	
	@When("^he enters his credentials$")
	public void heEntersHisCredentials(List<DafitiUserModel> hisCredentials) throws Exception {
	    when(jhon).attemptsTo(Login.with(hisCredentials));
	}

	@Then("^he should be able to see the logged in message$")
	public void heShouldBeAbleToSeeTheLoggedInMessage() throws Exception {
		then(jhon).should(
				seeThat(TheDafitiLoginResultElement.isVisible())
				.orComplainWith(UnableToLogin.class, getUnableToLoginMessage()));
	}

}
