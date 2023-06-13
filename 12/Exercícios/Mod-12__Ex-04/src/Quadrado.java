

/*
 * Representa um quadrado
 */
public class Quadrado extends Figura {

	/* Lado do quadrado */
	private double lado;
	
	/* Construtor que recebe o lado como parâmetro */
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	/* Método sobrescrito para calcular a área do quadrado */
	public double calcularArea() {
		return lado * lado;
	}
}
