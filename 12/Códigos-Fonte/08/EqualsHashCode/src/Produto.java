public class Produto {
	private int id;
	private String descricao;

	public Produto(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return id + ", " + descricao;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Produto)) {
			return false;
		}

		Produto other = (Produto) obj;

		if (this.id == other.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		//return (int) (Math.random() * 10);
		return String.valueOf(id).hashCode();
	}
}
