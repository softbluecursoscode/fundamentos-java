
public class Pista {

	public void iniciar() throws PistaException {
		Automovel a = new Automovel();
		
		try {
			a.acelerar(100);
			a.acelerar(90);
		
		} catch (AcimaVelocidadeMaximaException e) {
			throw new PistaException("Problema na pista", e);
		}
	}
}
