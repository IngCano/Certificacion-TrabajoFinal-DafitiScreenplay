package co.com.dafiti.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;

import co.com.dafiti.certification.interactions.ClickOnWebElement;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;
import co.com.dafiti.certification.userinterfaces.DafitiItemPage;
import co.com.dafiti.certification.userinterfaces.DafitiSearchResultPage;
import static co.com.dafiti.certification.utils.Helper.with;

public class Add implements Task{

	private WebDriver hisBrowser;
	
	public Add(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}
	
	@Override
	@Step("{0} adds the item to the shopping cart")
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(
				ClickOnWebElement.target(DafitiSearchResultPage.RESULTS_CONTAINER_CONTENTS, with(hisBrowser)),
				Click.on(DafitiItemPage.SELECT_TALLA),
				Click.on(DafitiItemPage.SELECT_TALLA_OPTION),
				Click.on(DafitiItemPage.ADD_TO_CART_BUTTON),
				Click.on(DafitiHomePage.SHOPPING_CART_BUTTON));
	}

	public static Add anItemToShoppingCart(WebDriver hisBrowser) {
		return instrumented(Add.class, hisBrowser);
	}

}
