import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Aplicacao {

	public static void main(String[] args) {

//		Pattern p = Pattern.compile("([a-z])+");
//		Matcher m = p.matcher("a1bc2def3");
//		
//		while (m.find()) {
//			int pos = m.start();
//			String group = m.group();
//			
//			System.out.println(pos + " => " + group);
//		}
		
		Pattern p = Pattern.compile("[a-z]");
		Matcher m = p.matcher("a1bc2def3");
		
		StringBuffer sb = new StringBuffer();
		
		while (m.find()) {
			int pos = m.start();
			String group = m.group();
			
			group = "?";
			m.appendReplacement(sb, group);
			
			System.out.println(pos + " => " + group);
		}
		
		m.appendTail(sb);
		
		System.out.println(sb);
	}
}
