package softblue.agenda;
import java.io.IOException;
import java.util.List;


/**
 * Controle o fluxo da aplicação
 */
public class Aplicacao {
	/**
	 * Menu de opções 
	 */
	private Menu menu;
	
	/**
	 * Agenda de contatos
	 */
	private Agenda agenda;

	/**
	 * Inicia a aplicação
	 * @throws IOException
	 */
	public void iniciar() throws IOException {
		menu = new Menu();
		agenda = new Agenda();
		
		int opcao = 0;
		
		// Fica em loop enquanto o usuário não escolher a opção 'Sair'
		while (opcao != Menu.OPCAO_SAIR) {
			try {
				// Exibe o menu e aguarda uma escolha do usuário
				opcao = menu.exibirOpcoes();
				
				// Verifica a opção escolhida
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
				// Se ocorrer uma exceção, mostra a mensagem de erro e continua o loop
				System.out.println("Erro: " + e.getMessage());
				System.out.println();
			}
		}
		
		System.out.println("Fim da aplicação!");
	}
	
	/**
	 * Opção de inserção
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
	 * Opção de alteração
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
			throw new AgendaException("O contato " + nome + " não existe");
		}
		
		System.out.print("Telefone: ");
		String telefone = Console.readString();
		
		contato.setTelefone(telefone);
		agenda.alterar(contato);
		
		System.out.println("Contato alterado!");
		System.out.println();
	}
	
	/**
	 * Opção de exclusão
	 * @throws AgendaException
	 * @throws IOException
	 */
	private void excluir() throws AgendaException, IOException {
		// Solicita o nome
		System.out.print("Nome: ");
		String nome = Console.readString();
		
		// Exclui o contato
		agenda.excluir(nome);
		
		System.out.println("Contato excluído!");
		System.out.println();
	}
	
	/**
	 * Opção de listagem por letra
	 * @throws AgendaException
	 */
	private void listarPorLetra() throws AgendaException {
		// Solicita a letra
		System.out.print("Letra: ");
		char letra = Console.readChar();
		
		// Obtém os contatos com base na letra
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
	 * Opção de procura
	 * @throws AgendaException
	 */
	private void procurar() throws AgendaException {
		// Solicita a parte do nome para a busca
		System.out.print("Parte do nome: ");
		String parteNome = Console.readString();
		
		// Obtém os contatos com base na parte do nome
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
