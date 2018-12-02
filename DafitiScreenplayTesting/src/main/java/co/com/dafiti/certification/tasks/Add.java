package co.com.dafiti.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.dafiti.certification.interactions.ClickOnWebElement;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;
import co.com.dafiti.certification.userinterfaces.DafitiItemPage;
import co.com.dafiti.certification.userinterfaces.DafitiSearchResultPage;

public class Add implements Task{

	@Override
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(
				ClickOnWebElement.target(DafitiSearchResultPage.RESULTS_CONTAINER_CONTENTS),
				Click.on(DafitiItemPage.SELECT_TALLA),
				Click.on(DafitiItemPage.SELECT_TALLA_OPTION),
				Click.on(DafitiItemPage.ADD_TO_CART_BUTTON),
				Click.on(DafitiHomePage.SHOPPING_CART_BUTTON));
	}

	public static Add anItemToShoppingCart() {
		return instrumented(Add.class);
	}

}
