
// Classe que representa uma conta investimento
public class ContaInvestimento extends ContaBancaria {

	// Implementa o cálculo do saldo, aumentando 5% sobre o saldo real (rendimentos)
	public double calcularSaldo() {
		return saldo + (saldo * 0.05);
	}
}
