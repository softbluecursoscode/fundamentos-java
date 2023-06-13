
public class Aplicacao {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		array[1] = 6;
		array[4] = 7;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int x : array) {
			System.out.println(x);
		}
		
		String[] array2 = new String[7];
		array2[0] = "a";
		array2[1] = "b";
		
		for (String s : array2) {
			System.out.println(s);
		}
		
		Object[] array3 = new Object[7];
		array3[0] = "a";
		array3[1] = new Object();
		array3[2] = new int[3];
		array3[3] = 10;
		
		String e1 = (String) array3[0];
		int e2 = (int) array3[3];
	}
}
