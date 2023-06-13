// Um Ponto3D � um Ponto2D, com a diferen�a de que ele possui uma dimens�o a mais. Portanto Ponto3D 
// pode herdar de Ponto2D
public class Ponto3D extends Ponto2D {
	
	// Coordenada z
	private double z;

	public Ponto3D(double x, double y, double z) {
		// O construtor de Ponto2D � invocado neste momento
		super(x, y);
		
		this.z = z;
	}

	// M�todo getter de z
	public double getZ() {
		return z;
	}

	// M�todo toString(), sobrescrito da classe Ponto2D, que j� sobrescrevia o m�todo
	public String toString() {
		// Veja que o toString() de Ponto2D � chamado para montar to toString() de Ponto3D
		return super.toString() + ", z = " + z;
	}
}
