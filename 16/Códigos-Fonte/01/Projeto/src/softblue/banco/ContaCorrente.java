package softblue.banco;

public class ContaCorrente extends Conta {

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		
		if (getSaldo() - valor < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		
		setSaldo(getSaldo() - valor);
	}

	@Override
	public void depositar(double valor) {
		
		setSaldo(getSaldo() + valor);
	}
}
