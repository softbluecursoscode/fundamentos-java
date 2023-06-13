/*
 * Representa uma fração
 */
public class Fracao {

	//Numerador da fração
	double numerador;
	
	//Denominador da fração
	double denominador;
	
	//Calcula o valor do fração
	double calcularValor() {
		/*
		 * Para calcular o valor, basta dividir o numerador da fração pelo denominador. Se o denominador 
		 * for 0, o resultado é assumido como 0, já que não é possível fazer uma divisão por 0.
		 */
		if(denominador == 0) {
			return 0;
		}
		return numerador / denominador;
	}
	
	/*
	 * Multiplica a fração atual (do próprio objeto) por outra (passada como parâmetro), dando uma terceira fração como resultado.
	 */
	Fracao multiplicar(Fracao f) {
		//Cria um novo resultado
		Fracao result = new Fracao();
		
		//Multiplica os numeradores e denominadores das frações
		result.numerador = this.numerador * f.numerador;
		result.denominador = this.denominador * f.denominador;
		
		//Retorna a nova fração
		return result;
	}
	
	/*
	 * Define os valores do numerador e denominador da fração
	 */
	void definirValores(double numerador, double denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	/*
	 * Retorna a representação da fração em forma de string
	 */
	String obterFracao() {
		return numerador + "/" + denominador;
	}
}
