
public class Matematica {

	public static void calcularBhaskara(double a, double b, double c, ResultadoBhaskara r) {
		double delta = calcularDelta(a, b, c);
		
		double r1 = (-b + Math.sqrt(delta)) / (2 * a);
		double r2 = (-b - Math.sqrt(delta)) / (2 * a);
		r.setValores(r1, r2);
	}
	
	private static double calcularDelta(double a, double b, double c) {
		double delta = (b * b) - (4 * a * c);
		
		assert delta > 0 : "O valor de delta é " + delta;
		
		return delta;
	}
}
