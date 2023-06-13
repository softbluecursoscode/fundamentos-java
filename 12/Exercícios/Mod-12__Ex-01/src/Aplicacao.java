import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {

		// Declara o tabuleiro como sendo uma matriz
		char[][] tabuleiro = new char[3][3];
		
		// Faz uma limpeza no tabuleiro, atribuindo todas as posições com ' '
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
		
		// Cria a lista de jogadas. Cada elemento da lista é um array de int
		List<int[]> jogadas = new ArrayList<int[]>();
		
		// Adiciona as jogadas na lista.
		// Por ser um ArrayList, a ordem dentro da lista é mantida (segue a ordem de inserção)
		jogadas.add(new int[] { 1, 1, 'X' });
		jogadas.add(new int[] { 2, 2, 'O' });
		jogadas.add(new int[] { 2, 0, 'X' });
		jogadas.add(new int[] { 0, 2, 'O' });
		jogadas.add(new int[] { 1, 2, 'X' });
		jogadas.add(new int[] { 1, 0, 'O' });
		
		// Executa as jogadas. Itera sobre cada jogada da lista
		for (int[] jogada : jogadas) {
			// Uma jogada é um array de 3 posições
			int linha = jogada[0]; // linha da jogada
			int coluna = jogada[1]; // coluna da jogada
			char simbolo = (char) jogada[2]; // símbolo da jogada ('X' ou 'O')
			
			// Realiza a jogada, colocando o símbolo no tabuleiro na posição especificada
			tabuleiro[linha][coluna] = simbolo;
		}
		
		// Faz um loop para imprimir os dados do tabuleiro
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				// O método print() não adiciona quebra de linha
				System.out.print(tabuleiro[i][j] + " ");
			}
			// Imprime apenas uma quebra de linha
			System.out.println();
		}
	}
}
