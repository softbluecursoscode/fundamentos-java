
// Exce��o que representa uma quantidade de saldo insuficiente na conta para realizar a transa��o

// O @SuppressWarnings apenas evita que o Eclipse mostre o warning de serialVersionUID, que n�o vem ao caso aqui
@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {

	// Saldo total dispon�vel na conta
	private double saldoDisponivel;
	
	// Construtor. Recebe uma mensagem de erro e o saldo dispon�vel
	public SaldoInsuficienteException(String message, double saldoDisponivel) {
		// Chama o construtor de Exception passando a mensagem
		super(message);
		
		this.saldoDisponivel = saldoDisponivel;
	}
	
	// Obt�m o saldo dispon�vel
	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}
}
