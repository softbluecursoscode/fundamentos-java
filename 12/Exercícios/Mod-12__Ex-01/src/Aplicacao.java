import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {

		// Declara o tabuleiro como sendo uma matriz
		char[][] tabuleiro = new char[3][3];
		
		// Faz uma limpeza no tabuleiro, atribuindo todas as posi��es com ' '
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
		
		// Cria a lista de jogadas. Cada elemento da lista � um array de int
		List<int[]> jogadas = new ArrayList<int[]>();
		
		// Adiciona as jogadas na lista.
		// Por ser um ArrayList, a ordem dentro da lista � mantida (segue a ordem de inser��o)
		jogadas.add(new int[] { 1, 1, 'X' });
		jogadas.add(new int[] { 2, 2, 'O' });
		jogadas.add(new int[] { 2, 0, 'X' });
		jogadas.add(new int[] { 0, 2, 'O' });
		jogadas.add(new int[] { 1, 2, 'X' });
		jogadas.add(new int[] { 1, 0, 'O' });
		
		// Executa as jogadas. Itera sobre cada jogada da lista
		for (int[] jogada : jogadas) {
			// Uma jogada � um array de 3 posi��es
			int linha = jogada[0]; // linha da jogada
			int coluna = jogada[1]; // coluna da jogada
			char simbolo = (char) jogada[2]; // s�mbolo da jogada ('X' ou 'O')
			
			// Realiza a jogada, colocando o s�mbolo no tabuleiro na posi��o especificada
			tabuleiro[linha][coluna] = simbolo;
		}
		
		// Faz um loop para imprimir os dados do tabuleiro
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				// O m�todo print() n�o adiciona quebra de linha
				System.out.print(tabuleiro[i][j] + " ");
			}
			// Imprime apenas uma quebra de linha
			System.out.println();
		}
	}
}
