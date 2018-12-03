package co.com.dafiti.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.WebDriver;

import static co.com.dafiti.certification.utils.Helper.with;
import co.com.dafiti.certification.interactions.ClickOnSvg;
import co.com.dafiti.certification.models.DafitiKeywordModel;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Search implements Task{

	private List<DafitiKeywordModel> word;
	private WebDriver hisBrowser;
	
	public Search(List<DafitiKeywordModel> word, WebDriver hisBrowser) {
		this.word = word;
		this.hisBrowser = hisBrowser;
	}
	
	@Override
	@Step("{0} searchs for the item")
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(
				ClickOnSvg.target(DafitiHomePage.CLOSE_OFFERT_BUTTON, with(hisBrowser)),
				Enter.theValue(word.get(0).getKeyword()).into(DafitiHomePage.SEARCH_BAR),
				Click.on(DafitiHomePage.SEARCH_BUTTON));
	}

	public static Search forThe(List<DafitiKeywordModel> keyword, WebDriver hisBrowser) {
		return instrumented(Search.class, keyword, hisBrowser);
	}
}
