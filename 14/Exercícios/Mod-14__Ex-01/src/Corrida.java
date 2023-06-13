

/**
 * Classe que representa a corrida. Possui o m�todo main() que inicia o programa.
 */
public class Corrida {

	/**
	 * Quantidade de sapos que participar�o da corrida
	 */
	private static final int QTDE_SAPOS = 5;
	
	/**
	 * Dist�ncia total a ser percorrida por cada sapo
	 */
	private static final int DISTANCIA_TOTAL = 500;
	
	public static void main(String[] args) {
		
		//cria um array de sapos
		Sapo[] sapos = new Sapo[QTDE_SAPOS];
		
		//instancia e inicia cada sapo (cada sapo � uma thread)
		for (int i = 0; i < sapos.length; i++) {
			sapos[i] = new Sapo("Sapo_" + (i + 1), DISTANCIA_TOTAL);
			sapos[i].start();
		}
	}
}
