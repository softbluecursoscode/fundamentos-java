
public enum Operacao {

	// Declara os elementos do enum. No construtor, é fornecido um char que representa o símbolo da operação
	SOMA('+'),
	SUBTRACAO('-'),
	MULTIPLICACAO('X'),
	DIVISAO('/');
	
	// Símbolo da operação
	private char c;
	
	// Construtor do enum. Recebe como parâmetro o símbolo da operação
	Operacao(char c) {
		this.c = c;
	}
	
	// Efetua o cálculo com base na operação. Checa em qual elemento do enum o método está sendo chamado 
	// e realiza a operação adequadamente.
	public double calcular(double n1, double n2) {
		if (this == SOMA) {
			return n1 + n2;
		} else if (this == SUBTRACAO) {
			return n1 - n2;
		} else if (this == MULTIPLICACAO) {
			return n1 * n2;
		} else if (this == DIVISAO) {
			return n1 / n2;
		} else {
			// Foi utilizado um elemento do enum desconhecido (o código não sabe como calcular)
			throw new UnsupportedOperationException("O cálculo não pode ser realizado");
		}
	}
	
	// Representação de string do enum. Retorna o símbolo do enum em forma de string
	public String toString() {
		return String.valueOf(c);
	}
}
