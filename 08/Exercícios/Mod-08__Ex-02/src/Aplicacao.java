public class Aplicacao {

	public static void main(String[] args) {

		// Declara um objeto nulo
		Object o = null;

		try {
			// Ao chamar este m�todo o Java ir� lan�ar uma NullPointerException
			o.toString();
		
		} catch (NullPointerException e) {
			// Faz um catch da exce��o e mostra uma mensagem amig�vel
			System.out.println("O m�todo est� sendo chamado em um objeto nulo");
		}

		// Como a exce��o foi tratada, o c�digo continua normalmente, mostra a mensagem 
		// abaixo e termina
		System.out.println("Fim do m�todo");
	}
}
