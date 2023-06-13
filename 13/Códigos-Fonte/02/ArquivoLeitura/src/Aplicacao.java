import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {

		try (InputStream is = new FileInputStream("entrada.txt")) {

			byte[] buffer = new byte[1024];

			int bytesLidos = is.read(buffer);

			String s = new String(buffer, 0, bytesLidos);
			System.out.println(s);
			System.out.println(s.length());
		}

		try (InputStream is = new FileInputStream("entrada.txt")) {

			byte[] buffer = new byte[4];

			String s = "";
			int bytesLidos;
			while ((bytesLidos = is.read(buffer)) > -1) {
				s += new String(buffer, 0, bytesLidos);
			}

			System.out.println(s);
			System.out.println(s.length());
		}

		try (BufferedReader reader = new BufferedReader(new FileReader(
				"entrada.txt"))) {

			String s = "";
			String line;
			while ((line = reader.readLine()) != null) {
				s += line + "\n";
			}

			System.out.println(s);
		}

		try (Scanner scanner = new Scanner(new File("entrada.txt"))) {
			String s = "";
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				s += line + "\n";
			}

			System.out.println(s);
		}
	}
}
