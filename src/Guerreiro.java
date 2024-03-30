import java.util.Scanner;

public class Guerreiro extends Jogador{
    Scanner leitura = new Scanner(System.in);

    public Guerreiro extends Jogador(){

        public Guereiro(int vida, int ataque, int iniciativa, int eficacia){
            super(vida, ataque, iniciativa);
        }
        public void Ataque(){
            System.out.println("Escolha seu ataque Guerreiro:");
            System.out.println("1- Soco devastador");
            System.out.println("2- Ataque do trovão");
            System.out.println("3- Ataque Giratório");
            System.out.println("4- Golpe de Espada");
            ataque = leitura.nextInt();
            switch (ataque){
                case 1:
                    System.out.println("SOCO DEVASTADOOOR!!");
                    ataque = -5;

                case 2:
                    System.out.println("ATAQUE DE TROVÃO!!");

            }
        }
        public void Defesa(){

        }


    }

}
