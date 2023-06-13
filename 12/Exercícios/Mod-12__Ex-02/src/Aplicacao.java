import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;


public class Aplicacao {

	public static void main(String[] args) {

		// Cria alguns produtos
		Produto p1 = new Produto("Laranja", 2.5);
		Produto p2 = new Produto("Laranja", 2.7);
		Produto p3 = new Produto("Maçã", 1.45);
		Produto p4 = new Produto("Mamão", 4.95);
		Produto p5 = new Produto("Limão", 2.3);
		
		// Cria um objeto Produtos indicando que os produtos devem ser armazenados num ArrayList. Um 
		// ArrayList mantém a ordem de inserção e aceita elementos duplicados.
		Produtos produtos = new Produtos(new ArrayList<Produto>());
		
		// Adiciona os produtos e imprime
		produtos.adicionar(p1);
		produtos.adicionar(p2);
		produtos.adicionar(p3);
		produtos.adicionar(p4);
		produtos.adicionar(p5);
		produtos.imprimirProdutos();
		
		// Muda para HashSet. Perceba que agora os produtos não terão ordem definida (vai depender do 
		// código hash gerado), mas os produtos duplicados serão removidos.
		produtos.mudarColecao(new HashSet<Produto>());
		produtos.imprimirProdutos();
		
		// Muda para TreeSet. Perceba que agora os produtos serão ordenados por valor, 
		// já que é o que foi especificado no método compareTo(). Como é um Set, os elementos duplicados
		// continuam não existindo
		produtos.mudarColecao(new TreeSet<Produto>());
		produtos.imprimirProdutos();
	}
}
