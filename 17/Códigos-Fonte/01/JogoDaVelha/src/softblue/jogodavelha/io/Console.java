package softblue.jogodavelha.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Classe utilit�ria para ler dados do console
 */
public class Console {

	/**
	 * L� uma string do console
	 * @return String lida
	 */
	public static String readString() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler o dado do teclado");
		}
	}
	
	/**
	 * L� um valor do tipo int do console
	 * @return valor int lido
	 */
	public static int readInt() {
		String str = readString();
		
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException e) {
			throw new RuntimeException(str + " nao � um int v�lido");
		}
	}

	/**
	 * L� um valor do tipo double do console
	 * @return valor double lido
	 */
	public static double readDouble() {
		String str = readString();
		
		try {
			return Double.parseDouble(str);
		} catch(NumberFormatException e) {
			throw new RuntimeException(str + " nao � um double v�lido");
		}
	}
}
