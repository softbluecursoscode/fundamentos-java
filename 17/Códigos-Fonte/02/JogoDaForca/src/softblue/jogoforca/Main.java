package softblue.jogoforca;

/**
 * Possui o método main() que inicia o jogo
 */
public class Main {

	/**
	 * Método main
	 * @param args Argumentos de linha de comando
	 * @throws Exception Lança exceções inesperadas
	 */
	public static void main(String[] args) throws Exception {
		
		// Instancia o jogo e inicia
		Jogo jogo = new Jogo();
		jogo.iniciar();
	}
}
