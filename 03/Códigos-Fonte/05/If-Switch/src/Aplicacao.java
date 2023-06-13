
public class Aplicacao {

	public static void main(String[] args) {
		
//		int num = 15;
//		
//		if (num > 10) {
//			System.out.println("O número é maior que 10");
//		
//		} else if (num < 10) {
//			System.out.println("O número é menor que 10");
//		
//		} else {
//			System.out.println("O número é 10");
//			System.out.println("O número é 10 mesmo!");
//		}
		
		int num = 10;
		
		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("O número é 1, 2, 3 4 ou 5");
			break;
		case 10:
			System.out.println("O número é 10");
			break;
		case 15:
			System.out.println("O número é 15");
			break;
		default:
			System.out.println("O número é outro");
			break;
		}
	}
}
