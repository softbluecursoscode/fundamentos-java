
// Classe que representa um autom�vel
public class Automovel extends Veiculo {
	
	/*
	 * Perceba que, ao sobrescrever os m�todos, o m�todo da superclasse � chamado, pois ele precisa 
	 * definir o valor correto para o atributo 'ligado'
	 */

	// Sobrescrita do m�todo ligar()
	public void ligar() {
		super.ligar();
		System.out.println("Autom�vel ligado");
	}
	
	// Sobrescrita do m�todo desligar()
	public void desligar() {
		super.desligar();
		System.out.println("Autom�vel desligado");
	}
}
