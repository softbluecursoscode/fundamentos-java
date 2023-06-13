

public class Quadrado implements AreaCalculavel {

	//lado do quadrado
	private double lado;

	//construtor
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	//c�lculo da �rea do quadrado
	public double calcularArea() {
		return lado * lado;
	}

}
