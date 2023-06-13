import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;


public class Aplicacao {

	public static void main(String[] args)  {

		periodSinceJamesGoslingBirthday();
		durationSince3AM();
	}
	
	// Calcula o tempo decorrido desde o nascimento de James Gosling.
	private static void periodSinceJamesGoslingBirthday() {
		// Data que representa o nascimento de James Gosling
		LocalDate birthday = LocalDate.parse("1955-05-19");
		
		// Data de hoje
		LocalDate today = LocalDate.now();
		
		// Período entre as datas.
		Period period = Period.between(birthday, today);
		
		// Exibição na tela.
		System.out.println(String.format("%d anos, %d meses e %d dias", period.getYears(), period.getMonths(), period.getDays()));
	}
	
	// Calcula o tempo decorrido em segundos desde às 3h da manhã de hoje.
	private static void durationSince3AM() {
		// Objeto que representa às 3h.
		LocalTime earlier = LocalTime.parse("03:00");
		
		// Objeto que representa a hora atual.
		LocalTime now = LocalTime.now();
		
		// Intervalo na linha do tempo.
		Duration duration = Duration.between(earlier, now);
		
		// Exibição na tela.
		System.out.println(String.format("%d segundos", duration.getSeconds()));
	}
}
