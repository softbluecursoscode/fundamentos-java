public class Aplicacao {

	public static void main(String[] args) {

		//Cria um triângulo, dá valor aos atributos e calcula a área
		Triangulo tr = new Triangulo();
		tr.base = 2.5;
		tr.altura = 4;
		double area = tr.calcularArea();
		System.out.println("Área triângulo: " + area);
		
		//Cria um quadrado, dá valor aos atributos e calcula a área
		Quadrado q = new Quadrado();
		q.lado = 3.2;
		area = q.calcularArea();
		System.out.println("Área quadrado: " + area);
		
		//Cria uma circunferência, dá valor aos atributos e calcula a área
		Circunferencia c = new Circunferencia();
		c.raio = 5;
		area = c.calcularArea();
		System.out.println("Área circunferência: " + area);
		
		//Cria um trapézio, dá valor aos atributos e calcula a área
		Trapezio tp = new Trapezio();
		tp.baseMaior = 7.1;
		tp.baseMenor = 3.6;
		tp.altura = 2;
		area = tp.calcularArea();
		System.out.println("Área trapézio: " + area);
	}
}
