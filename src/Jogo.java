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

    public void iniciarJogo(int opcao) {
        if (opcao == 1) {
            System.out.println("Seja bem-vindo GUERREIRO, vamos iniciar sua batalha ");
            iniciarBatalha( "G");
        } else {
            System.out.println("Seja bem-vindo MAGO, vamos iniciar sua batalha ");
            iniciarBatalha("M");
        }
    }

    public void iniciarBatalha( String type) {
        Random option = new Random();

        while (inimigo.estaVivo() != 0 && jogador.estaVivo() != 0) {
            System.out.println("=========================");
            int iniJogador = option.nextInt(21);
            int iniInimigo = option.nextInt(21);
            System.out.println("Iniciativa do Jogador: " + iniJogador);
            System.out.println("Iniciativa do Inimigo: " + iniInimigo);
            if (type.equals("G")) {
                Guerreiro guerreiro = new Guerreiro();
                if (iniJogador > iniInimigo) {
                    guerreiro.ataque(inimigo);
                    inimigo.defender(guerreiro);
                } else {
                    guerreiro.defesa();
                    inimigo.atacar(guerreiro);
                }
            } else {
                Mago mago = new Mago();
                if (iniJogador > iniInimigo) {
                    mago.ataque();
                    inimigo.defender(mago);
                } else {
                    inimigo.atacar(mago);
                    mago.defesa();
                }
            }
        }
    }
}
