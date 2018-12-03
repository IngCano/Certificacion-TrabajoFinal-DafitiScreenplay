package co.com.dafiti.certification.exceptions;

public class SearchNotSuccessful extends AssertionError{
	// Todas las excepciones llevan este atributo para las versiones 
	private static final long serialVersionUID = 1L;
	// Declaramos la variable estatica que contendra el texto de la excepcion
	private static final String SEARCH_NOT_SUCCESSFUL = "Search not successful";
	
	/**
	 * Método que retornará el mensaje de error
	 * @return la variable estatica que contiene el mensaje de error
	 */
	public static String getSearchNotSuccessfulMessage() {
		return SEARCH_NOT_SUCCESSFUL;
	}
	
	/**
	 * Constructor de la clase
	 * @param message que pasará al constructor de la clase padre
	 * @param cause que pasará al constructor de la clase padre
	 */
	public SearchNotSuccessful(String message, Throwable cause) {
		super(message, cause);
	}

}
