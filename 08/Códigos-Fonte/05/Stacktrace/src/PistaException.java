
@SuppressWarnings("serial")
public class PistaException extends Exception {

	public PistaException() {
	}

	public PistaException(String message) {
		super(message);
	}

	public PistaException(Throwable cause) {
		super(cause);
	}

	public PistaException(String message, Throwable cause) {
		super(message, cause);
	}

	public PistaException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
