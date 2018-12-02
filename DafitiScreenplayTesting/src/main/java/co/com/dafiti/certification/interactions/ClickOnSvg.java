package co.com.dafiti.certification.interactions;

import org.openqa.selenium.interactions.Actions;

import co.com.dafiti.certification.stepdefinitions.DafitiLoginStepDefinition;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ClickOnSvg implements Interaction{

	private Target svgTarget;
	private Actions action;
	
	public ClickOnSvg(Target svgTarget) {
		action = new Actions(DafitiLoginStepDefinition.hisBrowser);
		this.svgTarget = svgTarget;
	}
	
	@Override
	public <T extends Actor> void performAs(T jhon) {
		if(the(DafitiHomePage.CLOSE_OFFERT_BUTTON).answeredBy(jhon).isCurrentlyVisible()) {
			action.click(svgTarget.resolveFor(jhon)).build().perform();
		}
	}
	
	public static ClickOnSvg target(Target svgTarget) {
		return instrumented(ClickOnSvg.class, svgTarget);
	}
	
	

}
