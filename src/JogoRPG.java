import java.util.Random;
import java.util.Scanner;

public class JogoRPG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inimigo inimigo = new Inimigo();
        Jogador jogador = new Jogador();

        System.out.println("Escolha seu personagem: ");
        System.out.println("1 - Guerreiro ");
        System.out.println("2 - Mago ");
        int option = scanner.nextInt();

        Jogo jogo = new Jogo(inimigo, jogador);
        jogo.iniciarJogo(option);


    }
}