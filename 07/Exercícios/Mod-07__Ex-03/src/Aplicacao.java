
public class Aplicacao {

	public static void main(String[] args) throws Exception {

		// Cria uma porta e a abre
		Porta p1 = new Porta(2.1, 0.9);
		p1.abrir();
		
		// Imprime os valores dos atributos
		System.out.println("p1 -> altura = " + p1.getAltura());
		System.out.println("p1 -> largura = " + p1.getLargura());
		System.out.println("p1 -> aberta = " + p1.isAberta());
		
		// Cria uma cópia de p1. O método clone() retorna um Object, portanto o casting
		// é necessário
		Porta p2 = (Porta) p1.clone();
		
		// Imprime os valores dos atributos do objeto copiado. Devem ser os mesmos do objeto original
		System.out.println("p2 -> altura = " + p2.getAltura());
		System.out.println("p2 -> largura = " + p2.getLargura());
		System.out.println("p2 -> aberta = " + p2.isAberta());
	}
}
