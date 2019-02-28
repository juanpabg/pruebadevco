package co.com.devco.certification.hangout.exceptions;

@SuppressWarnings("serial")
public class ContactNoExistExceptions extends AssertionError {

	public static final String CONTACT_NO_EXIST = "The contact no exist in your list";

	public ContactNoExistExceptions(String message, Throwable cause) {
		super(message, cause);
	}
}