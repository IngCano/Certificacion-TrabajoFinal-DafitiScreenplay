package co.com.dafiti.certification.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task{

	private PageObject designedPage;
	
	public OpenTheBrowser(PageObject page) {
		designedPage = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(Open.browserOn(designedPage));
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
	
}
