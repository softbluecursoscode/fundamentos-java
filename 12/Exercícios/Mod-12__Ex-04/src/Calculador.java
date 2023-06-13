

/*
 * Classe que inicia a aplicação.
 * Calcula a área de uma figura complexa, composta por retângulos e quadrados
 */
public class Calculador {

	public static void main(String[] args) {
		
		/* Cria dois quadrados */
		Quadrado q1 = new Quadrado(3.0);
		Quadrado q2 = new Quadrado(10.0);
		
		/* Cria dois retângulos */
		Retangulo r1 = new Retangulo(2.0, 7.0);
		Retangulo r2 = new Retangulo(5.0, 3.0);
		
		/* Coloca as figuras num array de figuras */
		Figura[] figuras = { q1, q2, r1, r2 };
		
		/* Constroi uma figura complexa com base nas figuras criadas anteriormente */
		FiguraComplexa figuraComplexa = new FiguraComplexa(figuras);
		
		/* Calcula a área da figura complexa */
		double area = figuraComplexa.calcularArea();
		
		System.out.println("Área da figura: " + area);
	}
}
