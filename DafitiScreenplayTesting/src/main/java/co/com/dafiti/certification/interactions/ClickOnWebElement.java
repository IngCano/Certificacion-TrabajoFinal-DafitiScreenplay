package co.com.dafiti.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.dafiti.certification.stepdefinitions.DafitiBuyStepDefinition;
import co.com.dafiti.certification.utils.WebElementRandomSelector;

public class ClickOnWebElement implements Interaction{

	private Target theWebElement;
	private WebElementRandomSelector select;
	
	public ClickOnWebElement(Target theWebElement) {
		this.theWebElement = theWebElement;
		select = WebElementRandomSelector.workWith(DafitiBuyStepDefinition.hisBrowser);
	}
	
	@Override
	public <T extends Actor> void performAs(T jhon) {
		select.randomWebElementInside(theWebElement.getCssOrXPathSelector()).click();
	}

	public static ClickOnWebElement target(Target theWebElement) {
		return instrumented(ClickOnWebElement.class, theWebElement);
	}

}
