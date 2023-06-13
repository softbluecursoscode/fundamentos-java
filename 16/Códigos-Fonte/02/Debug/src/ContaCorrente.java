
public class ContaCorrente {

	private double saldo;
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor <= 0) {
			throw new IllegalArgumentException();
		}
		
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException();
		}
		
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException();
		}
		
		saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
