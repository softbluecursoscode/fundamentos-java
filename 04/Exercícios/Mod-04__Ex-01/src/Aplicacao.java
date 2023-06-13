

public class Aplicacao {

	public static void main(String[] args) {
		
		//cria o relógio r1
		Relogio r1 = new Relogio();
		
		//acerta o relógio com o horário 3:30:50
		r1.acertarRelogio(3, 30, 50);
		
		//mostra as posições dos ponteiros do relógio
		System.out.println("Posição da hora: " + r1.ponteiroHora.posicao);
		System.out.println("Posição do minuto: " + r1.ponteiroMinuto.posicao);
		System.out.println("Posição do segundo: " + r1.ponteiroSegundo.posicao);
		
		//mostra a hora, minuto e segundo do relógio, que devem ser 3, 30 e 50.
		int hora = r1.lerHora();
		int minuto = r1.lerMinuto();
		int segundo = r1.lerSegundo();
		
		System.out.println("Hora: " + hora);
		System.out.println("Minuto: " + minuto);
		System.out.println("Segundo: " + segundo);
		
		//cria o relógio r2
		Relogio r2 = new Relogio();
		
		//acerta o relógio com o horário 22:00:00. O código transformará automaticamente para 10h
		r2.acertarRelogio(22, 0, 0);
		
		//lê a hora do relógio, que deve ser 10.
		System.out.println("Hora do segundo relógio: " + r2.lerHora());
	}
}
