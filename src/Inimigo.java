import java.util.Random;

public class Inimigo {

    private int vida;
    private int ataque;
    private int defesa;

    public Inimigo() {
        this.vida = 30;
        this.ataque = gerarDefesaAleatoria();
        this.defesa = gerarDefesaAleatoria();
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

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    private int gerarDefesaAleatoria() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public void atacar(Jogador jogador) {
        int vidaJogador = jogador.getVida();
        int vidaAtualizadaJogador = vidaJogador - ataque;

        if (vidaAtualizadaJogador < 0) {
            vidaAtualizadaJogador = 0;
        }
        jogador.setVida(vidaAtualizadaJogador);
    }


    public void estaVivo() {
        if (vida > 0) {
            System.out.println("O inimigo está vivo. Vida restante:  " + vida);
        } else {
            System.out.println("Inimigo está morto");
        }
    }
}
