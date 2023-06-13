

/**
 * A classe Sapo representa cada um dos sapos que irá correr. Cada sapo é uma thread, já que cada um 
 * executa de forma independente
 */
public class Sapo extends Thread {
	
	/**
	 * Tempo máximo (em milissegundos) que um sapo descansa antes de dar o próximo pulo
	 */
	private static final int MAXIMO_DESCANSO = 500;
	
	/**
	 * Distância máxima que o sapo pode alcançar com seu pulo
	 */
	private static final int MAXIMO_PULO = 50;
	
	/**
	 * Monitor usado para sincronizar o acesso ao atributo 'colocacao'
	 */
	private static Object monitor = new Object();
	
	/**
	 * Nome do sapo
	 */
	private String nome;
	
	/**
	 * Distância total a ser percorrida pelo sapo
	 */
	private int distanciaTotal;
	
	/**
	 * Distância já percorrida pelo sapo
	 */
	private int distanciaPercorrida;
	
	/**
	 * Distância que o sapo pulou no último pulo
	 */
	private int ultimoPulo;
	
	/**
	 * Colocação final do sapo.
	 * Este atributo é estático porque ele é compartilhado entre todas as instâncias da classe
	 * (existe apenas um atributo 'colocacao' para todos os sapos correndo
	 */
	private static int colocacao;
	
	/**
	 * Construtor
	 * @param nome Nome do sapo
	 * @param distanciaTotal Distância total
	 */
	public Sapo(String nome, int distanciaTotal) {
		this.nome = nome;
		this.distanciaTotal = distanciaTotal;
	}

	/**
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		/* Este código será executado pela thread. Cada sapo realiza três ações: pula, avisa sua situação
		 * (isto é, mostra uma mensagem no console a respeito do seu estado atual na corrida) e descansa.
		 * Este código executa num loop, até que a distância total tenha sido atingida.
		 */
		
		while(distanciaPercorrida < distanciaTotal) {
			pular();
			avisarSituacao();
			descansar();
		}
		
		//depois que o sapo atingiu a linha de chegada, a sua colocação deve ser gravada
		cruzarLinhaDeChegada();
	}
	
	/**
	 * Faz o sapo pular
	 */
	private void pular() {		
		//a distância do pulo é calculada randomicamente, entre 0 e MAXIMO_PULO
		ultimoPulo = (int)(Math.random() * MAXIMO_PULO);
		
		//incrementa a distância percorrida com a distância do pulo
		distanciaPercorrida += ultimoPulo;
		
		//faz o truncamento da distância percorrida caso ela ultrapasse a distância total
		if(distanciaPercorrida > distanciaTotal) {
			distanciaPercorrida = distanciaTotal;
		}
	}
	
	/**
	 * Faz o sapo descansar
	 */
	private void descansar() {
		//calcula o tempo de descanso de forma randômica, entre 0 e MAXIMO_DESCANSO ms
		int tempo = (int)(Math.random() * MAXIMO_DESCANSO);
		try {
			//faz a thread do sapo dormir por um determinado tempo (a thread para de executar)
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Mostra a situação atual do sapo na corrida
	 */
	private void avisarSituacao() {
		System.out.println(nome + " pulou " + ultimoPulo + "cm. A distância percorrida foi de " + distanciaPercorrida + "cm");
	}
	
	/**
	 * Marca a colocação do sapo.
	 * O acesso ao atributo 'colocacao' deve ser sincronizado porque pode have problema se dois sapos cruzarem
	 * a linha de chegada praticamente ao mesmo tempo.
	 * Foi criado um atributo 'monitor' para gerenciar a região crítica, mas o próprio atributo 'colocacao'
	 * poderia ser usado com esta finalidade.
	 */
	private void cruzarLinhaDeChegada() {
		synchronized (monitor) {
			colocacao++;
			System.out.println("==> " + nome + " cruzou a linha de chegada em " + colocacao + "o. lugar!");
		}
	}
}
