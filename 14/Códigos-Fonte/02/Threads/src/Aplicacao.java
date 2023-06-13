public class Aplicacao {

	public static void main(String[] args) {

		//Contador c = new Contador();
		//c.start();
		
		Contador2 c = new Contador2();
		Thread t = new Thread(c);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
