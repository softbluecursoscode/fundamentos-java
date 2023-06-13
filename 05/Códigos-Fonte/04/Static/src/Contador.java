public class Contador {

	public static int valor;
	
	static {
		valor = 1;
	}

	public static void incrementar() {
		valor++;
	}

	public static int getValor() {
		return valor;
	}

}
