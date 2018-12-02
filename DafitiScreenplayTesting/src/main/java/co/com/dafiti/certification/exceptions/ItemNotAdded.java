package co.com.dafiti.certification.exceptions;

public class ItemNotAdded extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	
	private static final String ITEM_NOT_ADDED = "Item not added";
	
	public static String getItemNotAddedMessage() {
		return ITEM_NOT_ADDED;
	}
	
	public ItemNotAdded(String message, Throwable cause) {
		super(message, cause);
	}
}
