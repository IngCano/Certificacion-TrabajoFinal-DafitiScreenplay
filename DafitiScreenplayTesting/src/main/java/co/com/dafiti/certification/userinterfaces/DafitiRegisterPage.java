package co.com.dafiti.certification.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://secure.dafiti.com.co/customer/account/login/")
public class DafitiRegisterPage extends PageObject{
	
	public static final Target EMAIL_TEXTFIELD =
			Target.the("Email textfield").locatedBy(
					"//input[@id='RegistrationForm_email']");
	
	public static final Target PASSWORD_TEXTFIELD =
			Target.the("Password textfield").locatedBy(
					"//input[@id='RegistrationForm_password']");
	
	public static final Target CONFIRM_PASSWORD_TEXTFIELD =
			Target.the("Confirm password textfield").locatedBy(
					"//input[@id='RegistrationForm_password2']");
	
	public static final Target FIRST_NAME_TEXTFIELD =
			Target.the("First name textfield").locatedBy(
					"//input[@id='RegistrationForm_first_name']");
	
	public static final Target LAST_NAME_TEXTFIELD =
			Target.the("Last name textfield").locatedBy(
					"//input[@id='RegistrationForm_last_name']");
	
	public static final Target DOCUMENT_NUMBER_TEXTFIELD =
			Target.the("Document number text field").locatedBy(
					"//input[@id='RegistrationForm_identification']");
	
	public static final Target DOCUMENT_TYPE_SELECT =
			Target.the("Document type select").locatedBy(
					"//select[@id='RegistrationForm_identification_type']");
			
	public static final Target DAY_TEXTFIELD =
			Target.the("Day textfield").locatedBy(
					"//input[@id='RegistrationForm_day']");
	
	public static final Target MONTH_TEXTFIELD =
			Target.the("Month textfield").locatedBy(
					"//input[@id='RegistrationForm_month']");
	
	public static final Target YEAR_SELECT =
			Target.the("Year select").locatedBy(
					"//select[@id='RegistrationForm_year']");
	
	public static final Target GENDER_SELECT =
			Target.the("Gender select").locatedBy(
					"//select[@id='RegistrationForm_gender']");
	
	public static final Target NEWSLETTER_SUBSCRIBED_CHECKBOX =
			Target.the("Newsletter subscribed checkbox").locatedBy(
					"//input[@id='RegistrationForm_is_newsletter_subscribed']");
	
	public static final Target TERMS_ACCEPTED_CHECKBOX =
			Target.the("Terms accepted checkbox").locatedBy(
					"//input[@id='RegistrationForm_terms_accepted']");
	
	public static final Target SEND_BUTTON =
			Target.the("Send button").locatedBy(
					"//input[@id='createAccountButton']");
}
