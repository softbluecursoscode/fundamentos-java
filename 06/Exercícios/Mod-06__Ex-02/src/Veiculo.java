
// Classe que representa um veículo genérico
public class Veiculo {

	// Indica se o veículo está ligado ou desligado
	private boolean ligado;
	
	// Liga o veículo
	public void ligar() {
		ligado = true;
	}
	
	// Desliga o veículo
	public void desligar() {
		ligado = false;
	}
	
	// Método getter do atributo 'ligado'
	public boolean isLigado() {
		return ligado;
	}
}
