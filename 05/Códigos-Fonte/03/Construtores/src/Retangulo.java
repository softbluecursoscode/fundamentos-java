
public class Retangulo {

	private double largura;
	private double altura;
	
	public Retangulo() {
		this(4, 3);
		//largura = 4;
		//altura = 3;
	}
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
}
