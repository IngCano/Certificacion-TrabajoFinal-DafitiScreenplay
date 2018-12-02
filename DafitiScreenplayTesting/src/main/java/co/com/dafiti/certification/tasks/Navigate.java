package co.com.dafiti.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.dafiti.certification.interactions.ClickOnSvg;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;

public class Navigate implements Task{

	@Override
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(
				ClickOnSvg.target(DafitiHomePage.CLOSE_OFFERT_BUTTON),
				Click.on(DafitiHomePage.LOGIN_REGISTER_BUTTON));
	}

	public static Navigate toTheDafitiLoginPage() {
		return instrumented(Navigate.class);
	}
	
	public static Navigate toTheDafitiRegisterPage() {
		return instrumented(Navigate.class);
	}
	
}
