
public class Refrigerante extends Bebida {

	public Refrigerante() {
		super("Refrigerante", false);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando o copo");
		System.out.println("Colocando gelo no copo");
		System.out.println("Colocando o refrigerante");
	}
}
