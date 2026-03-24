import Login.Game;
import Models.Enemy;
import Models.Player;
import Narrator.History;

import java.util.Scanner;

import Combate.CombatManager;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Player hero = Game.menuLogin();
		History.parte1(hero);
		History.parte2(hero);

		Enemy monstro = Enemy.spawnEnemy(1);

		CombatManager battle = new CombatManager();
		battle.startBattle(hero, monstro);
		
		scan.close();
	}
}
