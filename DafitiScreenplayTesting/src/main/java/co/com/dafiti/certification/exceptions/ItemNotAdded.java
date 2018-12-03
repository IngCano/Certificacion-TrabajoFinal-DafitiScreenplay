package co.com.dafiti.certification.exceptions;
/**
 * Clase que representa la excepcion ItemNotAdded
 * @author Stroop
 *
 */
public class ItemNotAdded extends AssertionError{
	// Todas las excepciones llevan este atributo para las versiones 
	private static final long serialVersionUID = 1L;
	// Declaramos la variable estatica que contendra el texto de la excepcion
	private static final String ITEM_NOT_ADDED = "Item not added";
	
	/**
	 * Método que retornará el mensaje de error
	 * @return la variable estatica que contiene el mensaje de error
	 */
	public static String getItemNotAddedMessage() {
		return ITEM_NOT_ADDED;
	}
	
	/**
	 * Constructor de la clase
	 * @param message que pasará al constructor de la clase padre
	 * @param cause que pasará al constructor de la clase padre
	 */
	public ItemNotAdded(String message, Throwable cause) {
		super(message, cause);
	}
}
