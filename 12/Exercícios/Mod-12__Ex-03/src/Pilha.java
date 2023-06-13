

/*
 * Coleção de dados do tipo pilha. Na pilha, o último elemento a ser adicionado é o primeiro a ser removido.
 */
public class Pilha extends Colecao {
	
	/* Posição do elemento que está no topo da pilha */
	protected int posAtual;
	
	public Pilha() {
		super();
	}

	public Pilha(int tamanho) {
		super(tamanho);
	}

	/* Insere um item na coleção */
	public void inserirItem(Object item) {
		itens[posAtual] = item;
		posAtual++;
	}

	/* Remove o último elemento adicionado à coleção */
	public Object removerItem() {
		posAtual--;
		Object item = itens[posAtual];
		itens[posAtual] = null;
		return item;
	}
}
