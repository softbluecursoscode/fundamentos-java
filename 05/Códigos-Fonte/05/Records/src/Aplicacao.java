
public class Aplicacao {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		double area1 = r1.calcularArea();
		System.out.println(area1);
		System.out.println("Largura: " + r1.largura() + ", Altura: " + r1.altura());
		
		Retangulo r2 = new Retangulo(5, 7);
		double area2 = r2.calcularArea();
		System.out.println(area2);
		
		Quadrado q1 = new Quadrado(6);
		System.out.println(q1.calcularArea());
		System.out.println(q1);
		
		Quadrado q2 = new Quadrado(6);
		System.out.println(q1.equals(q2));
		
		Retangulo r3 = Retangulo.create(10);
		System.out.println(r3);
	}
}
