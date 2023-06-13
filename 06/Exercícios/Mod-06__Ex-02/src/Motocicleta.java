
// Classe que representa uma motocicleta
public class Motocicleta extends Veiculo {

	/*
	 * Perceba que, ao sobrescrever os m�todos, o m�todo da superclasse � chamado, pois ele precisa 
	 * definir o valor correto para o atributo 'ligado'
	 */
	
	// Sobrescrita do m�todo ligar()
	public void ligar() {
		super.ligar();
		System.out.println("Motocicleta ligada");
	}
	
	// Sobrescrita do m�todo desligar()
	public void desligar() {
		super.desligar();
		System.out.println("Motocicleta desligada");
	}
}
