import java.text.NumberFormat;
import java.util.Locale;

// Classe que representa um produto. Implementa a interface Comparable, então objetos desta classe
// podem ser ordenados
public class Produto implements Comparable<Produto> {
	
	// Formatador usado para formatar o valor do produto no formato da moeda brasileira
	private static NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	// Nome do produto
	private String nome;
	
	// Valor do produto
	private double valor;
	
	// Construtor, recebe um nome e valor do produto
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	// Método getter do nome
	public String getNome() {
		return nome;
	}

	// Método getter do valor
	public double getValor() {
		return valor;
	}

	// A implementação do compareTo() ordena os produtos por ordem crescente de valor.
	public int compareTo(Produto p) {
		Double valor1 = Double.valueOf(this.valor);
		Double valor2 = Double.valueOf(p.valor);
		
		// Utiliza o método compareTo() da classe Double, que já efetua a comparação dos números
		return valor1.compareTo(valor2);
	}
	
	// O método toString() formata o produto para impressão
	public String toString() {
		return String.format("%-10s %7s", nome, nf.format(valor));
	}

	/*
	 * Elementos que são inseridos em um Set normalmente devem implementar os métodos equals() e 
	 * hashCode(). Eles definem o que são elementos iguais e diferentes.
	 * Neste caso, dois produtos iguais são os que tem o mesmo nome.
	 * As implementações abaixo foram geradas pelo próprio Eclipse.
	 */
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
