package co.com.dafiti.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://secure.dafiti.com.co/customer/account/login/")
public class DafitiLoginPage extends PageObject{
	
	public static final Target EMAIL_TEXTFIELD =
			Target.the("Email text field").locatedBy(
					"//input[@id='LoginForm_email']");
	
	public static final Target PASSWORD_TEXTFIELD =
			Target.the("Password text field").locatedBy(
					"//input[@id='LoginForm_password']");
	
	public static final Target LOGIN_BUTTON =
			Target.the("Login Button").locatedBy(
					"//input[@id='loginButton']");
	
}
