import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


public class Produto {

	// Formatador de data
	private static final DateFormat df = DateFormat.getDateInstance();

	// Nome do produto
	private String nome;
	
	// Peso do produto
	private double peso;
	
	// Data de validade
	private Date dataValidade;
	
	// Construtor. Recebe nome, peso e data de validade
	public Produto(String nome, double peso, int dia, int mes, int ano) {
		this.nome = nome;
		this.peso = peso;
		
		// Cria um Calendar e seta os componentes da data
		Calendar c = Calendar.getInstance();
		c.set(ano, mes - 1, dia);
		
		// Atribui a data no atributo Date
		this.dataValidade = c.getTime();
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	// Obtém a data formatada como uma string no padrão curto
	public String getFormattedDataValidate() {
		return df.format(dataValidade);
	}
}
