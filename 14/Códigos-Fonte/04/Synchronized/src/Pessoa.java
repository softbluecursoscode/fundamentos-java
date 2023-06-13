

public class Pessoa implements Runnable {

	private ContaBancaria contaBancaria;
	
	public Pessoa(ContaBancaria contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				contaBancaria.sacar(200);
				Thread.sleep(100);
				
				contaBancaria.depositar(200);
				Thread.sleep(100);
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
