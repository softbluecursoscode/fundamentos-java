import java.util.Date;

// Representa uma foto do álbum
public class Foto {

	// ID da foto
	private int id;
	
	// Data da foto
	private Date data;
	
	// Local da foto (null se não for definido)
	private String local;
	
	// Construtor
	public Foto(int id, Date data, String local) {
		this.id = id;
		this.data = data;
		this.local = local;
	}
	
	// Métodos getter

	public int getId() {
		return id;
	}

	public Date getData() {
		return data;
	}

	public String getLocal() {
		return local;
	}
}
