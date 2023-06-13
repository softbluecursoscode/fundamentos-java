
public class Contador {

	private int valor;
	
	public synchronized void incrementar() {
		valor++;
	}
	
	public int getValor() {
		return valor;
	}
}
