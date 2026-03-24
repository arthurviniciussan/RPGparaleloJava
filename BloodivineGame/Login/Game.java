package Login;

import Models.Player;
import java.util.Scanner;
import Narrator.History;

public class Game {
	public static Player menuLogin() {
		Scanner scan = new Scanner(System.in);
		History.textoLento("--- BEM VINDO A BLOODIVINE!! ---");
		System.out.println("Digite o nome do seu Personagem! ");
		String name = scan.nextLine();


		while (true) {
			
		History.textoLento("Escolha sua classe: ");
		System.out.println("1 - Guerreiro (Balanceado)");
		System.out.println("2 - Assassino (Veloz)");
		System.out.println("3 - Tank (Muito HP, Muito lento)");

		if (scan.hasNextInt()) {
			int escolha = scan.nextInt();
			scan.nextLine();

		switch (escolha) {
			case 1: return new Player.Warrior(name);
			case 2: return new Player.Assassin(name);
			case 3: return new Player.Tank(name);		
			default: System.out.println("Escolha inválida. Digite 1, 2 ou 3.");
		}
			}
			else {
				System.out.println("Entrada inválida. Digite um número.");
        scan.next(); 
			}
		}
	}
}
