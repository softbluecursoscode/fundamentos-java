import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		
		l.add("abc");
		l.add("def");
		//l.set(0, "ghi");
		l.add(0, "ghi");
		
		String e = l.get(1);
		System.out.println(e);
		
		for (String s : l) {
			System.out.println(s);
		}
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
