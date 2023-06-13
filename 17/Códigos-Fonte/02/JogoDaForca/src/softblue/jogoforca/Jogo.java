package softblue.jogoforca;

import java.util.HashSet;
import java.util.Set;

import softblue.jogoforca.utils.ConsoleUtils;

/**
 * Implementa a lógica de funcionamento do jogo
 */
public class Jogo {
	
	/**
	 * Constante que representa o número máximo de vezes que o usuário pode errar
	 */
	private static final int MAX_ERROS = 5;
	
	public void iniciar() throws JogoDaForcaException {
		// Conjunto que armazena as letras já tentadas pelo usuário
		Set<Character> letrasUsadas = new HashSet<Character>();
		
		// Número atual de erros do usuário
		int erros = 0;
		
		// Sorteia uma nova palavra
		Dicionario dicionario = Dicionario.getInstance();
		Palavra palavra = dicionario.proximaPalavra();
		
		System.out.println("Bem vindo ao Jogo da Forca!");
		System.out.println("A palavra tem " + palavra.tamanho() + " letras");
		
		// Fica em loop
		while (true) {
			// A linha abaixo chama o método toString() da Palavra
			System.out.println(palavra);
			
			System.out.println();
			
			char letra;
			try {
				System.out.print("Digite uma letra: ");
				
				// Espera o usuário digitar uma letra no console
				letra = ConsoleUtils.lerLetra();
				
				// Se ele já digitou esta letra anteriormente, lança uma exceção
				if (letrasUsadas.contains(letra)) {
					throw new CaractereInvalidoException("Esta letra já foi utilizada");
				}
				
				// Adiciona a letra digita à lista de letras usadas
				letrasUsadas.add(letra);
				
				// Verifica se a palavra possui a letra digitada
				if(palavra.possuiLetra(letra)) {
					System.out.println("Você acertou uma letra!");
				} else {
					// Se não possuir, incrementa o número de erros
					erros++;
					
					if (erros < MAX_ERROS) {
						// Só exibe a mensagem se ainda não atingiu o número máximo de erros
						System.out.println("Você errou! Você ainda pode errar " + (MAX_ERROS - erros) + " vez(es)");
					}
				}
				
				System.out.println();
				
				// Se acertou a palavra inteira, avisa o usuário e sai do jogo (termina o loop)
				if (palavra.acertouPalavra()) {
					System.out.println("Parabéns! Você acertou a palavra completa: " + palavra.getPalavraOriginal());
					System.out.println("Fim do Jogo!");
					break;
				}
				
				// Se atingiu o número máximo de erros, avisa o usuário e sai do jogo (termina o loop)
				if (erros == MAX_ERROS) {
					System.out.println("Você perdeu o jogo! A palavra correta era " + palavra.getPalavraOriginal());
					System.out.println("Fim do Jogo!");
					break;
				}
				
			} catch (CaractereInvalidoException e) {
				// Se ocorrer alguma exceção, mostra a mensagem para o usuário e continua o loop
				System.out.println("Erro: " + e.getMessage());
				System.out.println();
			}
		}	
	}
}
