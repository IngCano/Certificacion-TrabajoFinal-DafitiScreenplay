package co.com.dafiti.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import co.com.dafiti.certification.userinterfaces.DafitiHomePage;

public class TheDafitiLoginResultElement implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor jhon) {
		return the(DafitiHomePage.WELCOME_USER_ELEMENT).answeredBy(jhon).isCurrentlyVisible();
	}

	public static TheDafitiLoginResultElement isVisible() {
		return new TheDafitiLoginResultElement();
	}

}
