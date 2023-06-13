
public class Matematica {

	// Enum com os tipos de um �ngulo
	public enum TipoAngulo {
		GRAUS,
		RADIANOS
	}
	
	// Converte um �ngulo de radianos para graus ou vice-versa.
	public static Double converterAngulo(Double angulo, TipoAngulo tipo) {
		// Os m�todos toRadians() e toDegrees() da classe Math s�o chamados para fazer a convers�o
		if (tipo == TipoAngulo.GRAUS) {
			return Math.toRadians(angulo);
		} else {
			return Math.toDegrees(angulo);
		}
	}
	
	// Soma os n�meros passados como par�metros
	public static Integer somar(Integer n1, Integer n2, Integer n3) {
		// O Java cuida do unboxing (para fazer a soma) e do boxing (para retornar o resultado)
		return n1 + n2 + n3;
	}
	
	// Converte um n�mero bin�rio para decimal
	public static Integer converterBinarioParaDecimal(String numBinario) {
		// O m�todo valueOf() de Integer permite fornecer uma base de n�mero
		Integer valor = Integer.valueOf(numBinario, 2);
		return valor;
	}
}
