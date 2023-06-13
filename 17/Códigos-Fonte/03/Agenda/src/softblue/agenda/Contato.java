package softblue.agenda;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Contato da agenda
 */
public class Contato {

	/**
	 * Nome do contato
	 */
	private String nome;

	/**
	 * Telefone do contato 
	 */
	private String telefone;
	
	/**
	 * Construtor
	 * @param nome Nome do contato
	 * @param telefone Telefone do contato
	 */
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * Valida os dados do contato
	 * @throws AgendaException Lançada se ocorrer alguma falha na validação
	 */
	public void validarDados() throws AgendaException {
		validarNome();
		validarTelefone();
	}
	
	/**
	 * Valida o nome. Ele não pode ser vazio.
	 * @throws AgendaException Lançada se ocorrer alguma falha na validação
	 */
	private void validarNome() throws AgendaException {
		if (nome == null || nome.trim().length() == 0) {
			throw new AgendaException("O nome do contato não pode ser vazio");
		}
	}
	
	/**
	 * Valida o telefone. Ele deve estar no padrão 'XXXX-XXXX'
	 * @throws AgendaException Lançada se ocorrer alguma falha na validação
	 */
	private void validarTelefone() throws AgendaException {
		// Utiliza uma expressão regular para fazer a validação
		String regex = "\\d\\d\\d\\d-\\d\\d\\d\\d";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(telefone);
		
		if (!m.matches()) {
			throw new AgendaException("O telefone " + telefone + " não é válido");
		}
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return nome + " -> " + telefone;
	}
}
