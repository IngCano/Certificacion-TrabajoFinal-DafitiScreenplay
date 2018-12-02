package co.com.dafiti.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DafitiSearchResultPage {
	public static final Target RESULTS_CONTAINER =
			Target.the("Results container").locatedBy(
					"//ul[@id='productsCatalog']");
	
	public static final Target RESULTS_CONTAINER_CONTENTS =
			Target.the("Results container contents").locatedBy(
					"//ul[@id='productsCatalog']/*");
}
