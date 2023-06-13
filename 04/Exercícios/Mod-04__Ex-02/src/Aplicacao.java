public class Aplicacao {

	public static void main(String[] args) {

		//Cria a fração 5/2
		Fracao f1 = new Fracao();
		f1.definirValores(5, 2);
		
		//Cria a fração 1/7
		Fracao f2 = new Fracao();
		f2.definirValores(1, 7);
		
		//Multiplica as frações
		Fracao f3 = f1.multiplicar(f2);
		
		//Mostra a fração
		System.out.println(f3.obterFracao());
		
		//Mostra o valor da fração
		System.out.println(f3.calcularValor());
	}
}
