import java.util.Random;
import java.util.Scanner;

public class JogoRPG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu personagem: ");
        System.out.println("1 - Guerreiro ");
        System.out.println("2 - Mago ");
        int option = scanner.nextInt();

        Random ataque = new Random();

        Inimigo inimigo = new Inimigo(); //vida e ataque
        Jogador jogador = new Jogador(ataque.nextInt()); //ataque - gera numero aleatórios

        Jogo jogo = new Jogo(inimigo, jogador);
        jogo.iniciarJogo(option);

    }
}