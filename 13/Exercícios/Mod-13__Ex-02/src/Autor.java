import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;

public class Autor implements Recordable {

	private String nome;
	private Date dataNascimento;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		// Lê o nome do autor
		nome = in.readUTF();
		if (nome.equals(NULL_DATA)) {
			// Se a string <null> for retornada, significa que o autor não possuía nome quando foi gravado
			nome = null;
		}
		
		// Lê a data de nascimento, em forma de um long
		long time = in.readLong();
		if (time == -1) {
			// Caso -1 tenha sido gravado, a data de nascimento era nula
			dataNascimento = null;
		} else {
			// Cria o objeto Date com base no valor lido
			dataNascimento = new Date(time);
		}
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		// Grava o nome do autor
		if (nome != null) {
			out.writeUTF(nome);
		} else {
			// Se o nome for nulo, grava <null>
			out.writeUTF(NULL_DATA);
		}
		
		// Grava a data de nascimento
		if (dataNascimento != null) {
			out.writeLong(dataNascimento.getTime());
		} else {
			// Se a data for nula, grava -1
			out.writeLong(-1);
		}
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}
}
