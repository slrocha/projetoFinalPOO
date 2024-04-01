import java.util.Random;

public class Inimigo{

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
        setAtaque(gerarValoresAleatorios());
        int defesaJogador = jogador.getDefesa();
        int vidaJodador = jogador.getVida();
        int ataqueInimigo = getAtaque();

        System.out.println("Ataque Inimigo: " + ataqueInimigo);
        System.out.println("Defesa JOgador: " + defesaJogador);

        if (jogador.estaVivo()==1) {
            if (ataqueInimigo > defesaJogador) {
                          vidaJodador = vidaJodador - (ataqueInimigo - defesaJogador);
                jogador.setVida(vidaJodador);
            } else {

                System.out.println("Inimigo errou o ataque!");
            }
        } else {
            System.out.println("A vida do jogador acabou " + vidaJodador);
            System.out.println("Final de jogo! O inimigo derrotou o jogador");
        }
    }

    public void defender(Jogador jogador) {
        int ataqueJogador = jogador.getAtaque();
        int defesaInimigo = getDefesa();

        if (estaVivo() == 1) {
            if (ataqueJogador > defesaInimigo) {
                //System.out.println("Defesa inimigo: " + defesaInimigo);
            } else {
                //System.out.println("Defesa inimigo: " + defesaInimigo);
                System.out.println("O inimigo não sofreu dano.");
            }
        } else {
            System.out.println("Inimigo está morto");
            System.out.println("Final de jogo! Jogador derrotou o inimigo");
        }
        setDefesa(gerarValoresAleatorios());
    }

    public int estaVivo() {
        if (getVida() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
