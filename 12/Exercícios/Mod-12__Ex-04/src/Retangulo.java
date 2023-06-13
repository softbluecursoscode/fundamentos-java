

/* Representa um retângulo */
public class Retangulo extends Figura {

	/* Base do retângulo */
	private double base;
	
	/* Altura do retângulo */
	private double altura;
	
	/* Construtor que recebe a base e a altura como parâmetros */
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/* Método sobrescrito para calcular a área do retângulo */
	public double calcularArea() {
		return base * altura;
	}
}
