

public class Exercicio2_2 {

	public static void main(String[] args) {
		
		//variável para aculular a soma dos valores (inicia em 0)
		int soma = 0;
		
		//for de 1 até 100
		for (int i = 1; i <= 100; i += 2) {
			//para cada iteração do for, soma recebe o seu valor anterior somado com o valor de i
			soma = soma + i;
		}
		
		System.out.println(soma);
	}
}
