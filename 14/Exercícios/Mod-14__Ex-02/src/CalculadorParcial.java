

/**
 * Esta classe faz o cálculo de cada parcial da série de Gregory. O cálculo de cada parcial é feito
 * em uma thread separada.
 */
public class CalculadorParcial extends Thread {
	/**
	 * ID da thread
	 */
	private int id;
	
	/**
	 * Array com as parciais.
	 * Cada thread acessa apenas um índice de array que corresponde ao seu ID. Logo, o acesso ao array não 
	 * precisa ser sincronizado, uma vez que cada thread coloca o seu resultado parcial em uma área diferente
	 * da memória.
	 */
	private double[] parciais;

	/**
	 * Construtor
	 * @param id ID da thread
	 * @param parciais Array de resultados parciais
	 */
	public CalculadorParcial(int id, double[] parciais) {
		this.id = id;
		this.parciais = parciais;
	}

	/**
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		/*
		 * Este é o código executado quando a thread começa a sua execução. Este método basicamente faz o
		 * cálculo da parcial da thread usando a fórmula da série de Gregory
		 */
		double soma = 0;

		for (int i = id; i < Calculador.NUM_ITERACOES; i += Calculador.NUM_THREADS) {
			int s;
			if (i % 2 == 0) {
				s = 1;
			} else {
				s = -1;
			}

			soma += (double) s / (2 * i + 1);
		}
		
		/*
		 * Depois da parcial calculada, a thread coloca o resultado parcial no array de resultados parciais
		 * e termina
		 */
		parciais[id] = soma;
	}
}
