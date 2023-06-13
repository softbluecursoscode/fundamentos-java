
public class Turma {

	// Alunos da turma
	Aluno aluno1;
	Aluno aluno2;
	Aluno aluno3;
	
	double calcularMedia() {
		// Para calcular a média da turma, utiliza a média de cada aluno
		double media = 
			aluno1.calcularMedia() + 
			aluno2.calcularMedia() +
			aluno3.calcularMedia();
		
		return media / 3;
	}
}
