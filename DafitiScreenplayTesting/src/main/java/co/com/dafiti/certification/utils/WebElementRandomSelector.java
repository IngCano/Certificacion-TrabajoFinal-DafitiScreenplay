package co.com.dafiti.certification.utils;
// Importamos la clase que nos permite crear y manipular una lista
import java.util.List;
// Importamos la clase que actua como el localizador de elementos web
import org.openqa.selenium.By;
// Importamos la clase que se encarga de controlar el navegador
import org.openqa.selenium.WebDriver;
// Importamos la clase que nos permite manejar elementos web
import org.openqa.selenium.WebElement;

/**
 * 
 * @author ingenierojcano@gmail.com
 *
 */
public class WebElementRandomSelector { 
	// Declaramos el controlador del navegador
	private WebDriver hisBrowser;
	/**
	 * Aqui en el constructor recibimos el navegador y se lo asignamos a la referencia declarada anteriormente
	 * @param navegador
	 */
	public WebElementRandomSelector(WebDriver navegador) {
		this.hisBrowser = navegador;
	}
	
	/**
	 * Método para obtener un elemento web escogido de una lista de resultados 
	 * @param xpathContenedor es la direccion del elemento web contenedor de los resultados de la busqueda
	 * @return El elemento web encontrado
	 */
	public WebElement randomWebElementInside(String xpathContenedor) {
		// Declaramos la lista de elementos web = todos los elementos web que encuentre en esa ruta
		List<WebElement> webElements = hisBrowser.findElements(By.xpath(xpathContenedor));
		// Declaramos el numero aleatorio que queremos sortear entre todo esa cantidad de elementos
		int elemento = (int)(Math.random() * webElements.size());
		// Luego le decimos que agarre el elemento segun el numero aleatorio y que lo asigne a otra variable
		WebElement elementoSeleccionado = webElements.get(elemento);
		// Y por ultimo retornamos el elemento web seleccionado
		return elementoSeleccionado;
	}
	
	/**
	 * Método estatico que devuelve una nueva instancia de la clase WebElementRandomSelector
	 * @param navegador es el controlador del navegador que recibe
	 * @return La nueva instancia
	 */
	public static WebElementRandomSelector workWith(WebDriver navegador) {
		return new WebElementRandomSelector(navegador);
	}
	
}
