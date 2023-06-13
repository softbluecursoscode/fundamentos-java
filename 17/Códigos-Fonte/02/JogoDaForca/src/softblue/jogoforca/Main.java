package softblue.jogoforca;

/**
 * Possui o m�todo main() que inicia o jogo
 */
public class Main {

	/**
	 * M�todo main
	 * @param args Argumentos de linha de comando
	 * @throws Exception Lan�a exce��es inesperadas
	 */
	public static void main(String[] args) throws Exception {
		
		// Instancia o jogo e inicia
		Jogo jogo = new Jogo();
		jogo.iniciar();
	}
}
