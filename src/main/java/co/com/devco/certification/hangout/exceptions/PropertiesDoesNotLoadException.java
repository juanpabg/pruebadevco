package co.com.devco.certification.hangout.exceptions;

@SuppressWarnings("serial")
public class PropertiesDoesNotLoadException extends RuntimeException{
	
	public PropertiesDoesNotLoadException(Exception e)
	{
		super(e);
	}

}
