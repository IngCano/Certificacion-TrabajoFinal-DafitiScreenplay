package co.com.dafiti.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

import co.com.dafiti.certification.userinterfaces.DafitiShoppingCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheDafitiShoppingCart implements Question<String>{

	@Override
	public String answeredBy(Actor jhon) {
		return valueOf(DafitiShoppingCartPage.ADDED_PRODUCTS_TO_CART_TEXT).answeredBy(jhon).getTextValue();
	}

	public static TheDafitiShoppingCart element() {
		return new TheDafitiShoppingCart();
	}

}
