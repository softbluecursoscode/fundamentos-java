
public class ContaBancaria {
	
	//private final Object monitor = new Object();

	private double saldo = 1000;
	
	public synchronized void sacar(double valor) {
		//synchronized (this) {
			saldo -= valor;	
		//}
	}
	
	public synchronized void depositar(double valor) {
		//synchronized (this) {
			saldo += valor;	
		//}
	}
	
	public double getSaldo() {
		return saldo;
	}
}
