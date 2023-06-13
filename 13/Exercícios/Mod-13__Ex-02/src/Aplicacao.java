import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Aplicacao {
	// Constante para o arquivo que vai armazenar os dados
	private static final String FILE = "livros.bin";

	public static void main(String[] args) throws Exception {
		
		// Exibe o menu de opções
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Gravar dados");
		System.out.println("2 - Ler dados");
		System.out.print("=> ");
		
		// Lê a opção digitada
		Scanner keyboard = new Scanner(System.in);
		String opcao = keyboard.nextLine();
		keyboard.close();
		
		if (opcao.equals("1")) {
			gravarDados();
			
		} else if (opcao.equals("2")) {
			lerDados();
			
		} else {
			System.out.println("Opção desconhecida");
		}
	}
	
	private static void lerDados() throws Exception {
		// Cria dois objetos Livro
		Livro l1 = new Livro();
		Livro l2 = new Livro();
		
		DataInputStream dis = null;
		try {
			// Cria um stream para leitura dos dados
			dis = new DataInputStream(new FileInputStream(FILE));
			
			// Lê os dados de l1
			l1.read(dis);
			
			// Lê os dados de l2
			l2.read(dis);
		} finally {
			// Fecha a stream
			if (dis != null) {
				dis.close();
			}
		}
		
		// Imprime os dados dos livros (o método toString() será chamado)
		System.out.println(l1);
		System.out.println(l2);
	}
	
	private static void gravarDados() throws Exception {
		// Cria duas datas como String e um formatador
		String d1 = "01/04/1972";
		String d2 = "25/02/1980";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// Cria os autores e livros a serem gravados no arquivo
		Autor a1 = new Autor();
		a1.setNome("José Silva");
		a1.setDataNascimento(sdf.parse(d1));
		
		Autor a2 = new Autor();
		a2.setNome("Maria Oliveira");
		a2.setDataNascimento(sdf.parse(d2));
		
		Livro l1 = new Livro();
		l1.setTitulo("Orientação a Objetos");
		l1.setNumPaginas(350);
		l1.setAutor(a1);
		
		Livro l2 = new Livro();
		l2.setTitulo("Programação Java");
		l2.setNumPaginas(200);
		l2.setAutor(a2);
		
		DataOutputStream dos = null;
		try {
			// Cria um stream para gravação dos dados
			dos = new DataOutputStream(new FileOutputStream(FILE));
			
			// Grava os dados de l1
			l1.write(dos);
			
			// Grava os dados de l2
			l2.write(dos);
		} finally {
			// Fecha a stream
			if (dos != null) {
				dos.close();
			}
		}
	}
}
