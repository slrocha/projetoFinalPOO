import java.util.Random;
import java.util.Scanner;

public class JogoRPG {
    public static void main(String[] args) {

        Inimigo inimigo = new Inimigo();
        Jogador jogador = new Jogador();


        Jogo jogo = new Jogo(inimigo, jogador);
        jogo.iniciarJogo();


    }
}