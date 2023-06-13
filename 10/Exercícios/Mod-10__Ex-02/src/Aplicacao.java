
public class Aplicacao {

	public static void main(String[] args) {

		// Executa uma soma
		double valorSoma = Operacao.SOMA.calcular(10, 5);
		System.out.println(Operacao.SOMA + " -> " + valorSoma);
		
		// Executa uma subtração
		double valorSubtracao = Operacao.SUBTRACAO.calcular(30, 10);
		System.out.println(Operacao.SUBTRACAO + " -> " + valorSubtracao);
		
		// Executa uma multiplicação
		double valorMultiplicao = Operacao.MULTIPLICACAO.calcular(9, 8);
		System.out.println(Operacao.MULTIPLICACAO + " -> " + valorMultiplicao);
		
		// Executa uma divisão
		double valorDivisao = Operacao.DIVISAO.calcular(7, 2);
		System.out.println(Operacao.DIVISAO + " -> " + valorDivisao);
	}
}
