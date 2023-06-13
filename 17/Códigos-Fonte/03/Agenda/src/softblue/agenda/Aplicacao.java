package softblue.agenda;
import java.io.IOException;
import java.util.List;


/**
 * Controle o fluxo da aplica��o
 */
public class Aplicacao {
	/**
	 * Menu de op��es 
	 */
	private Menu menu;
	
	/**
	 * Agenda de contatos
	 */
	private Agenda agenda;

	/**
	 * Inicia a aplica��o
	 * @throws IOException
	 */
	public void iniciar() throws IOException {
		menu = new Menu();
		agenda = new Agenda();
		
		int opcao = 0;
		
		// Fica em loop enquanto o usu�rio n�o escolher a op��o 'Sair'
		while (opcao != Menu.OPCAO_SAIR) {
			try {
				// Exibe o menu e aguarda uma escolha do usu�rio
				opcao = menu.exibirOpcoes();
				
				// Verifica a op��o escolhida
				switch (opcao) {
				case Menu.OPCAO_INSERIR:
					inserir();
					break;
				case Menu.OPCAO_ALTERAR:
					alterar();
					break;
				case Menu.OPCAO_EXCLUIR:
					excluir();
					break;
				case Menu.OPCAO_LISTAR_LETRA:
					listarPorLetra();
					break;
				case Menu.OPCAO_PROCURAR:
					procurar();
					break;
				}
			
			} catch (AgendaException e) {
				// Se ocorrer uma exce��o, mostra a mensagem de erro e continua o loop
				System.out.println("Erro: " + e.getMessage());
				System.out.println();
			}
		}
		
		System.out.println("Fim da aplica��o!");
	}
	
	/**
	 * Op��o de inser��o
	 * @throws AgendaException
	 * @throws IOException
	 */
	private void inserir() throws AgendaException, IOException {
		// Solicita os dados
		System.out.print("Nome: ");
		String nome = Console.readString();
		System.out.print("Telefone: ");
		String telefone = Console.readString();
		
		// Cria o Contato e insere
		Contato contato = new Contato(nome, telefone);
		agenda.inserir(contato);
		
		System.out.println("Contato inserido!");
		System.out.println();
	}
	
	/**
	 * Op��o de altera��o
	 * @throws AgendaException
	 * @throws IOException
	 */
	private void alterar() throws AgendaException, IOException {
		// Solicita os dados
		System.out.print("Nome: ");
		String nome = Console.readString();
		
		// Cria o Contato e altera
		Contato contato = agenda.obterContato(nome);
		
		if (contato == null) {
			throw new AgendaException("O contato " + nome + " n�o existe");
		}
		
		System.out.print("Telefone: ");
		String telefone = Console.readString();
		
		contato.setTelefone(telefone);
		agenda.alterar(contato);
		
		System.out.println("Contato alterado!");
		System.out.println();
	}
	
	/**
	 * Op��o de exclus�o
	 * @throws AgendaException
	 * @throws IOException
	 */
	private void excluir() throws AgendaException, IOException {
		// Solicita o nome
		System.out.print("Nome: ");
		String nome = Console.readString();
		
		// Exclui o contato
		agenda.excluir(nome);
		
		System.out.println("Contato exclu�do!");
		System.out.println();
	}
	
	/**
	 * Op��o de listagem por letra
	 * @throws AgendaException
	 */
	private void listarPorLetra() throws AgendaException {
		// Solicita a letra
		System.out.print("Letra: ");
		char letra = Console.readChar();
		
		// Obt�m os contatos com base na letra
		List<Contato> contatos = agenda.listarContatosPorLetra(letra);
		
		System.out.println("Contatos com a letra '" + Character.toUpperCase(letra) + "':");
		
		// Exibe os contatos
		if (contatos.isEmpty()) {
			System.out.println("Nenhum contato encontrado!");
		} else {
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
		}
		System.out.println();
	}
	
	/**
	 * Op��o de procura
	 * @throws AgendaException
	 */
	private void procurar() throws AgendaException {
		// Solicita a parte do nome para a busca
		System.out.print("Parte do nome: ");
		String parteNome = Console.readString();
		
		// Obt�m os contatos com base na parte do nome
		List<Contato> contatos = agenda.listarContatosPorParteNome(parteNome);
		
		System.out.println("Contatos encontrados com a parte do nome '" + parteNome + "':");
		
		// Exibe os contatos
		if (contatos.isEmpty()) {
			System.out.println("Nenhum contato encontrado!");
		} else {
			for (Contato contato : contatos) {
				System.out.println(contato);
			}
		}
		System.out.println();
	}
}
