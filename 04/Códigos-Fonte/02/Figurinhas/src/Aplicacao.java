
public class Aplicacao {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "José";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		
		p1.receber(5);
		p1.receber(7);
		
		p1.dar(2, p2);
		
		p2.dar(1, p1);
		
		System.out.println(p1.nome + " => " + p1.numFigurinhas);
		System.out.println(p2.nome + " => " + p2.numFigurinhas);
	}
}
