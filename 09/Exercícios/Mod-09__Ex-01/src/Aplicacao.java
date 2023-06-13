import java.util.Locale;


public class Aplicacao {

	public static void main(String[] args) {

		// Cadastro dos produtos
		Produto p1 = new Produto("Feij�o", 2.5, 4, 10, 2020);
		Produto p2 = new Produto("Caf�", 1, 1, 1, 2022);
		Produto p3 = new Produto("Beterraba", 0.9, 12, 11, 2017);
		
		// Locale brasileiro. Se n�o for fornecido, � utilizado o locale padr�o do sistema (que depende
		// da configura��o definida pelo sistema operacional)
		Locale l = new Locale("pt", "BR");
		
		// Impress�o das string formatadas
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 1, p1.getNome(), p1.getPeso(), p1.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 2, p2.getNome(), p2.getPeso(), p2.getFormattedDataValidate()));
		System.out.println(String.format(l, "%d) %12s %09.2f %s", 3, p3.getNome(), p3.getPeso(), p3.getFormattedDataValidate()));
		
		/*
		 * Padr�o de formata��o:
		 * 
		 * %d     -> Exibe o ID sequencial do produto (1, 2, 3, etc.)
		 * %12s   -> Alinha o nome do produto � direita utilizando um espa�o fixo de 12 caracteres
		 * %09.2f -> Exibe o pre�o do produto com 2 casas decimais e com preenchimento de 0's a esquerda,
		 *           at� completar 9 caracteres
		 * %s     -> Data formatada
		 */
	}
}
