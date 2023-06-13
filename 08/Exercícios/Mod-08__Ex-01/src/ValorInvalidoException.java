
// Exceção que representa um valor inválido

//O @SuppressWarnings apenas evita que o Eclipse mostre o warning de serialVersionUID, que não vem ao caso aqui
@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {

	// Valor inválido utilizado
	private double valorInvalido;
	
	// Construtor. Recebe uma mensagem de erro e o valor inválido utilizado
	public ValorInvalidoException(String message, double valorInvalido) {
		// Chama o construtor de Exception passando a mensagem
		super(message);
		
		this.valorInvalido = valorInvalido;
	}
	
	// Obtém o valor inválido utilizado
	public double getValorInvalido() {
		return valorInvalido;
	}
}
