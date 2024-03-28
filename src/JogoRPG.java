import java.util.Scanner;

public class JogoRPG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu personagem: ");
        System.out.println("1 - Guerreiro ");
        System.out.println("2 - Mago ");
        int option = scanner.nextInt();

        Inimigo inimigo = new Inimigo(); //vida e ataque
        Jogador jogador = new Jogador(); //

        Jogo jogo = new Jogo(, ); //
        jogo.iniciarJogo(option);



    }
}