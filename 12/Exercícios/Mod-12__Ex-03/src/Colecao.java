

/*
 * Representa uma coleção de dados
 */
public class Colecao {

	/* Array de itens da coleção. Como são arrays de Object, podem armazenar qualquer coisa */
	protected Object[] itens;
	
	/* Construtor que recebe o tamanho da coleção como parâmetro */
	public Colecao(int tamanho) {
		itens = new Object[tamanho];
	}
	
	/* Construtor que assume o tamanho 10 por padrão */
	public Colecao() {
		this(10);
	}
	
	/* Insere um item. Este método é sobrescrito pelas subclasses */
	public void inserirItem(Object item) {
	}
	
	/* Remove um item. Este método é sobrescrito pelas subclasses */
	public Object removerItem() {
		return null;
	}
}
