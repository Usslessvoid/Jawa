package by.gsu.omglab.exceptions;

public class SerializeException extends Exception {
	private static final long serialVersionUID = 1L;
	public SerializeException(){
		super();
	}
	public SerializeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	public SerializeException(String arg0) {
		super(arg0);
	}
	public SerializeException(Throwable arg0) {
		super(arg0);
	}
	
}
