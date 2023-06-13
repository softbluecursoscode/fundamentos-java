public class Aplicacao {

	public static void main(String[] args) {
		/*
		 * Observa��o: O m�todo println() recebe um Object como par�metro. Para imprimir a informa��o na 
		 * tela, o Java chama o m�todo toString() do objeto. Logo, se a classe do objeto sobrescreve o 
		 * m�todo toString(), este m�todo ser� chamado (polimorfismo)
		 */

		// Cria um ponto 2D
		Ponto2D p1 = new Ponto2D(10, 2);
		
		// Imprime p1
		System.out.println(p1);

		// Cria um ponto 3D
		Ponto3D p2 = new Ponto3D(5, 2, 1);
		
		// Imprime p2
		System.out.println(p2);
	}
}
