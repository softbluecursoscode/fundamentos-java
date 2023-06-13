package softblue.agenda;
import java.io.IOException;

/**
 * Classe que lança a aplicação
 */
public class Main {

	/**
	 * Método main
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Instancia a aplicação e a inicia
		Aplicacao aplicacao = new Aplicacao();
		aplicacao.iniciar();
	}
}
