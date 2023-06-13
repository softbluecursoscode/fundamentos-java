package softblue.jogodavelha;

import java.util.ArrayList;
import java.util.List;

import softblue.jogodavelha.io.Console;
import softblue.jogodavelha.pontuacao.GerenciadorPontuacao;
import softblue.jogodavelha.pontuacao.GerenciadorPontuacaoArquivo;


/**
 * Possui a lógica do jogo
 */
public class Jogo {
	/**
	 * Tabuleiro do jogo
	 */
	private Tabuleiro tabuleiro = new Tabuleiro();
	
	/**
	 * Lista com os dois jogadores que vão jogar o jogo
	 */
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	
	/**
	 * Gerenciador de pontuação
	 */
	private GerenciadorPontuacao gerenciadorPontuacao;

	/**
	 * Inicia o jogo
	 * @throws JogoDaVelhaException Lançada se ocorrer algum problema durante o andamento do jogo
	 */
	public void jogar() throws JogoDaVelhaException {

		System.out.println("=================");
		System.out.println("| JOGO DA VELHA |");
		System.out.println("=================");
		System.out.println();

		// Inicializa o gerenciador de pontuação
		gerenciadorPontuacao = new GerenciadorPontuacaoArquivo();

		// Solicita o nome do primeiro jogador, cria o jogador e o adiciona na lista
		System.out.print("Nome do Jogador 1: ");
		String nome = Console.readString();
		jogadores.add(new Jogador(nome, 'X'));

		// Se o jogador com este nome já tiver uma pontuação gravada, mostra o número de vitórias
		Integer pontuacao = gerenciadorPontuacao.getPontuacao(nome);
		
		String msg = "O jogador %s já possui %d %s!\n";
		
		if (pontuacao != null) {
			System.out.format(msg, nome, pontuacao, pontuacao == 1 ? "vitória" : "vitórias");
		}

		// Solicita o nome do segundo jogador, cria o jogador e o adiciona na lista
		System.out.print("Nome do Jogador 2: ");
		nome = Console.readString();
		jogadores.add(new Jogador(nome, 'O'));

		// Se o jogador com este nome já tiver uma pontuação gravada, mostra o número de vitórias
		pontuacao = gerenciadorPontuacao.getPontuacao(nome);
		if (pontuacao != null) {
			System.out.format(msg, nome, pontuacao, pontuacao == 1 ? "vitória" : "vitórias");
		}

		// Controla se o jogo está finalizado ou não
		boolean finalizado = false;
		
		// Índice do jogador atual. 0 para o jogador 1 e 1 para o jogador 2
		int indexJogadorAtual = 0;
		
		// Armazena o jogador que venceu ou null se o jogo empatou
		Jogador vencedor = null;

		// Inicia o loop do jogo
		while (!finalizado) {
			// Mostra o tabuleiro
			tabuleiro.imprimir();
			
			// Obtém o jogador
			Jogador jogador = jogadores.get(indexJogadorAtual);
			
			System.out.print("Jogador '" + jogador.getNome() + "' => ");

			boolean sequenciaEncontrada;
			try {
				// Solicita jogada ao jogador
				Jogada jogada = jogador.obterJogada();
				
				// Efetua a jogada do jogador
				sequenciaEncontrada = tabuleiro.efetuarJogada(jogada, jogador.getSimbolo());
			} catch (JogadaInvalidaException e) {
				// Se a jogada foi inválida, mostra o erro e solicita a jogada novamente
				System.out.println("Erro: " + e.getMessage());
				continue;
			}

			if (sequenciaEncontrada) {
				// Se uma sequência foi encontrada, o jogador ganhou e o jogo pode ser finalizado
				vencedor = jogador;
				finalizado = true;
			
			} else if (tabuleiro.isCompleto()) {
				// Se o tabuleiro está completo e não houve sequência, o jogo termina empatado
				finalizado = true;
			}

			// Muda o índice do jogador atual. Fica alternando entre 0 e 1
			indexJogadorAtual = (indexJogadorAtual + 1) % jogadores.size();
		}

		System.out.println();

		if (vencedor == null) {
			System.out.println("O jogo terminou empatado!");
		} else {
			System.out.println("O jogador '" + vencedor.getNome() + "' venceu o jogo!");

			// O jogador que venceu tem sua pontuação gravada
			gerenciadorPontuacao.gravarPontuacao(vencedor.getNome());
		}

		tabuleiro.imprimir();
	}
}
