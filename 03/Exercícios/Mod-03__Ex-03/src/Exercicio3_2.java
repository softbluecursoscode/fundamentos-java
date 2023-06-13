


public class Exercicio3_2 {

	public static void main(String[] args) {
		//valor para o qual o fatorial será calculado
		int valor = 10;
		
		//calcula o fatorial do valor
		int resposta = calcularFatorial(valor);

		System.out.println("O fatorial de " + valor + " é igual a " + resposta);
	}
	
	/*
	 * Uma das formas de implementar o cálculo do fatorial é utilizar uma chamada recursiva, isto é,
	 * a função chama ela mesma.
	 */
	static int calcularFatorial(int num) {
		if (num == 0) {
			//para num == 0, o fatorial é 1
			return 1;
		}
		
		//caso contrário, o fatorial é o número multiplicado pelo fatorial do seu antecessor
		return num * calcularFatorial(num - 1);
	}
}
