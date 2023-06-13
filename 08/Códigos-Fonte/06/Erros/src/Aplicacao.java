
public class Aplicacao {

	public static void main(String[] args) {

		ContatoPF c1 = new ContatoPF();
		c1.setNome("José");
		c1.setCpf("000.456.234-07");
		
		//c1.setEndereco(new Endereco());
		
		c1.getEndereco().setRua("R. dos Limões");
		c1.getEndereco().setNumero("100");
		c1.getEndereco().setCidade("Ribeirão Distante");
		c1.getEndereco().setEstado("Passarinho");
		
		Agenda a = new Agenda();
		a.setContato1(c1);
		
		imprimirNomes(a);
		imprimirCnpj(a);
		
		System.out.println("Contato definido");
	}
	
	private static void imprimirNomes(Agenda a) {
		if (a.getContato1() != null) {
			System.out.println(a.getContato1().getNome());
		}
		
		if (a.getContato2() != null) {
			System.out.println(a.getContato2().getNome());
		}
		
		if (a.getContato3() != null) {
			System.out.println(a.getContato3().getNome());
		}
	}
	
	private static void imprimirCnpj(Agenda a) {
		if (a.getContato1() != null && a.getContato1() instanceof ContatoPJ) {
			ContatoPJ c = (ContatoPJ) a.getContato1();
			System.out.println(c.getCnpj());
		}
		
		if (a.getContato2() != null) {
			ContatoPJ c = (ContatoPJ) a.getContato2();
			System.out.println(c.getCnpj());
		}
		
		if (a.getContato3() != null) {
			ContatoPJ c = (ContatoPJ) a.getContato3();
			System.out.println(c.getCnpj());
		}
	}
}
