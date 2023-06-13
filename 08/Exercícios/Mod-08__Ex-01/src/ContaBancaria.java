// Classe que representa uma conta bancária
public class ContaBancaria {

	// Saldo da conta
	private double saldo;
	
	// Deposita um valor na conta
	public void depositar(double valor) throws ValorInvalidoException {
		// Se o valor for negativo, lança uma exceção
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para depósito", valor);
		}
		
		saldo += valor;
	}
	
	// Saca um valor da conta
	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		// Se o valor for negativo, lança uma exceção
		if (valor <= 0) {
			throw new ValorInvalidoException("Valor inválido para saque", valor);
		}
		
		// Se não houver saldo suficiente para o saque, lança uma exceção
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException("Não há saldo suficiente disponível", saldo);
		}
		
		saldo -= valor;
	}
	
	// Transfere um valor desta conta para outra
	// Este método lança SaldoSuficienteException e ValorInvalidoException porque os métodos sacar() e 
	// depositar(), chamados por ele, podem lançar estas exceções
	public void transferir(double valor, ContaBancaria conta) throws SaldoInsuficienteException, ValorInvalidoException {
		sacar(valor);
		conta.depositar(valor);
	}
}
