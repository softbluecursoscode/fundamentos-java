package softblue.jogodavelha;

/**
 * Exceção que representa uma jogada inválida realizada pelo jogador
 */
public class JogadaInvalidaException extends JogoDaVelhaException {

	/**
	 * @see JogoDaVelhaException#JogoDaVelhaException(String)
	 */
	public JogadaInvalidaException(String message) {
		super(message);
	}
}
