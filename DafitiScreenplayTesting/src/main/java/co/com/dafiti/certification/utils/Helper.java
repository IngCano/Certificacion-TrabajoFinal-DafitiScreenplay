package co.com.dafiti.certification.utils;
// Importamos la clase que nos permine controlar el navegador
import org.openqa.selenium.WebDriver;

/**
 * Esta clase nos ayuda a asignarle un controlador sin que se vea tan feo en el codigo xd 
 * @author ingenierojcano@gmail.com
 *
 */
public class Helper {	
	/**
	 * Método estatico que devuelve el mismo controlador que recibe, ¿Raro no?
	 * @param hisBrowser el controlador que recibe
	 * @return hisBrowser como el controlador que devuelve
	 */
	public static WebDriver with(WebDriver hisBrowser) {
		return hisBrowser;
	}
}
