import java.util.Scanner;
import java.util.Random;

public class Guerreiro extends Jogador {
  
    Scanner leitura = new Scanner(System.in);

    public Guerreiro( int vida, int ataque, int defesa, int iniciativa){
        super(vida, ataque, defesa, iniciativa);
    }

    public void ataque() {
        System.out.println("Escolha seu ataque Guerreiro:");
        System.out.println("1- Soco devastador");
        System.out.println("2- Ataque do trovão");
        System.out.println("3- Ataque Giratório");
        System.out.println("4- Golpe de Espada");
        int option = leitura.nextInt();
        Inimigo inimigo = new Inimigo();

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

        }
    }

    public void defesa() {
        System.out.println("Escolha sua defesa Guerreiro:");
        System.out.println("1- Escudo");
        System.out.println("2- Desviar");
        int option = leitura.nextInt();
        Inimigo inimigo = new Inimigo();

        switch (option) {
            case 1:
                System.out.println("Posisão de defesa");
                defender(inimigo);
                break;

            case 2:
                System.out.println("Você optou desviar do ataque inimigo");
                defender(inimigo);
                break;
        }
    }
}
