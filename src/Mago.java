import java.util.Scanner;

public class Mago extends Jogador {
	Scanner leitura = new Scanner(System.in);

	public Mago(int vida, int ataque, int iniciativa, int eficacia) {
		super(vida, ataque, iniciativa, eficacia);
	}

	public void Ataque() {
		System.out.println("Escolha seu ataque Mago:");
		System.out.println("1- Bola de Fogo");
		System.out.println("2- Raio Arcano");
		System.out.println("3- Explosão de Gelo");
		System.out.println("4- Míssil Mágico");
		int ataqueEscolhido = leitura.nextInt();
		switch (ataqueEscolhido) {
			case 1:
				System.out.println("BOLA DE FOGO!");
				break;
			case 2:
				System.out.println("RAIO ARCANO!");
				break;
			case 3:
				System.out.println("EXPLOSÃO DE GELO!");
				break;
			case 4:
				System.out.println("MÍSSIL MÁGICO!");
				break;
			default:
				System.out.println("Opção inválida!");
		}
	}

	public void Defesa() {

	}
}
