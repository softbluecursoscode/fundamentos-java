package softblue.numero;

import utils.ConsoleUtils;
import utils.RandomUtils;

public class Jogo {

	public static void main(String[] args) {
		
		int number = RandomUtils.nextInt(0, 50);
	
		int guess;
		
		do {
			System.out.print("Adivinhe o número: ");
			guess = ConsoleUtils.readInt();
			
			if (guess > number) {
				System.out.println("O valor é menor");
			} else if (guess < number) {
				System.out.println("O valor é maior");
			}
			
		} while (guess != number);
		
		System.out.println("Você acertou! O valor era " + number + ". Fim do jogo!");
	}
}
