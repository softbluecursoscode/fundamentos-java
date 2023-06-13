
public class Aplicacao {

	public static void main(String[] args) {

		/*
		 * Cria duas contas bancárias. Primeiro deposita 1000 e saca 200 de cada uma delas e calcula o 
		 * saldo. Depois transfere 100 da conta 1 para a conta 2 e calcula o saldo das duas.
		 */
		
		ContaBancaria c1 = new ContaCorrente();
		c1.depositar(1000);
		c1.sacar(200);
		double saldo = c1.calcularSaldo();
		System.out.println("Saldo da conta 1: " + saldo);
		
		ContaBancaria c2 = new ContaInvestimento();
		c2.depositar(1000);
		c2.sacar(200);
		saldo = c2.calcularSaldo();
		System.out.println("Saldo da conta 2: " + saldo);
		
		c1.transferir(100, c2);
		saldo = c1.calcularSaldo();
		System.out.println("Saldo da conta 1: " + saldo);
		saldo = c2.calcularSaldo();
		System.out.println("Saldo da conta 2: " + saldo);
	}
}
