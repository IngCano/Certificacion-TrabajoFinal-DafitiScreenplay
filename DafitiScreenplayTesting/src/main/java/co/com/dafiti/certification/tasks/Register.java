package co.com.dafiti.certification.tasks;

import java.util.List;

import co.com.dafiti.certification.models.DafitiRegisterUserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task{

	private List<DafitiRegisterUserModel> jhonData;
	
	public Register(List<DafitiRegisterUserModel> hisData) {
		jhonData = hisData;
	}
	
	@Override
	@Step("{0} submits all the data entered")
	public <T extends Actor> void performAs(T jhon) {
		jhon.attemptsTo(Enter.theValue(jhonData.get(0).getEmail()).into());
	}

	public static Register with(List<DafitiRegisterUserModel> hisData) {
		return instrumented(Register.class, hisData);
	}

}
