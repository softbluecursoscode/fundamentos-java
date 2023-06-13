
public class Matematica {

	// Enum com os tipos de um ângulo
	public enum TipoAngulo {
		GRAUS,
		RADIANOS
	}
	
	// Converte um ângulo de radianos para graus ou vice-versa.
	public static Double converterAngulo(Double angulo, TipoAngulo tipo) {
		// Os métodos toRadians() e toDegrees() da classe Math são chamados para fazer a conversão
		if (tipo == TipoAngulo.GRAUS) {
			return Math.toRadians(angulo);
		} else {
			return Math.toDegrees(angulo);
		}
	}
	
	// Soma os números passados como parâmetros
	public static Integer somar(Integer n1, Integer n2, Integer n3) {
		// O Java cuida do unboxing (para fazer a soma) e do boxing (para retornar o resultado)
		return n1 + n2 + n3;
	}
	
	// Converte um número binário para decimal
	public static Integer converterBinarioParaDecimal(String numBinario) {
		// O método valueOf() de Integer permite fornecer uma base de número
		Integer valor = Integer.valueOf(numBinario, 2);
		return valor;
	}
}
