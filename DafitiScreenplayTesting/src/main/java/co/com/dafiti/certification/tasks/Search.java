package co.com.dafiti.certification.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import co.com.dafiti.certification.interactions.ClickOnSvg;
import co.com.dafiti.certification.models.DafitiKeywordModel;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task{

	private List<DafitiKeywordModel> word;
	
	public Search(List<DafitiKeywordModel> word) {
		this.word = word;
	}
	
	@Override
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(
				ClickOnSvg.target(DafitiHomePage.CLOSE_OFFERT_BUTTON),
				Enter.theValue(word.get(0).getKeyword()).into(DafitiHomePage.SEARCH_BAR),
				Click.on(DafitiHomePage.SEARCH_BUTTON));
	}

	public static Search forThe(List<DafitiKeywordModel> keyword) {
		return instrumented(Search.class, keyword);
	}
}
