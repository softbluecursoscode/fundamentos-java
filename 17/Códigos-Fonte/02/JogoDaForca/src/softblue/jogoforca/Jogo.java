package softblue.jogoforca;

import java.util.HashSet;
import java.util.Set;

import softblue.jogoforca.utils.ConsoleUtils;

/**
 * Implementa a l�gica de funcionamento do jogo
 */
public class Jogo {
	
	/**
	 * Constante que representa o n�mero m�ximo de vezes que o usu�rio pode errar
	 */
	private static final int MAX_ERROS = 5;
	
	public void iniciar() throws JogoDaForcaException {
		// Conjunto que armazena as letras j� tentadas pelo usu�rio
		Set<Character> letrasUsadas = new HashSet<Character>();
		
		// N�mero atual de erros do usu�rio
		int erros = 0;
		
		// Sorteia uma nova palavra
		Dicionario dicionario = Dicionario.getInstance();
		Palavra palavra = dicionario.proximaPalavra();
		
		System.out.println("Bem vindo ao Jogo da Forca!");
		System.out.println("A palavra tem " + palavra.tamanho() + " letras");
		
		// Fica em loop
		while (true) {
			// A linha abaixo chama o m�todo toString() da Palavra
			System.out.println(palavra);
			
			System.out.println();
			
			char letra;
			try {
				System.out.print("Digite uma letra: ");
				
				// Espera o usu�rio digitar uma letra no console
				letra = ConsoleUtils.lerLetra();
				
				// Se ele j� digitou esta letra anteriormente, lan�a uma exce��o
				if (letrasUsadas.contains(letra)) {
					throw new CaractereInvalidoException("Esta letra j� foi utilizada");
				}
				
				// Adiciona a letra digita � lista de letras usadas
				letrasUsadas.add(letra);
				
				// Verifica se a palavra possui a letra digitada
				if(palavra.possuiLetra(letra)) {
					System.out.println("Voc� acertou uma letra!");
				} else {
					// Se n�o possuir, incrementa o n�mero de erros
					erros++;
					
					if (erros < MAX_ERROS) {
						// S� exibe a mensagem se ainda n�o atingiu o n�mero m�ximo de erros
						System.out.println("Voc� errou! Voc� ainda pode errar " + (MAX_ERROS - erros) + " vez(es)");
					}
				}
				
				System.out.println();
				
				// Se acertou a palavra inteira, avisa o usu�rio e sai do jogo (termina o loop)
				if (palavra.acertouPalavra()) {
					System.out.println("Parab�ns! Voc� acertou a palavra completa: " + palavra.getPalavraOriginal());
					System.out.println("Fim do Jogo!");
					break;
				}
				
				// Se atingiu o n�mero m�ximo de erros, avisa o usu�rio e sai do jogo (termina o loop)
				if (erros == MAX_ERROS) {
					System.out.println("Voc� perdeu o jogo! A palavra correta era " + palavra.getPalavraOriginal());
					System.out.println("Fim do Jogo!");
					break;
				}
				
			} catch (CaractereInvalidoException e) {
				// Se ocorrer alguma exce��o, mostra a mensagem para o usu�rio e continua o loop
				System.out.println("Erro: " + e.getMessage());
				System.out.println();
			}
		}	
	}
}
