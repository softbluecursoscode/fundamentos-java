import java.util.LinkedList;
import java.util.Queue;


public class Buffer {

	private static final int MAX = 20;
	
	private Queue<Integer> fila = new LinkedList<Integer>();
	
	public synchronized void produzir(int n) {
		
		while (fila.size() == MAX) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		
		fila.offer(n);
		
		notifyAll();
		
		imprimir();
	}
	
	public int consumir() {
		synchronized (this) {
			
			while (fila.size() == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			int n = fila.poll();
			
			notifyAll();
			
			imprimir();
			return n;	
		}
	}

	private void imprimir() {
		System.out.print("=> ");
		
		for (Integer n : fila) {
			System.out.print(n + " ");
		}
		
		System.out.println();
	}
}
