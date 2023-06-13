package softblue.jogoforca.utils;


/**
 * Métodos utilitários relacionados a números randômicos
 */
public class RandomUtils {

	/**
	 * Gera um número randômico entre min (inclusive) e max. O valor máximo que pode ser 
	 * gerado será max-1
	 * @param min Valor mínimo do intervalo
	 * @param max Valor máximo do intervalo
	 * @return Número randômico gerado
	 */
	public static int gerarNumeroRandomico(int min, int max) {
		int intervalo = max - min;
		return (int) (Math.random() * intervalo) + min;
	}
	
}
