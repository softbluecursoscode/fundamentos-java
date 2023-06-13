
public class Contador {

	private int valor;
	
	public synchronized int incrementar() {
		return ++valor;
	}
}
