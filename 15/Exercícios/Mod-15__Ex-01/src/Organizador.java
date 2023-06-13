import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Organiza as fotos em um álbum
public class Organizador {
	
	// Cria um álbum de fotos com base em um diretório
	public Album carregarFotos(File diretorio) throws Exception {
		
		// Cria um formatador, utilizado depois para fazer o parse da data da foto no
		// nome do arquivo
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");

		// Lista os arquivos do diretório
		File[] arquivos = diretorio.listFiles();

		// Cria o álbum
		Album album = new Album();

		// Itera sobre os arquivos do diretório
		for (File arquivo : arquivos) {
			// Obtém o nome do arquivo
			String nomeArquivo = arquivo.getName();
			
			// A extensão ".jpg" não interessa. Esta linha remove a extensão
			nomeArquivo = nomeArquivo.substring(0, nomeArquivo.length() - 4);

			// Cria um objeto Scanner para executar a tokenização
			Scanner scanner = new Scanner(nomeArquivo);
			
			// O delimitador é uma expressão regular. Os caracteres '-' ou '_' são delimitadores.
			scanner.useDelimiter("[-_]");
			
			String token = null;

			// Lê o primeiro token: IMGXXXXX
			token = scanner.next();
			
			// Descarta a string 'IMG' e converte o que sobra para inteiro para formar o ID
			int id = Integer.parseInt(token.substring(3));

			// Lê o segundo token: AAAAMMDD
			token = scanner.next();
			
			// Faz o parse da data, criando um objeto Date
			Date data = df.parse(token);

			// Antes de ler o token do local, é preciso checar se ele existe
			String local = null;
			if (scanner.hasNext()) {
				local = scanner.next();
			}

			// Fecha o Scanner
			scanner.close();

			// Adiciona uma nova foto ao álbum
			album.adicionar(id, data, local);
		}

		// Retorna o álbum criado
		return album;
	}
}
