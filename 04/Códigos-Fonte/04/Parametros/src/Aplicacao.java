
public class Aplicacao {

	public static void main(String[] args) {
		
		Operacao o = new Operacao();
		
		//int x = 10;
		//o.trocar(x);
		//System.out.println(x);
		
		Valor valor = new Valor();
		valor.v = 10;
		
		o.alterarValor(valor);
		
		System.out.println(valor.v);
	}
}
