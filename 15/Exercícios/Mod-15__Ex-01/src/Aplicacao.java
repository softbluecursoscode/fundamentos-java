import java.io.File;

public class Aplicacao {

	public static void main(String[] args) throws Exception {

		// Instancia um organizador
		Organizador o = new Organizador();

		// Cria um álbum usando as fotos do diretório 'fotos'
		Album a = o.carregarFotos(new File("./fotos"));

		// Exibe os dados das fotos do álbum
		a.listarFotos();
	}
}
