package co.com.dafiti.certification.interactions;
import org.openqa.selenium.WebDriver;
// Importamos la clase que nos sirve para emular interacciones complejas de usuario.
// Implementa el build pattern, contruyendo acciones compuestas que contienen todas las
// acciones ya especificadas en los metodos declarados
import org.openqa.selenium.interactions.Actions;
// Importamos nuestro stepDefinition,
import co.com.dafiti.certification.userinterfaces.DafitiHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ClickOnSvg implements Interaction{

	private Target svgTarget;
	private Actions action;
	private WebDriver hisBrowser;
	
	public ClickOnSvg(Target svgTarget, WebDriver hisBrowser) {
		this.svgTarget = svgTarget;
		this.hisBrowser = hisBrowser;
	}
	
	@Override
	public <T extends Actor> void performAs(T jhon) {
		if(the(DafitiHomePage.CLOSE_OFFERT_BUTTON).answeredBy(jhon).isCurrentlyVisible()) {
			action = new Actions(hisBrowser);
			action.click(svgTarget.resolveFor(jhon)).build().perform();
		}
	}
	
	public static ClickOnSvg target(Target svgTarget, WebDriver hisBrowser) {
		return instrumented(ClickOnSvg.class, svgTarget, hisBrowser);
	}
}
