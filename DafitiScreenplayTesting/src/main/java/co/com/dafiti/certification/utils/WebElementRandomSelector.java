package co.com.dafiti.certification.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementRandomSelector { 
	
	private WebDriver navegador;
	
	public WebElementRandomSelector(WebDriver navegador) {
		this.navegador = navegador;
	}
	
	/**
	 * Método para obtener un elemento web escogido de una lista de resultados 
	 * @param xpathContenedor es la direccion del elemento web contenedor de los resultados de la busqueda
	 * @return El elemento web encontrado
	 */
	public WebElement randomWebElementInside(String xpathContenedor) {
		// Declaramos la lista de elementos web = todos los elementos web que encuentre en esa ruta
		List<WebElement> webElements = navegador.findElements(By.xpath(xpathContenedor));
		// Declaramos el numero aleatorio que queremos sortear entre todo esa cantidad de elementos
		int elemento = (int)(Math.random() * webElements.size());
		// Luego le decimos que agarre el elemento segun el numero aleatorio y que lo asigne a otra variable
		WebElement elementoSeleccionado = webElements.get(elemento);
		// Y por ultimo retornamos el elemento web seleccionado
		return elementoSeleccionado;
	}
	
	public static WebElementRandomSelector workWith(WebDriver navegador) {
		return new WebElementRandomSelector(navegador);
	}
	
}
