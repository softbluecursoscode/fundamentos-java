import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Álbum para agrupar as fotos
public class Album {

	// Lista de fotos do álbum
	private List<Foto> fotos = new ArrayList<Foto>();

	// Adiciona uma foto ao álbum
	public void adicionar(int id, Date data, String local) {
		// Cria um objeto Foto com base nos parâmetros passados e o adiciona à lista
		fotos.add(new Foto(id, data, local));
	}

	// Exibe as informações das fotos
	public void listarFotos() {
		// Itera sobre as fotos do álbum
		for (Foto foto : fotos) {
			// Se o local for null, exibe a string "Nenhum"
			String local = foto.getLocal() == null ? "Nenhum" : foto.getLocal();
			
			// Formata a string. Para maiores informações consulte o Javadoc da classe
			// java.util.Formatter
			String s = String.format("%1$d, %2$s, %3$td/%3$tm/%3$ty",
					foto.getId(), local, foto.getData());
			
			// Imprime os dados da foto no console
			System.out.println(s);
		}
	}
}
