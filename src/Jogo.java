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
            jogador.iniciarBatalha(guerreiro, iniJ, iniM);
        } else {
            System.out.println("Seja bem-vindo MAGO, vamos iniciar sua batalha ");
            Mago mago = new Mago();
            jogador.iniciarBatalha(mago, iniJ, iniM);
        }
    }



}
