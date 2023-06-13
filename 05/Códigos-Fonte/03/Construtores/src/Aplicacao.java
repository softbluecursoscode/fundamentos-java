
public class Aplicacao {

	public static void main(String[] args) {
		
		Retangulo r1 = new Retangulo();
		double area1 = r1.calcularArea();
		System.out.println(area1);
		
		Retangulo r2 = new Retangulo(5, 7);
		double area2 = r2.calcularArea();
		System.out.println(area2);
		
		Quadrado q = new Quadrado(6);
		System.out.println(q.calcularArea());
		
	}
}
