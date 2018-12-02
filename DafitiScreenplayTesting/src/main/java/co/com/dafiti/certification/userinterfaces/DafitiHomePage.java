package co.com.dafiti.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.dafiti.com.co/")
public class DafitiHomePage extends PageObject{
	
	public static final Target CLOSE_OFFERT_BUTTON =
			Target.the("Close Offert Button").locatedBy(
					"//*[local-name()='svg']//*[local-name()='line']");
	
	public static final Target LOGIN_REGISTER_BUTTON =
			Target.the("Login register Button").locatedBy("//span[@class='text']");
	
	public static final Target WELCOME_USER_ELEMENT =
			Target.the("Welcome user element").locatedBy(
					"//a[@id='LoginInfoTag']//span[@class='text']");
	
	public static final Target SEARCH_BAR =
			Target.the("Search bar").locatedBy(
					"//input[@id='searchInput']");
	
	public static final Target SEARCH_BUTTON =
			Target.the("Search button").locatedBy(
					"//form[@id='search']/button[1]");
	
	public static final Target SHOPPING_CART_BUTTON =
			Target.the("Shopping cart button").locatedBy(
					"//span[@class='icon icon-cart']");
}
