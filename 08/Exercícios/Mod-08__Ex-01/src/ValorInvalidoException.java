
// Exce��o que representa um valor inv�lido

//O @SuppressWarnings apenas evita que o Eclipse mostre o warning de serialVersionUID, que n�o vem ao caso aqui
@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {

	// Valor inv�lido utilizado
	private double valorInvalido;
	
	// Construtor. Recebe uma mensagem de erro e o valor inv�lido utilizado
	public ValorInvalidoException(String message, double valorInvalido) {
		// Chama o construtor de Exception passando a mensagem
		super(message);
		
		this.valorInvalido = valorInvalido;
	}
	
	// Obt�m o valor inv�lido utilizado
	public double getValorInvalido() {
		return valorInvalido;
	}
}
