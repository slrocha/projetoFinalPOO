
public class Mago extends Jogador {
	private int inteligencia;
	private int magia;

	public Mago(int vida, int ataque, int inteligencia, int magia) {
		super(vida, ataque);
		this.inteligencia = inteligencia;
		this.magia = magia;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

}