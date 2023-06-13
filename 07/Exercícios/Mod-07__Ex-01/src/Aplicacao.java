

public class Aplicacao {

	public static void main(String[] args) {
		
		//área da figura
		double area;
		
		/*
		 * O código abaixo usa polimorfismo para referenciar o objeto criado na memória. Isto possibilita
		 * que o código enxergue todos os objetos de uma forma homogênea, não interessando qual o tipo real
		 * do objeto criado na memória (o código referencia apenas um objeto AreaCalculavel).
		 */
		
		//área de um quadrado de lado 2
		AreaCalculavel a1 = new Quadrado(2);
		area = a1.calcularArea();
		System.out.println(area);
		
		//área de um retrângulo de lados 3 e 2
		AreaCalculavel a2 = new Retangulo(3, 2);
		area = a2.calcularArea();
		System.out.println(area);
		
		//área de uma circunferência de raio 3
		AreaCalculavel a3 = new Circunferencia(3);
		area = a3.calcularArea();
		System.out.println(area);
		
	}
}
