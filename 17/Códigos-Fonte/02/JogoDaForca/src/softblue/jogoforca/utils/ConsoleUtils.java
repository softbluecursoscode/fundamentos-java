package softblue.jogoforca.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import softblue.jogoforca.CaractereInvalidoException;
import softblue.jogoforca.JogoDaForcaException;

/**
 * Métodos utilitários de console
 */
public class ConsoleUtils {

	/**
	 * Lê uma letra do console
	 * 
	 * @return Letra lida
	 * @throws CaractereInvalidoException
	 *             Pode ser lançada em três casos: se nada for digitado, se mais
	 *             de uma letra for digitada e se o caractere digitado não for
	 *             uma letra de A a Z
	 * @throws {@link IOException} Se houver algum problema de I/O relacionado à
	 *         leitura do console
	 */
	public static char lerLetra() throws JogoDaForcaException {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			// Lê a linha do teclado
			String linha = reader.readLine();

			// A linha não pode ser vazia
			if (linha.trim().isEmpty()) {
				throw new CaractereInvalidoException("Nenhuma letra foi digitada");
			}

			// A linha não pode conter mais de um caractere
			if (linha.length() > 1) {
				throw new CaractereInvalidoException("Apenas uma letra deve ser digitada");
			}

			// Extrai o caractere digitado, convertida para maiúscula
			char letra = linha.toUpperCase().charAt(0);

			// O caractere deve ser uma letra
			if (!Character.isLetter(letra)) {
				throw new CaractereInvalidoException("Apenas letras devem ser digitadas");
			}

			return letra;

		} catch (IOException e) {
			throw new JogoDaForcaException("Problema ao ler caractere do teclado", e);
		}
	}
}
