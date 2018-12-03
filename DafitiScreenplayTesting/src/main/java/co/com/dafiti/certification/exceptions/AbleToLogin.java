package co.com.dafiti.certification.exceptions;

public class AbleToLogin extends AssertionError{
	// Todas las excepciones llevan este atributo para las versiones 
	private static final long serialVersionUID = 1L;
	// Declaramos la variable estatica que contendra el texto de la excepcion
	private static final String ABLE_TO_LOGIN = "Able to login";
	
	/**
	 * Método que retornará el mensaje de error
	 * @return la variable estatica que contiene el mensaje de error
	 */
	public static String getAbleToLoginMessage() {
		return ABLE_TO_LOGIN;
	}
	
	/**
	 * Constructor de la clase
	 * @param message que pasará al constructor de la clase padre
	 * @param cause que pasará al constructor de la clase padre
	 */
	public AbleToLogin(String message, Throwable cause) {
		super(message, cause);
	}
}
