// Um Ponto3D é um Ponto2D, com a diferença de que ele possui uma dimensão a mais. Portanto Ponto3D 
// pode herdar de Ponto2D
public class Ponto3D extends Ponto2D {
	
	// Coordenada z
	private double z;

	public Ponto3D(double x, double y, double z) {
		// O construtor de Ponto2D é invocado neste momento
		super(x, y);
		
		this.z = z;
	}

	// Método getter de z
	public double getZ() {
		return z;
	}

	// Método toString(), sobrescrito da classe Ponto2D, que já sobrescrevia o método
	public String toString() {
		// Veja que o toString() de Ponto2D é chamado para montar to toString() de Ponto3D
		return super.toString() + ", z = " + z;
	}
}
