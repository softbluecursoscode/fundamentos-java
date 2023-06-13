
public class MyThread extends Thread {

	private Contador contador;
	
	public MyThread(Contador c) {
		contador = c;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			contador.incrementar();
		}
	}
}
