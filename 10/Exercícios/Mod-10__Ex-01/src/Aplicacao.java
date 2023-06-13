
public class Aplicacao {

	public static void main(String[] args) {
		/*
		 * Este método chama os métodos estáticos da classe Matematica. Perceba que apenas tipos primitivos 
		 * são utilizados como parâmetro para os métodos, e nunca as classes wrappers. Esta é uma forma de 
		 * exercitar o autoboxing
		 */
		
		// Converte um ângulo de graus para radianos
		double anguloConvertido = Matematica.converterAngulo(90.0, Matematica.TipoAngulo.GRAUS);
		System.out.println(anguloConvertido);
		
		// Converte um ângulo de radianos para graus
		anguloConvertido = Matematica.converterAngulo(1.57, Matematica.TipoAngulo.RADIANOS);
		System.out.println(anguloConvertido);
		
		// Faz a soma de alguns números
		int soma = Matematica.somar(10, 2, 4);
		System.out.println(soma);
		
		// Converte um valor binário para decimal
		int valorDecimal = Matematica.converterBinarioParaDecimal("1011");
		System.out.println(valorDecimal);
	}
}
