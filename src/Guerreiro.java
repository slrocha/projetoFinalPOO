import java.util.Random;

public class Guerreiro extends Jogador {

    public Guerreiro(int vida, int ataque, int defesa) {
        super(vida, ataque, defesa);
    }

    //Metodo atacar feito por Kaah Nogueira.
    public int atacar(Inimigo inimigo) {
        Random rand = new Random();
        int ataque = rand.nextInt(20) + 1;
        this.setAtaque(ataque);
        int defesaInimigo = inimigo.getDefesa();

        if (ataque >= defesaInimigo) {
            int vidaAtualizadaInimigo = ataque - defesaInimigo;
            System.out.println("Você acertou o inimigo!");
            inimigo.setVida(vidaAtualizadaInimigo);
            return vidaAtualizadaInimigo;
        } else {
            System.out.println("Você errou o ataque!");
            return 0;
        }
    }
}
