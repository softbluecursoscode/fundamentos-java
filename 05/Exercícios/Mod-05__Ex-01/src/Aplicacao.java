
public class Aplicacao {

	public static void main(String[] args) {
	
		// Instancia uma lâmpada acesa
		Lampada l = new Lampada(true);
		
		// Imprime o estado atual
		l.imprimir();
		
		// Desliga a lâmpada e imprime o novo estado
		l.desligar();
		l.imprimir();
		
		// Liga a lâmpada e imprime o novo estado
		l.ligar();
		l.imprimir();
	}
}
