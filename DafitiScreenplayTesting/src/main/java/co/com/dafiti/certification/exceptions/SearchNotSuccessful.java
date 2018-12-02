package co.com.dafiti.certification.exceptions;

public class SearchNotSuccessful extends AssertionError{

	private static final long serialVersionUID = 1L;
	
	private static final String SEARCH_NOT_SUCCESSFUL = "Search not successful";
	
	public static String getSearchNotSuccessfulMessage() {
		return SEARCH_NOT_SUCCESSFUL;
	}
	
	public SearchNotSuccessful(String message, Throwable cause) {
		super(message, cause);
	}

}
