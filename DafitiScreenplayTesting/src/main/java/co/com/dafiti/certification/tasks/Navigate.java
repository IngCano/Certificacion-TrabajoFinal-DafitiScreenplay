package co.com.dafiti.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;

import static co.com.dafiti.certification.utils.Helper.with;
import co.com.dafiti.certification.interactions.ClickOnSvg;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;

public class Navigate implements Task{

	private WebDriver hisBrowser;
	
	public Navigate(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}
	
	@Override
	@Step("{0} wants to login into dafiti")
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(
				ClickOnSvg.target(DafitiHomePage.CLOSE_OFFERT_BUTTON, with(hisBrowser)),
				Click.on(DafitiHomePage.LOGIN_REGISTER_BUTTON));
	}

	public static Navigate toTheDafitiLoginPage(WebDriver hisBrowser) {
		return instrumented(Navigate.class, hisBrowser);
	}
	
	public static Navigate toTheDafitiRegisterPage(WebDriver hisBrowser) {
		return instrumented(Navigate.class, hisBrowser);
	}

}
