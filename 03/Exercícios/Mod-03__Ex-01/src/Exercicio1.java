

public class Exercicio1 {

	public static void main(String[] args) {
		
		//notas do alunos nas provas
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.0;
		
		//pesos das provas
		int peso1 = 3;
		int peso2 = 2;
		int peso3 = 5;
		
		//c�lculo parcial da nota, multiplicando a nota pelo peso
		double parcial1 = nota1 * peso1;
		double parcial2 = nota2 * peso2;
		double parcial3 = nota3 * peso3;
		
		//c�lculo da m�dia, onde ocorre a soma das parciais, dividida pela soma dos pesos
		//a presen�a dos par�nteses � obrigat�ria para que as adi��es sejam feitas antes da divis�o
		double media = (parcial1 + parcial2 + parcial3) / (peso1 + peso2 + peso3);
		
		System.out.println(media);
	}
}
