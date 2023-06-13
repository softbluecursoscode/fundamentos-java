
public class Lampada {

	// Armazena o estado atual da lâmpada. Este atributo é privado porque só deve 
	// ser visível dentro desta classe
	private boolean ligada;
	
	// Construtor. Recebe como parâmetro o estado inicial da lâmpada
	public Lampada(boolean ligada) {
		// Utiliza o operador this para diferenciar o atributo do parâmetro
		this.ligada = ligada;
	}
	
	// Liga a lâmpada
	public void ligar() {
		ligada = true;
	}
	
	// Desliga a lâmpada
	public void desligar() {
		ligada = false;
	}
	
	// Imprime o estado atual da lâmpada
	public void imprimir() {
		if (ligada) {
			System.out.println("Lâmpada ligada");
		} else {
			System.out.println("Lâmpada desligada");
		}
	}
}
