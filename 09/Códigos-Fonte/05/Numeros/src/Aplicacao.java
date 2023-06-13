import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;


public class Aplicacao {

	public static void main(String[] args) {
		
		double d = 1145.4;
		
		NumberFormat nf1 = NumberFormat.getNumberInstance();
		String s1 = nf1.format(d);
		System.out.println(s1);
		
		NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("en", "US"));
		String s2 = nf2.format(d);
		System.out.println(s2);
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		String s3 = nf3.format(d);
		System.out.println(s3);
		
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		String s4 = nf4.format(d);
		System.out.println(s4);
		
		DecimalFormat df1 = new DecimalFormat("00,000.000");
		df1.setGroupingUsed(true);
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('-');
		df1.setDecimalFormatSymbols(dfs);
		String s5 = df1.format(d);
		System.out.println(s5);
		
	}
}
