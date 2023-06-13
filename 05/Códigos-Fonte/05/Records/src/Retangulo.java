
public record Retangulo(double largura, double altura) {

	public Retangulo() {
		//this(4, 3);
		this.largura = 4;
		this.altura = 3;
	}
	
	public double calcularArea() {
		return largura * altura;
	}
	
	public static Retangulo create(double lado) {
		return new Retangulo(lado, lado);
	}
}
