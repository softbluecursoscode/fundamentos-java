package softblue.jogoforca;

import java.util.HashSet;
import java.util.Set;

/**
 * Representa a palavra sorteada.
 */
public class Palavra {
	
	/**
	 * Constante que indica o caractere que deve ser mostrado ao usuário enquanto ele não
	 * descobre a letra
	 */
	private static final char CARACTERE_SECRETO = '_';

	/**
	 * Palavra sorteada
	 */
	private String palavraOriginal;
	
	/**
	 * Conjunto que armazena os caracteres já encontrados da palavra
	 */
	private Set<Character> caracteresEncontrados = new HashSet<Character>();
	
	/**
	 * Construtor.
	 * @param palavraOriginal Palavra sorteada
	 */
	public Palavra(String palavraOriginal) {
		this.palavraOriginal = palavraOriginal.toUpperCase();
	}
	
	/** 
	 * Retorna a palavra. Se o jogador ainda não descobriu determinada letra, o {@link #CARACTERE_SECRETO}
	 * é mostrado no lugar dela.
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		// Utiliza um StringBuilder para evitar a concatenação de strings
		StringBuilder sb = new StringBuilder();
		
		// Converte a palavra em um array de caracteres
		char[] letrasArray = palavraOriginal.toCharArray();
		
		// Itera sobre cada caractere da palavra
		for (int i = 0; i < letrasArray.length; i++) {
			char c = letrasArray[i];
			
			// Checa se o caractere está presente na lista de caracteres encontrados
			if (caracteresEncontrados.contains(c)) {
				// Se está, significa que o usuário já o identificou, portanto ele pode ser mostrado
				sb.append(c);
			} else {
				// Caso contrário, o CARACTERE_SECRETO é exibido no lugar
				sb.append(CARACTERE_SECRETO);
			}
			
			sb.append(" ");
		}

		// Converte o StringBuffer para string e retorna (remove o espaço em branco do fim).
		return sb.toString().trim();
	}
	
	/**
	 * Obtém o tamanho da palavra.
	 * @return Tamanho da palavra
	 */
	public int tamanho() {
		return palavraOriginal.length();
	}
	
	/**
	 * Verifica se a letra fornecida existe na palavra
	 * @param letra Letra fornecida pelo jogador
	 * @return true se a letra existir; false, caso contrário
	 */
	public boolean possuiLetra(char letra) {
		// Checa a existência da letra dentro da palavra
		if (palavraOriginal.indexOf(letra) > -1) {
			// Antes de retornar, adiciona a letra na lista de letras encontradas 
			caracteresEncontrados.add(letra);
			return true;
		}
		
		return false;
	}
	
	/**
	 * Verifica se o jogador acertou a palavra inteira.
	 * @return true se acertou; false, caso contrário
	 */
	public boolean acertouPalavra() {
		// Converte a palavra para um array de caracteres
		char[] letrasArray = palavraOriginal.toCharArray();
		
		// Cria um conjunto para conter as letras
		Set<Character> letras = new HashSet<Character>();
		
		// Adiciona todos os caracteres da palavra no conjunto. Se o caractere for repetido, ele
		// não será adicionado (conjuntos não permitem elementos repetidos
		for (int i = 0; i < letrasArray.length; i++) {
			letras.add(letrasArray[i]);
		}
		
		// Se o conjunto com os caracteres da palavra tiver os mesmos elementos do conjunto de 
		// caracteres encontrados pelo jogador, significa que ele já acetou todas as letras da palavra
		return letras.equals(caracteresEncontrados);
	}
	
	/**
	 * Obtém a palavra sorteada.
	 * @return Palavra sorteada
	 */
	public String getPalavraOriginal() {
		return palavraOriginal;
	}
}
