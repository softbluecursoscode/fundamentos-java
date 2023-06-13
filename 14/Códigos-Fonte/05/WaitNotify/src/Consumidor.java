import java.util.Random;


public class Consumidor extends Thread {

	private static Random random = new Random();
	private Buffer buffer;

	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			buffer.consumir();
			
			try {
				Thread.sleep(random.nextInt(300));
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
