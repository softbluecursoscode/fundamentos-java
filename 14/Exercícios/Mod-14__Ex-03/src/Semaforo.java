
public class Semaforo extends Thread {
	
	// Tempo de espera do sem�foro a cada mudada de cor.
	private static final int TEMPO_SEMAFORO = 3000;

	// Enum com as cores poss�veis do sem�foro
	private enum Cor {
		VERDE,
		VERMELHA
	}
	
	// Cor atual do sem�foro
	private Cor cor = Cor.VERMELHA;
	
	@Override
	public void run() {
		// Loop infinito
		while (true) {
			// Muda a cor
			mudarCor();
			
			// Aguarda
			try {
				Thread.sleep(TEMPO_SEMAFORO);
			} catch (InterruptedException e) {
			}
		}
	}
	
	public synchronized void atravessar(Carro carro) {
		// O carro s� pode atravessar se a cor for verde.
		// Se for vermelha, o carro fica bloqueado no monitor
		while (cor == Cor.VERMELHA) {
			carro.mostrarMensagem("Est� aguardando no sem�foro");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
	}
	
	// Muda para a outra cor
	private synchronized void mudarCor() {
		if (cor == Cor.VERDE) {
			cor = Cor.VERMELHA;
		} else {
			// Quando o sem�foro muda para cor verde, ele avisa os carros bloqueados
			// que eles podem passar
			cor = Cor.VERDE;
			notifyAll();
		}
		
		System.out.println("Cor do sem�foro: " + cor);
	}
}
