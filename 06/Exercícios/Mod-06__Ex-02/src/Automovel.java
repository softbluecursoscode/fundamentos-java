
// Classe que representa um automóvel
public class Automovel extends Veiculo {
	
	/*
	 * Perceba que, ao sobrescrever os métodos, o método da superclasse é chamado, pois ele precisa 
	 * definir o valor correto para o atributo 'ligado'
	 */

	// Sobrescrita do método ligar()
	public void ligar() {
		super.ligar();
		System.out.println("Automóvel ligado");
	}
	
	// Sobrescrita do método desligar()
	public void desligar() {
		super.desligar();
		System.out.println("Automóvel desligado");
	}
}
