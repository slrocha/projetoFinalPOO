import javax.management.ObjectInstance;

public class Jogador {
    private int vida;
    private int ataque;
    private int iniciativa;

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
        int vidaInimigo = inimigo.getVida();
        if(vidaInimigo !=0){
            vidaInimigo = ataque-inimigo.getDefesa();
            inimigo.setVida(vidaInimigo);
        } else {
            System.out.println("O Inimigo está morto!");
        }
    }

    public int  estaVivo(){
        if(vida > 0){
            System.out.println("O Jogador está vivo!");
            return 1;
        } else{
            System.out.println("Suas vidas acabaram!");
            return 0;
        }
    }

    public void iniciarBatalha(Object obj, int iniJ, int iniM) {

        Inimigo inimigo = new Inimigo();
        while (inimigo.estaVivo() != 0 && estaVivo() != 0) {
            if (obj instanceof Mago) {
                if (iniJ > iniM) {
                    ((Mago) obj).atacar(inimigo);
                    //inimigo.defender();
                } else {
                    inimigo.atacar();
                }
            } else {
                if (iniJ > iniM) {
                    ((Guerreiro) obj).atacar(inimigo);
                } else {
                    inimigo.atacar();
                }
            }
        }
    }
}
