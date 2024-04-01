import java.util.Random;

public class Inimigo {

    private int vida;
    private int ataque;
    private int defesa;


    public Inimigo() {
        this.vida = 30;
        this.defesa = gerarValoresAleatorios();
        this.ataque = gerarValoresAleatorios();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int novaVida) {
        if (novaVida <= 0) {
            this.vida = 0;
        } else {
            this.vida = novaVida;
        }
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
        int ataqueInimigo = getAtaque();
        int vidaJodador = jogador.getVida();
        int defesaJogador = jogador.getDefesa();

        System.out.println("Ataque Inimigo: " + ataqueInimigo);
        System.out.println("Defesa Jogador: " + defesaJogador);

        if (ataqueInimigo > defesaJogador) {
            vidaJodador = vidaJodador - (ataqueInimigo - defesaJogador);
            jogador.setVida(vidaJodador <= 0 ? 0 : vidaJodador);
        } else {
            System.out.println("Inimigo errou o ataque!");
        }

        System.out.println("Pontos de vida Jogador: " + jogador.getVida());
        setAtaque(gerarValoresAleatorios());
    }

    public int estaVivo() {
        if (getVida() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
