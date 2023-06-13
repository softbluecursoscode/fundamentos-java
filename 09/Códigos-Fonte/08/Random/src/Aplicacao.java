import java.util.Random;

public class Aplicacao {

	public static void main(String[] args) {

		Random r = new Random();
		// Random r = new Random(12345678);

		for (int i = 0; i < 10; i++) {
			// double d = Math.random();
			// int d = r.nextInt();
			//int d = r.nextInt(100);
			int d = gerarInt(50, 70);

			System.out.println((i + 1) + " => " + d);
		}
	}

	static int gerarInt(int inicio, int fim) {
		int intervalo = fim - inicio;
		int n = (int) (Math.random() * intervalo) + inicio;
		return n;
	}
}
