package co.com.dafiti.certification.questions;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.dafiti.certification.userinterfaces.DafitiSearchResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheDafitiSearchResultsElement implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor jhon) {
		return the(DafitiSearchResultPage.RESULTS_CONTAINER).answeredBy(jhon).isCurrentlyVisible();
	}

	public static TheDafitiSearchResultsElement isVisible() {
		return new TheDafitiSearchResultsElement();
	}

}
