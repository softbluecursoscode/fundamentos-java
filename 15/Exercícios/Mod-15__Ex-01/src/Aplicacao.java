import java.io.File;

public class Aplicacao {

	public static void main(String[] args) throws Exception {

		// Instancia um organizador
		Organizador o = new Organizador();

		// Cria um �lbum usando as fotos do diret�rio 'fotos'
		Album a = o.carregarFotos(new File("./fotos"));

		// Exibe os dados das fotos do �lbum
		a.listarFotos();
	}
}
