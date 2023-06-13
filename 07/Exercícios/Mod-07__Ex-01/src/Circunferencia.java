

public class Circunferencia implements AreaCalculavel {

	//raio da circunferência
	private double raio;

	//construtor
	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	//cálculo da área da circunferência
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
}
