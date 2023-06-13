
public class Carro extends Veiculo {

	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Quatro portas: " + quatroPortas);
	}
}
