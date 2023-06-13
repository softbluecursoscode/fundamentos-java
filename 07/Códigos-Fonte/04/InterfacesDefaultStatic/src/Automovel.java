
public interface Automovel {

	void acelerar();
	void frear();
	
	default void derrapar() {
		acelerar();
		acelerar();
		frear();
	}

	static int getVelocidadeMaxima() {
		return 300;
	}
}
