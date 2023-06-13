
public class Exercicio5_1 {

	public static void main(String[] args) {
		int x = 10;

		while (x < 1000) {
			if (x % 2 == 0) {
				x = x + 5;

			} else {
				x = x * 2;
			}

			System.out.print(x + ", ");
		}
	}
}
