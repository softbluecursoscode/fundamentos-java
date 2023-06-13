package softblue.agenda;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Representa a agenda de contatos
 */
public class Agenda {

	/**
	 * Map de contatos. A chave é o nome do contato e o valor é o próprio objeto Contato.
	 */
	private Map<String, Contato> contatosMap = new TreeMap<String, Contato>();
	
	/**
	 * Map que organiza os contatos por letras do alfabeto (para facilitar a busca).
	 * A chave é a letra e o valor é uma lista de contatos, cujo nome começa com a letra especificada
	 * na chave do map.
	 */
	private Map<Character, List<Contato>> contatosPorLetrasMap = new TreeMap<Character, List<Contato>>();
	
	/**
	 * Gerenciador do arquivo que contém os registros da agenda
	 */
	private ArquivoAgenda arquivo = new ArquivoAgenda();
	
	/**
	 * Construtor. Ao criar o objeto, os registros cadastrados no arquivo são lidos e adicionados à 
	 * agenda (caso existam)
	 * @throws IOException
	 */
	public Agenda() throws IOException {
		// Obtém os registros cadastrados
		List<Contato> contatos = arquivo.ler();
		
		for (Contato contato : contatos) {
			try {
				// Insere cada contato lido do arquivo na agenda
				inserir(contato);
			} catch (AgendaException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Insere um contato na agenda.
	 * @param contato Contato a ser inserido
	 * @throws AgendaException
	 * @throws IOException
	 */
	public void inserir(Contato contato) throws AgendaException, IOException {
		// Valida os dados do contato
		contato.validarDados();
		
		// Verifica se o nome do contato já não existe
		String nome = contato.getNome();
		if (contatosMap.containsKey(nome)) {
			throw new AgendaException("O contato " + " nome já existe");
		}
		
		// Adiciona o contato ao map
		contatosMap.put(nome, contato);
		
		// Obtém a letra inicial do nome do contato e adiciona o contato adequadamente
		// na coleção que organiza os contatos por letra inicial do nome
		char letraInicial = Character.toUpperCase(nome.charAt(0));
		List<Contato> contatosLetra = contatosPorLetrasMap.get(letraInicial);
		if (contatosLetra == null) {
			contatosLetra = new ArrayList<Contato>();
			contatosPorLetrasMap.put(letraInicial, contatosLetra);
		}
		contatosLetra.add(contato);
		
		// Depois de adicionar o contato nas coleções, atualiza o arquivo
		arquivo.gravar(contatosMap.values());
	}
	
	/**
	 * Exclui um contato da agenda.
	 * @param nome Nome do contato a ser excluído.
	 * @throws AgendaException
	 * @throws IOException
	 */
	public void excluir(String nome) throws AgendaException, IOException {
		// Verifica se o contato realmente existe
		verificarExistenciaContato(nome);
		
		// Obtém o contato associado ao nome
		Contato contato = obterContato(nome);
		
		// Remove o contato do map
		contatosMap.remove(nome);
		
		// Remove o objeto da lista que está dentro do Map de contatos por letras
		List<Contato> contatos = contatosPorLetrasMap.get(nome.toUpperCase().charAt(0));
		contatos.remove(contato);
		
		// Se depois da remoção não sobrar nenhum contato com a letra do nome no Map, exclui o registro do Map
		if (contatos.size() == 0) {
			contatosPorLetrasMap.remove(nome.toUpperCase().charAt(0));
		}
		
		// Atualiza o arquivo de contatos
		arquivo.gravar(contatosMap.values());
	}
	
	/**
	 * Altera um contato da agenda.
	 * @param contato Contato a ser alterado.
	 * @throws AgendaException
	 * @throws IOException
	 */
	public void alterar(Contato contato) throws AgendaException, IOException {
		// Valida os dados do contato
		contato.validarDados();
		
		// Verifica se o contato sendo alterado existe realmente (apenas o telefone do contato
		// pode mudar)
		verificarExistenciaContato(contato.getNome());
		
		// Atualiza o arquivo de contatos
		arquivo.gravar(contatosMap.values());
	}
	
	/**
	 * Verifica se um determinado contato já existe.
	 * @param nome Contato a ser verificado.
	 * @throws AgendaException Lançada se o contato não existir
	 */
	private void verificarExistenciaContato(String nome) throws AgendaException {
		// O método containsKey() checa se determinada chave existe no map
		if (!contatosMap.containsKey(nome)) {
			throw new AgendaException("Contato " + nome + " não encontrado");
		}
	}
	
	/**
	 * Obtém uma lista de contatos que iniciam com determinada letra.
	 * @param letra Letra a ser usada na busca pelos contatos.
	 * @return Lista de contatos que atendem ao critério.
	 */
	public List<Contato> listarContatosPorLetra(char letra) {
		List<Contato> contatos = contatosPorLetrasMap.get(Character.toUpperCase(letra));
		if (contatos == null) {
			return new ArrayList<Contato>();
		}
		return contatos;
	}
	
	/**
	 * Obtém uma lista de contatos com base em parte do nome
	 * @param parteNome Parte do nome a ser procurada
	 * @return Lista de contatos que atendem ao critério
	 */
	public List<Contato> listarContatosPorParteNome(String parteNome) {
		// Procura por contatos que iniciam ou terminam por 0 ou mais caracteres e possuem, no meio,
		// a string fornecida como parâmetro
		String regex = "\\w*" + parteNome + "\\w*";
		
		// A flag CASE_INSENSITIVE garante que a comparação é feita desconsiderando maiúsculas e
		// minúsculas
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		
		// Lista para armazenar os contatos que atendem aos critérios
		List<Contato> contatosEncontrados = new ArrayList<Contato>();
		
		// Lista dos contatos existentes atualmente. O método values() retorna os valores do map
		// em forma de uma collection
		Collection<Contato> contatosCadastrados = contatosMap.values();
		
		// Itera sobre os contatos cadastrados procurando pelo padrão fornecido e os adiciona na 
		// lista que será retornada
		for (Contato contato : contatosCadastrados) {
			Matcher m = p.matcher(contato.getNome());
			if (m.matches()) {
				contatosEncontrados.add(contato);
			}
		}
		
		return contatosEncontrados;
	}
	
	/**
	 * Obtém o objeto do contato cadastrado a partir de um nome
	 * @param nome Nome do contato
	 * @return Objeto que representa o contato
	 */
	public Contato obterContato(String nome) {
		return contatosMap.get(nome);
	}
}
