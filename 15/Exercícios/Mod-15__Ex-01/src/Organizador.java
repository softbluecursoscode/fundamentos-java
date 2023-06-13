import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Organiza as fotos em um �lbum
public class Organizador {
	
	// Cria um �lbum de fotos com base em um diret�rio
	public Album carregarFotos(File diretorio) throws Exception {
		
		// Cria um formatador, utilizado depois para fazer o parse da data da foto no
		// nome do arquivo
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");

		// Lista os arquivos do diret�rio
		File[] arquivos = diretorio.listFiles();

		// Cria o �lbum
		Album album = new Album();

		// Itera sobre os arquivos do diret�rio
		for (File arquivo : arquivos) {
			// Obt�m o nome do arquivo
			String nomeArquivo = arquivo.getName();
			
			// A extens�o ".jpg" n�o interessa. Esta linha remove a extens�o
			nomeArquivo = nomeArquivo.substring(0, nomeArquivo.length() - 4);

			// Cria um objeto Scanner para executar a tokeniza��o
			Scanner scanner = new Scanner(nomeArquivo);
			
			// O delimitador � uma express�o regular. Os caracteres '-' ou '_' s�o delimitadores.
			scanner.useDelimiter("[-_]");
			
			String token = null;

			// L� o primeiro token: IMGXXXXX
			token = scanner.next();
			
			// Descarta a string 'IMG' e converte o que sobra para inteiro para formar o ID
			int id = Integer.parseInt(token.substring(3));

			// L� o segundo token: AAAAMMDD
			token = scanner.next();
			
			// Faz o parse da data, criando um objeto Date
			Date data = df.parse(token);

			// Antes de ler o token do local, � preciso checar se ele existe
			String local = null;
			if (scanner.hasNext()) {
				local = scanner.next();
			}

			// Fecha o Scanner
			scanner.close();

			// Adiciona uma nova foto ao �lbum
			album.adicionar(id, data, local);
		}

		// Retorna o �lbum criado
		return album;
	}
}
