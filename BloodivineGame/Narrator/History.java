package Narrator;
import Models.Player;

public class History {

	public static void textoLento( String text ) {
		try {
			for(int i = 0; i < text.length(); i++) {
				System.out.print(text.charAt(i));
				Thread.sleep(50);
			}
			System.out.println();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Erro de exibição de texto");
		}
	}
	public static void parte1(Player player) {
		String texto = "A Historia começa, " + player.getName() + " entra em uma caverna";
		textoLento(texto);
	}

		public static void parte2(Player player) {
		String texto =  player.getName() + " encontra um terrível esqueleto armado com espada e escudo";
		textoLento(texto);
	}
}
