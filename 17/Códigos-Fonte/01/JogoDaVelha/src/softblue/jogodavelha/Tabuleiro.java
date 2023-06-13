package softblue.jogodavelha;


/**
 * Tabuleiro do jogo
 */
public class Tabuleiro {

	/**
	 * Matriz que representa o jogo 
	 */
	private char[][] matriz;

	/**
	 * Construtor.
	 */
	public Tabuleiro() {
		// Criar a matriz 3x3
		matriz = new char[3][3];
		
		// Zera todos os elementos da matriz
		zerar();
	}

	/**
	 * Zera os elementos da matriz. Zerar significa colocoar um espaço em branco
	 * em cada posição
	 */
	public void zerar() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = ' ';
			}
		}
	}

	/**
	 * Imprime os elementos da matriz no console
	 */
	public void imprimir() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
				if (j < matriz[0].length - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();

			if (i < matriz.length - 1) {
				System.out.println("---------");
			}
		}
		System.out.println();
	}

	/**
	 * Verifica se ainda existem posições no tabuleiro onde ainda não houve jogada.
	 * @return true se o tabuleiro está completo; false, caso contrário
	 */
	public boolean isCompleto() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Realizar a jogada especificada pelo jogador
	 * @param jogada Jogada do jogador
	 * @param simbolo Símbolo a ser inserido no tabuleiro 
	 * @return true se uma sequência foi encontrada após a realização da jogada; false, caso contrário
	 * @throws JogadaInvalidaException Lançada se ocorrer algum problema com a jogada
	 */
	public boolean efetuarJogada(Jogada jogada, char simbolo) throws JogadaInvalidaException {
		int i = jogada.getI();
		int j = jogada.getJ();

		// Verifica se a jogada está fora dos limites da matriz
		if (i < 0 || j < 0 || i >= matriz.length || j >= matriz[0].length) {
			throw new JogadaInvalidaException("A jogada é inválida");
		}

		// Verifica se a jogada já não foi realizada
		if (matriz[i][j] != ' ') {
			throw new JogadaInvalidaException("Esta jogada já foi realizada");
		}

		// Coloca o símbolo na posição especificada
		matriz[i][j] = simbolo;

		// Verifica se houve uma sequência
		return isSequenciaEncontrada();
	}

	/**
	 * Checa se uma sequência de 3 símbolos foi encontrada
	 * @return true se uma sequência foi encontrada; false, caso contrário
	 */
	private boolean isSequenciaEncontrada() {
		if(matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2] && matriz[0][0] != ' ') {
			return true;
		}
		
		if(matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2] && matriz[1][0] != ' ') {
			return true;
		}
		
		if(matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2] && matriz[2][0] != ' ') {
			return true;
		}
		
		if(matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0] && matriz[0][0] != ' ') {
			return true;
		}
		
		if(matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1] && matriz[0][1] != ' ') {
			return true;
		}
	
		if(matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2] && matriz[0][2] != ' ') {
			return true;
		}
		
		if(matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != ' ') {
			return true;
		}
		
		if(matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != ' ') {
			return true;
		}
	
		return false;
	}
}
