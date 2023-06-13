

/*
 * Classe que inicia a aplica��o.
 * Calcula a �rea de uma figura complexa, composta por ret�ngulos e quadrados
 */
public class Calculador {

	public static void main(String[] args) {
		
		/* Cria dois quadrados */
		Quadrado q1 = new Quadrado(3.0);
		Quadrado q2 = new Quadrado(10.0);
		
		/* Cria dois ret�ngulos */
		Retangulo r1 = new Retangulo(2.0, 7.0);
		Retangulo r2 = new Retangulo(5.0, 3.0);
		
		/* Coloca as figuras num array de figuras */
		Figura[] figuras = { q1, q2, r1, r2 };
		
		/* Constroi uma figura complexa com base nas figuras criadas anteriormente */
		FiguraComplexa figuraComplexa = new FiguraComplexa(figuras);
		
		/* Calcula a �rea da figura complexa */
		double area = figuraComplexa.calcularArea();
		
		System.out.println("�rea da figura: " + area);
	}
}
