

public class Retangulo implements AreaCalculavel {

	//base e altura do retângulo
	private double base;
	private double altura;
	
	//construtor
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	//cálculo da área do retângulo
	public double calcularArea() {
		return base * altura;
	}

}
