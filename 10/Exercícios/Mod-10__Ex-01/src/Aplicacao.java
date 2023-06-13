
public class Aplicacao {

	public static void main(String[] args) {
		/*
		 * Este m�todo chama os m�todos est�ticos da classe Matematica. Perceba que apenas tipos primitivos 
		 * s�o utilizados como par�metro para os m�todos, e nunca as classes wrappers. Esta � uma forma de 
		 * exercitar o autoboxing
		 */
		
		// Converte um �ngulo de graus para radianos
		double anguloConvertido = Matematica.converterAngulo(90.0, Matematica.TipoAngulo.GRAUS);
		System.out.println(anguloConvertido);
		
		// Converte um �ngulo de radianos para graus
		anguloConvertido = Matematica.converterAngulo(1.57, Matematica.TipoAngulo.RADIANOS);
		System.out.println(anguloConvertido);
		
		// Faz a soma de alguns n�meros
		int soma = Matematica.somar(10, 2, 4);
		System.out.println(soma);
		
		// Converte um valor bin�rio para decimal
		int valorDecimal = Matematica.converterBinarioParaDecimal("1011");
		System.out.println(valorDecimal);
	}
}
