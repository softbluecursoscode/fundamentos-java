
public class Relogio {

	//ponteiro das horas
	Ponteiro ponteiroHora = new Ponteiro();
	
	//ponteiro dos minutos
	Ponteiro ponteiroMinuto = new Ponteiro();
	
	//ponteiro dos segundos
	Ponteiro ponteiroSegundo = new Ponteiro();
	
	//acerta o relógio a partir de uma hora, minuto e segundo
	void acertarRelogio(int hora, int minuto, int segundo) {
		//a linha abaixo calcula o módulo da hora. Assim, se for fornecido 13, por exemplo, é considerado
		//hora 1.
		hora = hora % 12;
		
		//acerta a posição de cada um dos ponteiros
		//a divisão por 5 dos minutos e segundos é necessária para converter o horário em posição.
		//exemplo: 45 minutos representa a posição 9 do ponteiro dos minutos 
		ponteiroHora.posicao = hora;
		ponteiroMinuto.posicao = minuto / 5;
		ponteiroSegundo.posicao = segundo / 5;
	}
	
	//lê a hora do relógio
	int lerHora() {
		return ponteiroHora.posicao;
	}
	
	//lê o minuto do relógio
	int lerMinuto() {
		return ponteiroMinuto.posicao * 5;
	}
	
	//lê o segundo do relógio
	int lerSegundo() {
		return ponteiroSegundo.posicao * 5;
	}
}
