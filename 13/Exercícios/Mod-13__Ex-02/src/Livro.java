import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Livro implements Recordable {

	private String titulo;
	private int numPaginas;
	private Autor autor;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public Autor getAutor() {
		return autor;
	}
	
	public void read(DataInputStream in) throws IOException {
		// L� o t�tulo do livro
		titulo = in.readUTF();
		if (titulo.equals(NULL_DATA)) {
			// Se o t�tulo for <null>, ele era null quando foi gravado
			titulo = null;
		}
		
		// L� o n�mero de p�ginas do livro
		numPaginas = in.readInt();
		
		// Se o objeto autor for nulo, cria o objeto para que ele tenha seus dados populados
		if (autor == null) {
			autor = new Autor();
		}
		
		// Chama o m�todo read do autor, que vai popular os dados do autor
		autor.read(in);
	}

	public void write(DataOutputStream out) throws IOException {
		// Grava o t�tulo
		if (titulo == null) {
			// Se o t�tulo for nulo, grava <null>
			out.writeUTF(NULL_DATA);
		} else {
			out.writeUTF(titulo);
		}
		
		// Grava o n�mero de p�ginas
		out.writeInt(numPaginas);
		
		// Se houver um autor para o livro faz a grava��o dos seus dados
		if (autor != null) {
			autor.write(out);
		}
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", numPaginas=" + numPaginas
				+ ", autor=" + autor + "]";
	}
}
