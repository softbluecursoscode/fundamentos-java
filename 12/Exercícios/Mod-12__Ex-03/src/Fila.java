

/*
 * Coleção de dados do tipo fila. Na fila, o primeiro elemento a ser adicionado é o primeiro a ser removido.
 */
public class Fila extends Colecao {
	
	/* Posição onde o próximo elemento deve ser inserido */
	protected int posInserir;
	
	/* Posição onde o próximo elemento deve ser removido */
	protected int posRemover;
	
	public Fila() {
		super();
	}

	public Fila(int tamanho) {
		super(tamanho);
	}

	/* Insere um item na próxima posição de inserção */
	public void inserirItem(Object item) {
		itens[posInserir] = item;
		posInserir++;
	}

	/* Remove o item da posição de remoção */
	public Object removerItem() {
		Object item = itens[posRemover];
		itens[posRemover] = null;
		posRemover++;
		return item;
	}
}
