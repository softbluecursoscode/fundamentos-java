import java.util.Collection;


// Esta classe representa uma coleção de produtos
public class Produtos {

	// Coleção de produtos. É referenciado por uma Collection para permitir que o tipo de coleção
	// onde os produtos são armazenados varie
	public Collection<Produto> produtos;
	
	// Construtor de produtos. Recebe uma coleção (preferencialmente vazia)
	public Produtos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}
	
	// Muda o tipo de coleção dos produtos adicionados. Basta fornecer uma nova coleção (vazia) e os 
	// produtos da coleção antiga são copiados para a nova
	public void mudarColecao(Collection<Produto> produtos) {
		Collection<Produto> temp = this.produtos;
		this.produtos = produtos;
		
		// O método addAll() adiciona todos os elementos de uma coleção em outra coleção
		this.produtos.addAll(temp);
	}
	
	// Adiciona um produto à coleção
	public void adicionar(Produto produto) {
		produtos.add(produto);
	}
	
	// Imprime os produtos da coleção
	public void imprimirProdutos() {
		// A linha abaixo mostra o nome da classe da coleção onde os produtos estão armazenados
		System.out.println("Produtos armazenados em: " + produtos.getClass().getName());
		for (Produto p : produtos) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------------------");
	}
	
	
}
