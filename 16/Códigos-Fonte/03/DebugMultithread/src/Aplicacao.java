
public class Aplicacao {

	public static void main(String[] args) throws Exception {

		Contador contador = new Contador();
		
		Executor[] executores = new Executor[3];
		
		for (int i = 0; i < executores.length; i++) {
			executores[i] = new Executor(contador);
			executores[i].setName("Executor " + (i + 1));
			executores[i].start();
		}
		
		for (int i = 0; i < executores.length; i++) {
			executores[i].join();
		}
	}
}
