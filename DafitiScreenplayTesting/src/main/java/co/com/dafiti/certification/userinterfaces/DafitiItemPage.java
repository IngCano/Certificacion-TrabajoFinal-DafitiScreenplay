package co.com.dafiti.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DafitiItemPage {
	public static final Target SELECT_TALLA =
			Target.the("Select talla").locatedBy(
					"//div[@id='mainSizeSelector']//div[@class='selectSize mbs loaded']//div[@class='selectContainer']");
	
	public static final Target SELECT_TALLA_OPTION =
			Target.the("Select talla").locatedBy(
					"//div[@id='mainSizeSelector']//div[@class='selectSize mbs loaded']/ul[1]/li[2]");
	
	public static final Target ADD_TO_CART_BUTTON =
			Target.the("Add to cart button").locatedBy(
					"//div[@class='prd-checkout mtm mbm']//button[@id='AddToCart']");
}
