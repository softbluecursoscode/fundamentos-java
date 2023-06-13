package softblue.jogodavelha;

import softblue.jogodavelha.io.Console;

/**
 * Representa um jogador do jogo da velha
 */
public class Jogador {

	/**
	 * Nome do jogador.
	 */
	private String nome;
	
	/**
	 * S�mbolo usado pelo jogador. Ex: 'X' ou 'O' 
	 */
	private char simbolo;
	
	/**
	 * Construtor
	 * @param nome Nome
	 * @param simbolo S�mbolo
	 */
	public Jogador(String nome, char simbolo) {
		this.nome = nome;
		this.simbolo = simbolo;
	}

	public String getNome() {
		return nome;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
	/**
	 * L� a jogada do jogador do teclado. Deve ser feita no formato 'i,j'.
	 * @return Jogada realizada
	 * @throws JogadaInvalidaException Lan�ada se a jogada for inv�lida.
	 */
	public Jogada obterJogada() throws JogadaInvalidaException {
		String str = Console.readString();
		return new Jogada(str);
	}
}
