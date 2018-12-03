package co.com.dafiti.certification.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowser implements Task{

	private PageObject designedPage;
	
	public OpenTheBrowser(PageObject page) {
		designedPage = page;
	}
	
	@Override
	@Step("{0} opens the browser on the designatedPage")
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(Open.browserOn(designedPage));
	}

	public static OpenTheBrowser on(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
	
}
