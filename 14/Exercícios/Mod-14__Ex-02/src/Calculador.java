

public class Calculador {
	
	/**
	 * Número de threads usadas no cálculo de PI 
	 */
	public static final int NUM_THREADS = 2;
	
	/**
	 * Número de iterações que cada thread usará para calcular o PI.
	 * Quanto maior o número de iterações, mais precisão nas casas decimais é obtida
	 */
	public static final int NUM_ITERACOES = 100000000;

	public static void main(String[] args) throws Exception {
		
		//cria um array que armazena os resultados parciais de cada thread
		double[] parciais = new double[NUM_THREADS];
		
		//cria um array para armazenar as threads
		CalculadorParcial[] threads = new CalculadorParcial[NUM_THREADS];
		
		//armazena o tempo inicial de execução, para calcular depois quanto tempo o programa levou
		//para executar
		long initTime = System.currentTimeMillis();
		
		//instancia as threads e as inicia
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new CalculadorParcial(i, parciais);
			threads[i].start();
		}
		
		//faz com que a thread principal aguarde até que todas as threads tenham terminado de executar
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}
		
		//obtém novamente a data/hora do sistema
		long finishTime = System.currentTimeMillis();
		
		//termina de realizar o cálculo, somando todas as parciais e dividindo por 4
		double pi = 0;
		for (double parcial : parciais) {
			pi += parcial;
		}
		pi *= 4;
		
		//mostra o valor de PI e o tempo que o programa levou para executar
		System.out.println("Valor de PI = " + pi);
		System.out.println("Tempo: " + (finishTime - initTime) + "ms");
	}
}