package softblue.agenda;

/**
 * Representa o menu da aplicação
 */
public class Menu {
	/**
	 * Constantes relacionadas às opções do menu
	 */
	public static final int OPCAO_INSERIR = 1;
	public static final int OPCAO_ALTERAR = 2;
	public static final int OPCAO_EXCLUIR = 3;
	public static final int OPCAO_LISTAR_LETRA = 4;
	public static final int OPCAO_PROCURAR = 5;
	public static final int OPCAO_SAIR = 6;

	/**
	 * Exibe as opções do menu e aguarda a escolha do usuário
	 * @return Opção escolhida
	 * @throws AgendaException
	 */
	public int exibirOpcoes() throws AgendaException {
		System.out.println("--- MENU DE OPÇÕES ---");
		System.out.println("# 1) Inserir contato");
		System.out.println("# 2) Alterar contato");
		System.out.println("# 3) Excluir contato");
		System.out.println("# 4) Listar contatos por letra");
		System.out.println("# 5) Procurar contatos");
		System.out.println("# 6) Sair");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		
		// Aguarda uma opção
		int opcao = Console.readInt();
		
		// Checa se a opção é válida
		if (opcao > OPCAO_SAIR || opcao < OPCAO_INSERIR) {
			throw new AgendaException("Opção inválida");
		}
		
		// Retorna a opção escolhida
		return opcao;
	}
}
