
public class Aplicacao {

	public static void main(String[] args) {
		
		// Cria a thread do semáforo e a inicia
		Semaforo semaforo = new Semaforo();
		semaforo.start();
		
		// Define um número de carros
		int numCarros = 10;
		
		// Cria um array com os carros
		Carro[] carros = new Carro[numCarros];
		
		// Cria os carros (que são threads e os inicia)
		for (int i = 0; i < numCarros; i++) {
			carros[i] = new Carro(i + 1, semaforo);
			carros[i].start();
		}
	}
}
