public class Jogador {
    private int vida;
    private int ataque;
    private int iniciativa;
    private int defesa;

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

    public Jogador(int ataque) {
        this.vida = 20;
        this.ataque = ataque;
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
        int vidaInimigo = inimigo.getVida();
        if(vidaInimigo !=0){
            vidaInimigo--;
            inimigo.setVida(vidaInimigo);
        } else {
            System.out.println("O Inimigo está morto!");
        }
    }

    public void estaVivo(){
        if(vida > 0){
            System.out.println("Está vivo!");
        } else{
            System.out.println("Suas vidas acabaram!");
        }
    }

    public void iniciarBatalha(Object obj){
        //for que fique variando entre o numero de ataques para pontuar inimigoxjogador
        //diminuir vidas inimigoxjogador
        //atualizar danos.
    }
}
