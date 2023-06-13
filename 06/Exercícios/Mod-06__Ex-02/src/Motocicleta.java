
// Classe que representa uma motocicleta
public class Motocicleta extends Veiculo {

	/*
	 * Perceba que, ao sobrescrever os métodos, o método da superclasse é chamado, pois ele precisa 
	 * definir o valor correto para o atributo 'ligado'
	 */
	
	// Sobrescrita do método ligar()
	public void ligar() {
		super.ligar();
		System.out.println("Motocicleta ligada");
	}
	
	// Sobrescrita do método desligar()
	public void desligar() {
		super.desligar();
		System.out.println("Motocicleta desligada");
	}
}
