
public class Aplicacao {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = "abc";
		String s3 = "abc";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		s2 = s2.toUpperCase();
		System.out.println(s2);
		
		s2 = s2.concat(s3);
		s2 = s2 + s3;
		System.out.println(s2);
	}
}
