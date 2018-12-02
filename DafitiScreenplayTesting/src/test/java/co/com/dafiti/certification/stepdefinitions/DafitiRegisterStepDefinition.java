package co.com.dafiti.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.GivenWhenThen.then;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.dafiti.certification.models.DafitiRegisterUserModel;
import co.com.dafiti.certification.tasks.Navigate;
import co.com.dafiti.certification.tasks.OpenTheBrowser;
import co.com.dafiti.certification.tasks.Register;
import co.com.dafiti.certification.userinterfaces.DafitiRegisterPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class DafitiRegisterStepDefinition {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor jhon = Actor.named("Jhon");
	
	private DafitiRegisterPage dafitiRegisterPage;
	
	@Before
	public void setUp() {
		givenThat(jhon).can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Jhon is in the Dafiti register page$")
	public void thatJhonIsInTheDafitiRegisterPage() throws Exception {
		givenThat(jhon).wasAbleTo(
				OpenTheBrowser.on(dafitiRegisterPage),
				Navigate.toTheDafitiRegisterPage());
	}

	@When("^he submits all the data entered$")
	public void heSubmitsAllTheDataEntered(List<DafitiRegisterUserModel> hisData) throws Exception {
		when(jhon).attemptsTo(Register.with(hisData));
	}

	@Then("^he should see the Dafiti success registry page$")
	public void heShouldSeeTheDafitiSuccessRegistryPage() throws Exception {

	}

}
