package co.com.dafiti.certification.tasks;

import java.util.List;

import co.com.dafiti.certification.models.DafitiUserModel;
import co.com.dafiti.certification.userinterfaces.DafitiLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task{

	private List<DafitiUserModel> credentials;
	
	public Login(List<DafitiUserModel> userData) {
		credentials = userData;
	}
	
	@Override
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(
				Enter.theValue(credentials.get(0).getEmail())
				.into(DafitiLoginPage.EMAIL_TEXTFIELD));
		jhon.attemptsTo(
				Enter.theValue(credentials.get(0).getPassword())
				.into(DafitiLoginPage.PASSWORD_TEXTFIELD));
		jhon.attemptsTo(Click.on(DafitiLoginPage.LOGIN_BUTTON));
	}

	public static Login with(List<DafitiUserModel> credentials) {
		return instrumented(Login.class, credentials);
	}

}
