import java.util.Random;

public class Inimigo {

    private int vida;
    private int ataque;
    private int defesa;


    public Inimigo() {
        this.vida = 30;
        this.ataque = gerarValoresAleatorios();
        this.defesa = gerarValoresAleatorios();
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

    private int gerarValoresAleatorios() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public void atacar(Jogador jogador) {
        int vidaJogador = jogador.getVida();
        int defesaJogador = jogador.getDefesa();

        vidaJogador = defesaJogador - ataque;

        int vidaAtualizadaJogador =  vidaJogador;

        if (vidaAtualizadaJogador <= 0) {
            vidaAtualizadaJogador = 0;
        }

        jogador.setVida(vidaAtualizadaJogador);
    }


    public int estaVivo() {
        if (vida > 0) {
            System.out.println("O inimigo está vivo. Vida restante:  " + vida);
            return 1;
        } else {
            System.out.println("Inimigo está morto");
            return 0;
        }
    }
}
