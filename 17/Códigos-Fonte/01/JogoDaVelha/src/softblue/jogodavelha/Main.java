package softblue.jogodavelha;

/**
 * Classe para lançar o jogo
 */
public class Main {

	/**
	 * Método main
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// Instancia o jogo e inicia
		Jogo jogo = new Jogo();
		jogo.jogar();
	}
}
