
public class Exercicio2_3 {

	public static void main(String[] args) {
		//r acumula o valor da soma para checar se o loop deve parar
		int r = 0;
		
		//i representa cada iteração do bloco while
		int i = 0;
		
		//para checar se a próxima iteração passará de 100, é necessário verificar se a soma de
		//r e i é menor do que 100
		while (r + i < 100) {
			System.out.println(i);
			
			//r recebe o seu valor somado com i
			r += i;
			
			//i é incrementado, indicando que esta iteração terminou
			i++;
		}
	}
}
