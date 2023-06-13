// Classe que representa uma conta banc�ria
public class ContaBancaria {

	// Saldo da conta
	private double saldo;
	
	// Deposita um valor na conta
	public void depositar(double valor) throws ValorInvalidoException {
		// Se o valor for negativo, lan�a uma exce��o
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inv�lido para dep�sito", valor);
		}
		
		saldo += valor;
	}
	
	// Saca um valor da conta
	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		// Se o valor for negativo, lan�a uma exce��o
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inv�lido para saque", valor);
		}
		
		// Se n�o houver saldo suficiente para o saque, lan�a uma exce��o
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException("N�o h� saldo suficiente dispon�vel", saldo);
		}
		
		saldo -= valor;
	}
	
	// Transfere um valor desta conta para outra
	// Este m�todo lan�a SaldoSuficienteException e ValorInvalidoException porque os m�todos sacar() e 
	// depositar(), chamados por ele, podem lan�ar estas exce��es
	public void transferir(double valor, ContaBancaria conta) throws SaldoInsuficienteException, ValorInvalidoException {
		sacar(valor);
		conta.depositar(valor);
	}
}
