package softblue.jogodavelha.pontuacao;

import softblue.jogodavelha.JogoDaVelhaException;

/**
 * Exce��o relacionada � problemas na pontua��o
 */
public class PontuacaoException extends JogoDaVelhaException {

	/**
	 * @see JogoDaVelhaException#JogoDaVelhaException(String)
	 * @param message
	 */
	public PontuacaoException(String message) {
		super(message);
	}
}
