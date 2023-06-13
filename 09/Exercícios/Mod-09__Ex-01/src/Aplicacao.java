import java.util.Locale;


public class Aplicacao {

	public static void main(String[] args) {

		// Cadastro dos produtos
		Produto p1 = new Produto("Feijão", 2.5, 4, 10, 2020);
		Produto p2 = new Produto("Café", 1, 1, 1, 2022);
		Produto p3 = new Produto("Beterraba", 0.9, 12, 11, 2017);
		
		// Locale brasileiro. Se não for fornecido, é utilizado o locale padrão do sistema (que depende
		// da configuração definida pelo sistema operacional)
		Locale l = new Locale("pt", "BR");
		
		// Impressão das string formatadas
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 1, p1.getNome(), p1.getPeso(), p1.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 2, p2.getNome(), p2.getPeso(), p2.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 3, p3.getNome(), p3.getPeso(), p3.getFormattedDataValidate()));
		
		/*
		 * Padrão de formatação:
		 * 
		 * %d     -> Exibe o ID sequencial do produto (1, 2, 3, etc.)
		 * %12s   -> Alinha o nome do produto à direita utilizando um espaço fixo de 12 caracteres
		 * %09.2f -> Exibe o preço do produto com 2 casas decimais e com preenchimento de 0's a esquerda,
		 *           até completar 9 caracteres
		 * %s     -> Data formatada
		 */
	}
}
