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

        if (ataqueJogador > defesaInimigo) {
            System.out.println("Ataque jogador: " + ataqueJogador);
            vidaInimigo = vidaInimigo - (ataqueJogador - defesaInimigo);
            System.out.println("Você acertou o inimigo!");
            inimigo.setVida(vidaInimigo);
            System.out.println("Vida Inimigo = " + vidaInimigo);
        } else {
            System.out.println("Ataque jogador: " + ataqueJogador);
            System.out.println("Você errou o ataque!");
        }
    }

    public void defender(Inimigo inimigo) {
        int defesaJogador = getDefesa();
        int ataqueI = inimigo.getAtaque();
        int vidaJogador = getVida();

        if (ataqueI > defesaJogador){
            System.out.println("Defesa jogador: " + defesaJogador);
            vidaJogador = vidaJogador - (ataqueI - defesaJogador);
            setVida(vidaJogador);
            System.out.println("O Jogador está vivo e possui " + vidaJogador + " pontos de vidas!");
        }else {
            System.out.println("Defesa jogador: " + defesaJogador);
            System.out.println("O Jogador não sofreu dano");
       }
    }

    public int estaVivo() {
        if (vida > 0) {
            return 1;
        } else {
            System.out.println("Suas vidas acabaram!");
            return 0;
        }
    }
}
