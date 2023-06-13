
// Exceção que representa uma quantidade de saldo insuficiente na conta para realizar a transação

// O @SuppressWarnings apenas evita que o Eclipse mostre o warning de serialVersionUID, que não vem ao caso aqui
@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	// Saldo total disponível na conta
	private double saldoDisponivel;
	
	// Construtor. Recebe uma mensagem de erro e o saldo disponível
	public SaldoInsuficienteException(String message, double saldoDisponivel) {
		// Chama o construtor de Exception passando a mensagem
		super(message);
		
		this.saldoDisponivel = saldoDisponivel;
	}
	
	// Obtém o saldo disponível
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
}
