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
	 * @throws AgendaException Lan�ada se ocorrer alguma falha na valida��o
	 */
	public void validarDados() throws AgendaException {
		validarNome();
		validarTelefone();
	}
	
	/**
	 * Valida o nome. Ele n�o pode ser vazio.
	 * @throws AgendaException Lan�ada se ocorrer alguma falha na valida��o
	 */
	private void validarNome() throws AgendaException {
		if (nome == null || nome.trim().length() == 0) {
			throw new AgendaException("O nome do contato n�o pode ser vazio");
		}
	}
	
	/**
	 * Valida o telefone. Ele deve estar no padr�o 'XXXX-XXXX'
	 * @throws AgendaException Lan�ada se ocorrer alguma falha na valida��o
	 */
	private void validarTelefone() throws AgendaException {
		// Utiliza uma express�o regular para fazer a valida��o
		String regex = "\\d\\d\\d\\d-\\d\\d\\d\\d";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(telefone);
		
		if (!m.matches()) {
			throw new AgendaException("O telefone " + telefone + " n�o � v�lido");
		}
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return nome + " -> " + telefone;
	}
}
