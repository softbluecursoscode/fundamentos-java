
// Classe que representa uma conta bancária genérica. Por ser abstrata, não pode ser instanciada
public abstract class ContaBancaria {

	// Saldo da conta
	protected double saldo;
	
	// Deposita determinado valor na conta
	public void depositar(double valor) {
		saldo += valor;
	}
	
	// Saca determinado valor da conta
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	// Transfere determinado valor para outra conta
	public void transferir(double valor, ContaBancaria conta) {
		sacar(valor);
		conta.depositar(valor);
	}
	
	// Calcula o saldo final, que pode sofrer variação do valor armazenado no atributo
	// 'saldo'. Cada subclasse deve implementar este método de acordo com suas regras de cálculo
	public abstract double calcularSaldo();
}
