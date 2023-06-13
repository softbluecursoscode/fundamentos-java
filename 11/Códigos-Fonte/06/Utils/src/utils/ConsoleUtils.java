package utils;

import java.util.Scanner;

public class ConsoleUtils {

	@SuppressWarnings("resource")
	public static int readInt() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		return Integer.parseInt(str);
	}
}
