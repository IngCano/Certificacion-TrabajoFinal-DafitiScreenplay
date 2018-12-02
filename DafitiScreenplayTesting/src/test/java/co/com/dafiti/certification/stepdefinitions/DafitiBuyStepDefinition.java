package co.com.dafiti.certification.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.dafiti.certification.exceptions.ItemNotAdded;
import static co.com.dafiti.certification.exceptions.ItemNotAdded.getItemNotAddedMessage;
import co.com.dafiti.certification.exceptions.SearchNotSuccessful;
import co.com.dafiti.certification.models.DafitiKeywordModel;

import static co.com.dafiti.certification.exceptions.SearchNotSuccessful.getSearchNotSuccessfulMessage;
import co.com.dafiti.certification.questions.TheDafitiSearchResultsElement;
import co.com.dafiti.certification.questions.TheDafitiShoppingCart;
import co.com.dafiti.certification.tasks.Add;
import co.com.dafiti.certification.tasks.OpenTheBrowser;
import co.com.dafiti.certification.tasks.Search;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class DafitiBuyStepDefinition {
	
	@Managed(driver = "chrome")
	public static WebDriver hisBrowser;
	
	Actor jhon = Actor.named("Jhon");
	
	private DafitiHomePage dafitiHomePage;
	
	@Before
	public void setUp() {
		givenThat(jhon).can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that jhon wants to buy an item$")
	public void thatJhonWantsToBuyAnItem() throws Exception {
		givenThat(jhon).wasAbleTo(OpenTheBrowser.on(dafitiHomePage));
	}

	@When("^he searchs for the item$")
	public void heSearchsForTheItem(List<DafitiKeywordModel> keyword) throws Exception {
		when(jhon).attemptsTo(Search.forThe(keyword));
	}

	@Then("^he should be able to see the search results$")
	public void heShouldBeAbleToSeeTheSearchResults() throws Exception {
		then(jhon).should(seeThat(TheDafitiSearchResultsElement.isVisible())
				.orComplainWith(SearchNotSuccessful.class, getSearchNotSuccessfulMessage()));
	}

	@When("^he adds the item to the shopping cart$")
	public void heAddsTheItemToTheShoppingCart() throws Exception {
		when(jhon).attemptsTo(Add.anItemToShoppingCart());
	}

	@Then("^he should be able to see the item in the shoping cart$")
	public void heShouldBeAbleToSeeTheItemInTheShopingCart(List<DafitiKeywordModel> elementText) throws Exception {
		then(jhon).should(seeThat(TheDafitiShoppingCart.element(), is(elementText.get(0).getKeyword()))
				.orComplainWith(ItemNotAdded.class, getItemNotAddedMessage()));
	}
}
