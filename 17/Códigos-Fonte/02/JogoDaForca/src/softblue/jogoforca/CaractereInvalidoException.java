package softblue.jogoforca;

/**
 * Exceçao que indica que o caractere digitado é inválido por algu motivo
 */
public class CaractereInvalidoException extends JogoDaForcaException {

	/**
	 * @see JogoDaForcaException#JogoDaForcaException(String)
	 */
	public CaractereInvalidoException(String message) {
		super(message);
	}
}
