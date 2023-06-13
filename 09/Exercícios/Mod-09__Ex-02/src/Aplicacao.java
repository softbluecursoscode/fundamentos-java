

public class Aplicacao {

	public static void main(String[] args) {

		System.out.println(processar(null));
		System.out.println(processar("ab"));
		System.out.println(processar("abcdefg"));
		
	}
	
	private static String processar(String s) {
		if (s == null) {
			return null;
		}
		
		s = s.toUpperCase();
		
		if (s.length() <= 3) {
			return s;
		}
		
		String s2 = s.substring(0, 3);
		
		StringBuffer sb = new StringBuffer(s2);
		
		sb.reverse();
		
		return sb.toString() + s.substring(3);
	}
}
