

/*
 * Representa um quadrado
 */
public class Quadrado extends Figura {

	/* Lado do quadrado */
	private double lado;
	
	/* Construtor que recebe o lado como par�metro */
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	/* M�todo sobrescrito para calcular a �rea do quadrado */
	public double calcularArea() {
		return lado * lado;
	}
}
