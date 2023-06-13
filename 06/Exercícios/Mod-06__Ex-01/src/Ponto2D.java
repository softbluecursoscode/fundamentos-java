
public class Ponto2D {

	// Coordenada x
	private double x;
	
	// Coordenada y
	private double y;
	
	// Construtor que recebe as coordenadas
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// M�todo getter de x
	public double getX() {
		return x;
	}

	// M�todo getter de y
	public double getY() {
		return y;
	}
	
	// M�todo toString(), sobrescrito da classe Object
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}
