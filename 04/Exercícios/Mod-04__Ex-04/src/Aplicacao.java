public class Aplicacao {

	public static void main(String[] args) {

		// Criação da turma
		Turma turma = new Turma();
		
		// Criação dos alunos
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		// Associação entre os alunos e a turma
		turma.aluno1 = aluno1;
		turma.aluno2 = aluno2;
		turma.aluno3 = aluno3;
		
		// Cria as provas para cada aluno e define as notas
		
		Prova aluno1Prova1 = new Prova();
		aluno1Prova1.notaParte1 = 4.0;
		aluno1Prova1.notaParte2 = 2.5;
		aluno1.prova1 = aluno1Prova1;
		
		Prova aluno1Prova2 = new Prova();
		aluno1Prova2.notaParte1 = 1.0;
		aluno1Prova2.notaParte2 = 7.0;
		aluno1.prova2 = aluno1Prova2;
		
		Prova aluno2Prova1 = new Prova();
		aluno2Prova1.notaParte1 = 6.5;
		aluno2Prova1.notaParte2 = 3.5;
		aluno2.prova1 = aluno2Prova1;
		
		Prova aluno2Prova2 = new Prova();
		aluno2Prova2.notaParte1 = 0.0;
		aluno2Prova2.notaParte2 = 3.0;
		aluno2.prova2 = aluno2Prova2;
		
		Prova aluno3Prova1 = new Prova();
		aluno3Prova1.notaParte1 = 5.0;
		aluno3Prova1.notaParte2 = 4.0;
		aluno3.prova1 = aluno3Prova1;
		
		Prova aluno3Prova2 = new Prova();
		aluno3Prova2.notaParte1 = 6.0;
		aluno3Prova2.notaParte2 = 1.5;
		aluno3.prova2 = aluno3Prova2;
		
		// Imprime a média de cada aluno
		System.out.println("Média Aluno 1: " + turma.aluno1.calcularMedia());
		System.out.println("Média Aluno 2: " + turma.aluno2.calcularMedia());
		System.out.println("Média Aluno 3: " + turma.aluno3.calcularMedia());
		
		// Imprime a média da turma
		System.out.println("Média Turma: " + turma.calcularMedia());
		
		
		// Atenção:
		// Esta não é a única forma de resolver este exercício. Você também pode instanciar os objetos
		// diretamente dentro de cada classe, nos atributos. Por exemplo:
		//
		// public class Aluno {
		//     Prova prova1 = new Prova();
		//     ...
		// }
	}
}
