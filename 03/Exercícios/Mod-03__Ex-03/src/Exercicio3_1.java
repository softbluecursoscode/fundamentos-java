


public class Exercicio3_1 {

	public static void main(String[] args) {
		//valor para o qual o fatorial será calculado
		int valor = 10;
		
		//esta variável acumula o resultado
		long resposta = 1;
	
		//no bloco for, o valor já calculado (variável resposta) é multiplicado com o valor de i,
		//que é o número corrente da iteração.
		for (int i = 2; i <= valor; i++) {
			resposta *= i;
		}

		System.out.println("O fatorial de " + valor + " é igual a " + resposta);
	}
}
