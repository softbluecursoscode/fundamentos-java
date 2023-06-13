package softblue.agenda;

/**
 * Representa o menu da aplica��o
 */
public class Menu {
	/**
	 * Constantes relacionadas �s op��es do menu
	 */
	public static final int OPCAO_INSERIR = 1;
	public static final int OPCAO_ALTERAR = 2;
	public static final int OPCAO_EXCLUIR = 3;
	public static final int OPCAO_LISTAR_LETRA = 4;
	public static final int OPCAO_PROCURAR = 5;
	public static final int OPCAO_SAIR = 6;

	/**
	 * Exibe as op��es do menu e aguarda a escolha do usu�rio
	 * @return Op��o escolhida
	 * @throws AgendaException
	 */
	public int exibirOpcoes() throws AgendaException {
		System.out.println("--- MENU DE OP��ES ---");
		System.out.println("# 1) Inserir contato");
		System.out.println("# 2) Alterar contato");
		System.out.println("# 3) Excluir contato");
		System.out.println("# 4) Listar contatos por letra");
		System.out.println("# 5) Procurar contatos");
		System.out.println("# 6) Sair");
		System.out.println();
		System.out.print("Escolha uma op��o: ");
		
		// Aguarda uma op��o
		int opcao = Console.readInt();
		
		// Checa se a op��o � v�lida
		if (opcao > OPCAO_SAIR || opcao < OPCAO_INSERIR) {
			throw new AgendaException("Op��o inv�lida");
		}
		
		// Retorna a op��o escolhida
		return opcao;
	}
}
