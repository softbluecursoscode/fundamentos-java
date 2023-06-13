
public class Aplicacao {

	public static void main(String[] args) {
		
		System.out.println("Carro");
		Carro c = new Carro();
		c.setMarca("XYZ");
		c.setModelo("ABC");
		c.setAno(2000);
		c.setQuatroPortas(true);
		c.imprimirDados();
		c.buzinar();
		
		System.out.println("Motocicleta");
		Motocicleta m = new Motocicleta();
		m.setMarca("QQQ");
		m.setModelo("ZZZ");
		m.setAno(2010);
		m.imprimirDados();
		m.empinar();
		m.buzinar();
		
		Caminhao cam = new Caminhao();
		cam.buzinar();
	}
}
