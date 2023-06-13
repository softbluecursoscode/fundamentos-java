
@SuppressWarnings("serial")
public class BancoException extends Exception {

	public BancoException() {
	}

	public BancoException(String message) {
		super(message);
	}

	public BancoException(Throwable cause) {
		super(cause);
	}

	public BancoException(String message, Throwable cause) {
		super(message, cause);
	}

	public BancoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
