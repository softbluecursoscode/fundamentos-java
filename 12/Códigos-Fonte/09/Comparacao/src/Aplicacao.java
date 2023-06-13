import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Aplicacao {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(4, "Arroz", 3.9);
		Produto p2 = new Produto(3, "Feijão", 3.9);
		Produto p3 = new Produto(5, "Macarrão", 2.9);
		Produto p4 = new Produto(1, "Lentilha", 6.5);
		Produto p5 = new Produto(2, "Lasanha", 8.0);
		
		//Set<Produto> produtos = new TreeSet<>();
		//Set<Produto> produtos = new TreeSet<Produto>(new DescricaoComparator());
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		//Collections.sort(produtos);
		Collections.sort(produtos, new DescricaoComparator());
		
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
