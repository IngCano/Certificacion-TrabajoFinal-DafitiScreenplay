package co.com.dafiti.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import java.util.List;

import co.com.dafiti.certification.models.DafitiKeywordModel;
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;

public class TheDafitiLoginResultElement implements Question<Boolean> {

	private boolean isVisible;
	private List<DafitiKeywordModel> keyword;
	
	public TheDafitiLoginResultElement(boolean isVisible, List<DafitiKeywordModel> keyword) {
		this.isVisible = isVisible;
		this.keyword = keyword;
	}
	
	@Override
	public Boolean answeredBy(Actor jhon) {
		if(isVisible) return the(DafitiHomePage.WELCOME_USER_ELEMENT).answeredBy(jhon).containsText(keyword.get(0).getKeyword());
		else return the(DafitiHomePage.WELCOME_USER_ELEMENT).answeredBy(jhon).containsText(keyword.get(0).getKeyword());
	}

	public static TheDafitiLoginResultElement hasWelcomeText(List<DafitiKeywordModel> keyword) {
		return new TheDafitiLoginResultElement(false, keyword);
	}

	public static TheDafitiLoginResultElement hasNoText(List<DafitiKeywordModel> keyword) {
		return new TheDafitiLoginResultElement(true, keyword);
	}

}
