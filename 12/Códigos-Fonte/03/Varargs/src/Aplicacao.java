
public class Aplicacao {

	public static void main(String[] args) {
		
		imprimir("a");
		imprimir("a", "b");
		imprimir("a", "b", "c");
		imprimir();
		
		String[] array = { "a", "b", "c" };
		imprimir(array);
	}
	
//	public static void imprimir(String s1) {
//		System.out.println(s1);
//	}
//	
//	public static void imprimir(String s1, String s2) {
//		System.out.println(s1);
//		System.out.println(s2);
//	}
//	
//	public static void imprimir(String s1, String s2, String s3) {
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//	}
	
	public static void imprimir(String... textos) {
		for (int i = 0; i < textos.length; i++) {
			System.out.println(textos[i]);
		}
	}
}
