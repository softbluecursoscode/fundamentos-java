
public class Aplicacao {
	
	private enum Sexo {
		MASCULINO, FEMININO
	}

	public static void main(String[] args) {
		
		DiaDaSemana hoje = DiaDaSemana.SEXTA;
		
		int num = DiaDaSemana.QUARTA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		
		DiaDaSemana d = DiaDaSemana.valueOf(s);
		System.out.println(d.getNum());
		
		Sexo sexo = Sexo.MASCULINO;
	}
}
