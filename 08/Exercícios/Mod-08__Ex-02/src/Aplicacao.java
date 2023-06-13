public class Aplicacao {

	public static void main(String[] args) {

		// Declara um objeto nulo
		Object o = null;

		try {
			// Ao chamar este método o Java irá lançar uma NullPointerException
			o.toString();
		
		} catch (NullPointerException e) {
			// Faz um catch da exceção e mostra uma mensagem amigável
			System.out.println("O método está sendo chamado em um objeto nulo");
		}

		// Como a exceção foi tratada, o código continua normalmente, mostra a mensagem 
		// abaixo e termina
		System.out.println("Fim do método");
	}
}
