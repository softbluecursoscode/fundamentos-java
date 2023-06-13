

/*
 * Representa uma figura complexa, isto é, é composta por outras figuras.
 * Repare que a própria figura complexa é também uma figura.
 * Além de ela SER uma figura (herança), ela TEM figuras (composição)
 */
public class FiguraComplexa extends Figura {

	/* Figuras que compõem a figura complexa */
	private Figura[] figuras;
	
	/* Construtor que recebe o array de figuras */
	public FiguraComplexa(Figura[] figuras) {
		this.figuras = figuras;
	}
	
	/* Método sobrescrito para calcular a área total da figura.
	 * A área total é a soma das áreas de todas as figuras.
	 */
	public double calcularArea() {
		double areaTotal = 0.0;
		
		for (int i = 0; i < figuras.length; i++) {
			areaTotal += figuras[i].calcularArea();
		}
		
		return areaTotal;
	}
}
