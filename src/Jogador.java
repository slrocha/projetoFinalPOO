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

        if (ataque > defesaInimigo) {
            System.out.println("Ataque jogador: " + ataque);
            int vidaInimigoAtualizada = ataque - defesaInimigo;
            System.out.println("Você acertou o inimigo!");
            inimigo.setVida(vidaInimigo - vidaInimigoAtualizada);
            System.out.println("Vida Inimigo = " + inimigo.getVida());
        } else {
            System.out.println("Você errou o ataque!");
        }

    }

    public void defender() {
        setDefesa(gerarValoresAleatorios());
        //int ataqueI = inimigo.getAtaque();
        //if (ataqueI > defesa) {
            System.out.println("Defesa jogador: " + defesa);
           //vida = ataqueI - defesa;
            //System.out.println("O Jogador está vivo e possui " + vida + " pontos de vidas!");
        //} else {
            System.out.println("Defesa jogador: " + defesa);
           // System.out.println("O Jogador não sofreu dano");
       // }
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
