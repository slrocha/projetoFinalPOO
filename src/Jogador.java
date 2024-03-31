import javax.management.ObjectInstance;
import java.util.Random;

public class Jogador {
    private int vida;
    private int ataque;
    private int iniciativa;
    private int defesa;
  
     public Jogador(int vida, int ataque, int iniciativa, int defesa) {
        this.vida = 20;
        this.ataque = ataque;
        this.iniciativa = iniciativa;
        this.defesa = defesa;
    }
  
    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
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

    public void atacar(Inimigo inimigo){
        Random rand = new Random();
        ataque = rand.nextInt(20) + 1;
        int defesaInimigo = inimigo.getDefesa();
        int vidaInimigo = inimigo.getVida();

        if(vidaInimigo !=0) {
            if (ataque >= defesaInimigo) {
                vidaInimigo = ataque - defesaInimigo;
                System.out.println("Você acertou o inimigo!");
                inimigo.setVida(vidaInimigo);
            } else {
                System.out.println("Você errou o ataque!");
            }
        } else {
            System.out.println("Inimigo está morto!");
        }
    }

    public void defender(Inimigo inimigo){
         int ataqueI = inimigo.getAtaque();

         if(ataqueI > defesa){
             //vida = ataqueI - defesa;
             System.out.println("O Jogador está vivo e possui " + vida + " pontos de vidas!");
         } else {
             System.out.println("O Jogador não sofreu dano");
         }
    }

    public int estaVivo(){
        if(vida > 0){
            System.out.println("O Jogador está vivo!");
            return 1;
        } else{
            System.out.println("Suas vidas acabaram!");
            return 0;
        }
    }
}
