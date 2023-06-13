


public class Executor {

	public static void main(String[] args) {
		/* Manipula dados em uma pilha */
		Colecao c1 = new Pilha();
		manipularDados(c1);
		
		/* Manipula dados em uma fila */
		Colecao c2 = new Fila();
		manipularDados(c2);
	}
	
	/*
	 * Insere tr�s itens na cole��o e retira os tr�s itens da cole��o.
	 * Perceba a presen�a forte do polimorfismo: dependendo do tipo de par�metro passado para este m�todo,
	 * o resultado final muda.
	 */
	private static void manipularDados(Colecao c) {
		/* Insere tr�s itens */
		c.inserirItem("A");
		c.inserirItem("B");
		c.inserirItem("C");
		
		/* Remove os tr�s itens */
		String i1 = (String) c.removerItem();
		String i2 = (String) c.removerItem();
		String i3 = (String) c.removerItem();
		
		/* Imprime o resultado */
		System.out.print(i1 + ", " + i2 + ", " + i3);
		System.out.println();
	}
}
