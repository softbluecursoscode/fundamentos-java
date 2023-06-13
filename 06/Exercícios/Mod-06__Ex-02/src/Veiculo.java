
// Classe que representa um ve�culo gen�rico
public class Veiculo {

	// Indica se o ve�culo est� ligado ou desligado
	private boolean ligado;
	
	// Liga o ve�culo
	public void ligar() {
		ligado = true;
	}
	
	// Desliga o ve�culo
	public void desligar() {
		ligado = false;
	}
	
	// M�todo getter do atributo 'ligado'
	public boolean isLigado() {
		return ligado;
	}
}
