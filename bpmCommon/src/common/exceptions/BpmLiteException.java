package common.exceptions;

public class BpmLiteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BpmLiteException(String message)
	{
		super(message);
	}
	
	public BpmLiteException(String message, Exception e)
	{
		super(message, e);
	}
}
