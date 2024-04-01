import java.util.Random;

public class Jogador {
    private int vida;
    private int ataque;
    private int defesa;

    public Jogador() {

        this.vida = 20;
        this.defesa = gerarValoresAleatorios();
        this.ataque = gerarValoresAleatorios();
    }

    private int gerarValoresAleatorios() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
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

    public void atacar(Inimigo inimigo) {

        setAtaque(gerarValoresAleatorios());

        int defesaInimigo = inimigo.getDefesa();
        int vidaInimigo = inimigo.getVida();
        int ataqueJogador = getAtaque();

        if(inimigo.estaVivo()==1) {
            if (ataqueJogador > defesaInimigo) {
                System.out.println("Ataque jogador: " + ataqueJogador);
                vidaInimigo = vidaInimigo - (ataqueJogador - defesaInimigo);

                System.out.println("Você acertou o inimigo!");
                System.out.println("Nº de vida do inimigo : " + vidaInimigo);
                inimigo.setVida(vidaInimigo);

            } else {
                System.out.println("Ataque jogador: " + ataqueJogador);
                System.out.println("Você errou o ataque!");
            }
        } else {
            System.out.println("A vida do inimigo acabou  " + vidaInimigo);
            System.out.println("Final de jogo! Jogador derrotou o inimigo");
        }
    }

    public void defender(Inimigo inimigo) {
        int defesaJogador = getDefesa();
        int ataqueI = inimigo.getAtaque();

        if (estaVivo() == 1) {
            if (ataqueI > defesaJogador) {
                System.out.println("Defesa jogador: " + defesaJogador);
            } else {
                System.out.println("Defesa jogador: " + defesaJogador);
                System.out.println("O Jogador não sofreu dano");
            }
        }else {
            System.out.println("Jogador está morto");
            System.out.println("Final de jogo! Inimigo derrotou o jogador");
        }
    }

    public int estaVivo() {
        if (getVida() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
