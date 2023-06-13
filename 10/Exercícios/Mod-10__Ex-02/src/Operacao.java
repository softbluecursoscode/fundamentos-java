
public enum Operacao {

	// Declara os elementos do enum. No construtor, � fornecido um char que representa o s�mbolo da opera��o
	SOMA('+'),
	SUBTRACAO('-'),
	MULTIPLICACAO('X'),
	DIVISAO('/');
	
	// S�mbolo da opera��o
	private char c;
	
	// Construtor do enum. Recebe como par�metro o s�mbolo da opera��o
	Operacao(char c) {
		this.c = c;
	}
	
	// Efetua o c�lculo com base na opera��o. Checa em qual elemento do enum o m�todo est� sendo chamado 
	// e realiza a opera��o adequadamente.
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
			// Foi utilizado um elemento do enum desconhecido (o c�digo n�o sabe como calcular)
			throw new UnsupportedOperationException("O c�lculo n�o pode ser realizado");
		}
	}
	
	// Representa��o de string do enum. Retorna o s�mbolo do enum em forma de string
	public String toString() {
		return String.valueOf(c);
	}
}
