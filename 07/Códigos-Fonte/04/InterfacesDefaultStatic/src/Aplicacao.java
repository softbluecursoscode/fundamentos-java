
public class Aplicacao {

	public static void main(String[] args) {
	
		Ferrari f = new Ferrari();
		Porsche p = new Porsche();
		
		f.derrapar();
		p.derrapar();
		
		int vm = Automovel.getVelocidadeMaxima();
		System.out.println(vm);
	}
}
