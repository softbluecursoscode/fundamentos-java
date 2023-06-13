
public class Aluno {

	// Provas realizadas pelo aluno
	Prova prova1;
	Prova prova2;
	
	double calcularMedia() {
		// Para calcular a média, utiliza a nota total de cada prova
		double media = prova1.calcularNotaTotal() + prova2.calcularNotaTotal();
		return media / 2;
	}
}
