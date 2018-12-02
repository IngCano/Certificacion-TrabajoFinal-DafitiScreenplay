package co.com.dafiti.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DafitiShoppingCartPage {
	public static final Target ADDED_PRODUCTS_TO_CART_TEXT =
			Target.the("Added products to cart text").locatedBy(
					"//p[@class='cartTitle qtyCart']");
}
