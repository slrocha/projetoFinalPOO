import java.util.Random;
import java.util.Scanner;
class Jogo {
    private Jogador jogador;
    private Inimigo inimigo;


    public Jogo(Inimigo inimigo, Jogador jogador) {
        this.inimigo = inimigo;
        this.jogador = jogador;
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao RPG!");
        System.out.println("Escolha sua classe: ");
        System.out.println("1. Guerreiro");
        System.out.println("2. Mago");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Seja bem-vindo GUERREIRO, vamos iniciar sua batalha ");
                break;
            case 2:
                System.out.println("Seja bem-vindo MAGO, vamos iniciar sua batalha ");
                break;
            default:
                System.out.println("Escolha inválida. Por favor, tente novamente.");
                iniciarJogo();
                return;
        }

        System.out.println("Iniciando batalha...");
        batalha(escolha);
    }

    private void batalha(int escolha) {
        //Random random = new Random();
        System.out.println("=========================");

        while (inimigo.estaVivo() != 0 && jogador.estaVivo() != 0) {

            if (escolha == 1) {
                Guerreiro guerreiro = new Guerreiro();
                guerreiro.ataque(inimigo);

                if (inimigo.estaVivo() == 0) {
                    System.out.println("Você derrotou o inimigo!");
                    return;
                }
                inimigo.atacar(guerreiro);


            } else {
                Mago mago = new Mago();
                mago.ataque(inimigo);

                if (inimigo.estaVivo() == 0) {
                    System.out.println("Você derrotou o inimigo!");
                    return;
                }
                inimigo.atacar(mago);
            }
            if (jogador.estaVivo() == 0) {
                System.out.println("Você foi derrotado pelo inimigo!");
                return;
            }

        }
    }
}