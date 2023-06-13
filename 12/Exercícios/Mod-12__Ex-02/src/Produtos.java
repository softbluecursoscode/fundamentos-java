import java.util.Collection;


// Esta classe representa uma cole��o de produtos
public class Produtos {

	// Cole��o de produtos. � referenciado por uma Collection para permitir que o tipo de cole��o
	// onde os produtos s�o armazenados varie
	public Collection<Produto> produtos;
	
	// Construtor de produtos. Recebe uma cole��o (preferencialmente vazia)
	public Produtos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}
	
	// Muda o tipo de cole��o dos produtos adicionados. Basta fornecer uma nova cole��o (vazia) e os 
	// produtos da cole��o antiga s�o copiados para a nova
	public void mudarColecao(Collection<Produto> produtos) {
		Collection<Produto> temp = this.produtos;
		this.produtos = produtos;
		
		// O m�todo addAll() adiciona todos os elementos de uma cole��o em outra cole��o
		this.produtos.addAll(temp);
	}
	
	// Adiciona um produto � cole��o
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	// Imprime os produtos da cole��o
	public void imprimirProdutos() {
		// A linha abaixo mostra o nome da classe da cole��o onde os produtos est�o armazenados
		System.out.println("Produtos armazenados em: " + produtos.getClass().getName());
		for (Produto p : produtos) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------------------");
	}
	
	
}
