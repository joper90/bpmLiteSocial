package common;


public class BpmLiteException extends Exception {

	public BpmLiteException(String message, Exception e) {
		super (message, e);
	}

	public BpmLiteException(String message)
	{
		super(message);
	}
}
