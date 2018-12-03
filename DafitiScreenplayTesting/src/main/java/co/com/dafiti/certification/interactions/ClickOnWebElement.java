package co.com.dafiti.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;
import co.com.dafiti.certification.utils.WebElementRandomSelector;

public class ClickOnWebElement implements Interaction{

	private Target theWebElement;
	private WebElementRandomSelector select;
	
	public ClickOnWebElement(Target theWebElement, WebDriver hisBrowser) {
		this.theWebElement = theWebElement;
		select = WebElementRandomSelector.workWith(hisBrowser);
	}
	
	@Override
	public <T extends Actor> void performAs(T jhon) {
		select.randomWebElementInside(theWebElement.getCssOrXPathSelector()).click();
	}

	public static ClickOnWebElement target(Target theWebElement, WebDriver hisBrowser) {
		return instrumented(ClickOnWebElement.class, theWebElement, hisBrowser);
	}

}
