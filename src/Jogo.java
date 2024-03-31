import java.util.Random;

public class Jogo {
    private Inimigo inimigo;
    private Jogador jogador;

    public Jogo(Inimigo inimigo, Jogador jogador) {
        this.inimigo = inimigo;
        this.jogador = jogador;
    }

    public Inimigo getInimigo() {
        return inimigo;
    }

    public void setInimigo(Inimigo inimigo) {
        this.inimigo = inimigo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void iniciarJogo(int opcao){

        Random ataque = new Random();

        int iniJ = ataque.nextInt(21);
        int iniM = ataque.nextInt(21);

        if(opcao == 1){
            System.out.println("Seja bem-vindo GUERREIRO, vamos iniciar sua batalha ");
            Guerreiro guerreiro = new Guerreiro();
            iniciarBatalha(guerreiro, iniJ, iniM);
        } else {
            System.out.println("Seja bem-vindo MAGO, vamos iniciar sua batalha ");
            Mago mago = new Mago();
            iniciarBatalha(mago, iniJ, iniM);
        }
    }

    public void iniciarBatalha(Object obj, int iniJ, int iniM) {
        Inimigo inimigo = new Inimigo();
        while (inimigo.estaVivo() != 0 && jogador.estaVivo() != 0) {
            if (obj instanceof Mago) {
                if (iniJ > iniM) {
                    ((Mago) obj).atacar(inimigo);
                    inimigo.defender();
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
