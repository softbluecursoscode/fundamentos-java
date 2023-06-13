
public class Executor extends Thread {

	private Contador contador;
	
	public Executor(Contador contador) {
		this.contador = contador;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int novoValor = contador.incrementar();
			System.out.println(novoValor);
		}
	}
}
