package utils;

public class RandomUtils {

	public static final int nextInt(int min, int max) {
		int delta = max - min;
		return (int) (Math.random() * delta + min + 1);
	}
}
