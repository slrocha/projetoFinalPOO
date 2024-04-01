import java.util.Scanner;
import java.util.Random;

public class Guerreiro extends Jogador {
  
    Scanner scanner = new Scanner(System.in);

    public Guerreiro() { }

    public void ataque(Inimigo inimigo) {
        System.out.println("Escolha seu ataque Guerreiro:");
        System.out.println("1- Soco devastador");
        System.out.println("2- Ataque do trovão");
        System.out.println("3- Ataque Giratório");
        System.out.println("4- Golpe de Espada");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("SOCO DEVASTADOOOR!!");
                atacar(inimigo);
                break;
            case 2:
                System.out.println("ATAQUE DE TROVÃO!!");
                atacar(inimigo);
                break;
            case 3:
                System.out.println("ATAQUE GIRATÓRIO!!");
                atacar(inimigo);
                break;
            case 4:
                System.out.println("GOLPE DE ESPADA!!");
                atacar(inimigo);
                break;
            default:
                System.out.println("Opção inválida!!");
                break;

        }
    }

    public void defesa(Inimigo inimigo) {
        System.out.println("Escolha sua defesa Guerreiro:");
        System.out.println("1- Escudo");
        System.out.println("2- Desviar");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Posição de defesa");
                defender(inimigo);
                break;

            case 2:
                System.out.println("Você optou desviar do ataque inimigo");
                defender(inimigo);
                break;
            default:
                System.out.println("Opção inválida!!");
        }
    }
}
