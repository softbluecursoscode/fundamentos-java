

/* Representa um ret�ngulo */
public class Retangulo extends Figura {

	/* Base do ret�ngulo */
	private double base;
	
	/* Altura do ret�ngulo */
	private double altura;
	
	/* Construtor que recebe a base e a altura como par�metros */
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	/* M�todo sobrescrito para calcular a �rea do ret�ngulo */
	public double calcularArea() {
		return base * altura;
	}
}
