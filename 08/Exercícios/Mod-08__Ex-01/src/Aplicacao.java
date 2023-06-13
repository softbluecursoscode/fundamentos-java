
public class Aplicacao {

	public static void main(String[] args) {

		// Criação das contas bancárias
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		// Depósito de 100 em c1. OK
		try {
			c1.depositar(100);
			System.out.println("Depósito de 100 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		}
		
		// Depósito de -10 em c1. Falha por causa do valor negativo.
		try {
			c1.depositar(-10);
			System.out.println("Depósito de -10 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		}
		
		// Saque de 30 em c1. OK
		try {
			c1.sacar(30);
			System.out.println("Saque de 30 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		// Saque de 90 em c1. Falha porque o saldo é insuficiente
		try {
			c1.sacar(90);
			System.out.println("Saque de 90 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		// Saque de -5 em c1. Falha por causa do valor negativo
		try {
			c1.sacar(-5);
			System.out.println("Saque de -5 feito com sucesso em c1");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		// Transferência de 50 de c1 para c2. OK
		try {
			c1.transferir(50, c2);
			System.out.println("Transferência de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
		
		// Transferência de 50 de c1 para c2. Falha porque o saldo é insuficiente
		try {
			c1.transferir(50, c2);
			System.out.println("Transferência de 50 de c1 para c2 feita com sucesso");
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage() + ". Valor inválido: " + e.getValorInvalido());
		} catch (SaldoInsuficienteException e) {
			System.out.println("Erro: " + e.getMessage() + ". Saldo disponível: " + e.getSaldoDisponivel());
		}
	}
}
