package common.exceptions;

public class BpmLiteException extends Exception {

	public BpmLiteException(String message)
	{
		super(message);
	}
	
	public BpmLiteException(String message, Exception e)
	{
		super(message, e);
	}
}
