

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Classe utilitária para ler dados do console
 * @author Carlos Tosin
 * @version 1.0
 */
public class Console {

	/**
	 * Lê uma string do console
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
	 * Lê um valor do tipo int do console
	 * @return valor int lido
	 */
	public static int readInt() {
		String str = readString();
		
		try {
			return Integer.parseInt(str);
		} catch(NumberFormatException e) {
			throw new RuntimeException(str + " nao e um int valido");
		}
	}

	/**
	 * Lê um valor do tipo double do console
	 * @return valor double lido
	 */
	public static double readDouble() {
		String str = readString();
		
		try {
			return Double.parseDouble(str);
		} catch(NumberFormatException e) {
			throw new RuntimeException(str + " nao e um double valido");
		}
	}
}
