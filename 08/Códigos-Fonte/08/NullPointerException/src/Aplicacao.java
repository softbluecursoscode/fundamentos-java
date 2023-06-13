
public class Aplicacao {

	public static void main(String[] args) {
		Cidade c = new Cidade();
		
		String nome = c.getEstado().getPais().getNome();
		System.out.println(nome);
	}
}
