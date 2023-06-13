
public class Aplicacao {

	public static void main(String[] args) {
		
//		int[][] array = new int[3][5];
//		
//		array[2][3] = 10;
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[0].length; j++) {
//				System.out.print(array[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		int[][][] array = new int[3][5][2];
		
		array[2][3][0] = 10;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				for (int k = 0; k < array[0][0].length; k++) {
					System.out.print(array[i][j][k] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
