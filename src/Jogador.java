public class Jogador {
    private int vida;
    private int ataque;
    private int iniciativa;

    public Jogador(int vida, int ataque, int iniciativa) {
        this.vida = vida;
        this.ataque = ataque;
        this.iniciativa = iniciativa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

}
