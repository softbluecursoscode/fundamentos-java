


public class Exercicio6 {

	public static void main(String[] args) {

		//variáveis para armazenar dia, mês e ano
		int dia = 31;
		int mes = 5;
		int ano = 1982;

		//datas consideradas inválidas são datas cujo ano seja menor que 1900 ou maior que 2999
		//ou que o mês seja menor que 1 ou maior que 12, ou dia menos que 1 ou maior que 31
		if (ano < 1900 || ano > 2999 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
			System.out.println("Data inválida");

		} else if ((dia <= 31) && (mes <= 12)) {
			//se o mês for 2 e o dia maior que 28, a data é inválida. Ou então se o dia for 31
			//e o mês for um dos meses que tem 30 dias, a data também é inválida
			if (((dia > 28) && (mes == 2))
					|| ((dia == 31) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)))) {
				System.out.println("Data inválida");
			} else {
				//caso contrário ela é válida
				System.out.println("Data válida");
			}
		
		} else {
			System.out.println("Data inválida");
		}

	}
}
