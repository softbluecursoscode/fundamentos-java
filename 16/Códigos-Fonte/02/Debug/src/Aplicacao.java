import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) throws Exception {

		List<ContaCorrente> contas = new ArrayList<>();

		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(1000);
		c1.sacar(100);
		contas.add(c1);

		ContaCorrente c2 = new ContaCorrente();
		c2.depositar(1200);
		c2.sacar(200);
		contas.add(c2);
		
		for (ContaCorrente contaCorrente : contas) {
			System.out.println(contaCorrente.getSaldo());
		}
	}
}
