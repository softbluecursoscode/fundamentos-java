import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



public class Aplicacao {

	public static void main(String[] args) {
		
		Date date = new Date();
		long mili = date.getTime();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 1, 5, 13, 30, 0);
		
		cal.add(Calendar.YEAR, 1);
		cal.add(Calendar.MINUTE, -30);
		
		Date d = cal.getTime();
		cal.setTime(date);
		
		System.out.println(d);
		
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String f1 = df1.format(d);
		System.out.println(f1);
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String f2 = df2.format(d);
		System.out.println(f2);
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		String f3 = df3.format(d);
		System.out.println(f3);
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));
		String f4 = df4.format(d);
		System.out.println(f4);
		
		SimpleDateFormat df5 = new SimpleDateFormat("yyyy-MM-dd");
		String f5 = df5.format(d);
		System.out.println(f5);
		
		String sd1 = "2030-07-01";
		SimpleDateFormat df6 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date d1 = df6.parse(sd1);
			System.out.println(d1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String sd2 = "01072030";
		SimpleDateFormat df7 = new SimpleDateFormat("ddMMyyyy");
		
		try {
			Date d2 = df7.parse(sd2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
