import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;


public class Aplicacao {

	public static void main(String[] args) {

		// Cria alguns produtos
		Produto p1 = new Produto("Laranja", 2.5);
		Produto p2 = new Produto("Laranja", 2.7);
		Produto p3 = new Produto("Ma��", 1.45);
		Produto p4 = new Produto("Mam�o", 4.95);
		Produto p5 = new Produto("Lim�o", 2.3);
		
		// Cria um objeto Produtos indicando que os produtos devem ser armazenados num ArrayList. Um 
		// ArrayList mant�m a ordem de inser��o e aceita elementos duplicados.
		Produtos produtos = new Produtos(new ArrayList<Produto>());
		
		// Adiciona os produtos e imprime
		produtos.adicionar(p1);
		produtos.adicionar(p2);
		produtos.adicionar(p3);
		produtos.adicionar(p4);
		produtos.adicionar(p5);
		produtos.imprimirProdutos();
		
		// Muda para HashSet. Perceba que agora os produtos n�o ter�o ordem definida (vai depender do 
		// c�digo hash gerado), mas os produtos duplicados ser�o removidos.
		produtos.mudarColecao(new HashSet<Produto>());
		produtos.imprimirProdutos();
		
		// Muda para TreeSet. Perceba que agora os produtos ser�o ordenados por valor, 
		// j� que � o que foi especificado no m�todo compareTo(). Como � um Set, os elementos duplicados
		// continuam n�o existindo
		produtos.mudarColecao(new TreeSet<Produto>());
		produtos.imprimirProdutos();
	}
}
