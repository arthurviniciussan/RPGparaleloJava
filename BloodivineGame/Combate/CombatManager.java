package Combate;

import Models.Player;
import Models.Enemy;
import Models.Entity;
import Narrator.History;

import java.util.Random;
import java.util.Scanner;

public class CombatManager {
	private Random random = new Random();
	private Scanner scan = new Scanner(System.in);

	public void startBattle(Player player, Enemy enemy) {
		History.textoLento("\n--- A BATALHA COMEÇA: " + player.getName() + " vs " + enemy.getName() + " ---");

		boolean PlayersTurn = FirstAtk(player, enemy);

		while (player.isAlive() && enemy.isAlive()) {
			if (PlayersTurn) {
				playerChoice(player, enemy);
			} else {
				enemyTurn(enemy, player);
			}
			PlayersTurn = !PlayersTurn;
		}
		if (player.isAlive()) {
			History.textoLento("Vitória! " + enemy.getName() + " foi derrotado.");
		} else {
			History.textoLento("Você caiu em batalha... Game Over.");
		}
	}

	private void playerChoice(Player player, Enemy enemy) {
		System.out.println("\n O que eu farei?");
		System.out.println("1 - Atacar");
		System.out.println("2 - Curar");
		System.out.print("Escolha: ");

		int choice = scan.nextInt();

		if (choice == 1) {
			Attacking(player, enemy);
		} else if (choice == 2) {
			player.usePotion();	
		} else {
			System.out.println("Opção Inválida! Você é ATACADO!");
		}
	}

	private void enemyTurn(Enemy enemy, Player player) {
		History.textoLento(enemy.getName() + " está preparando um ataque...");
		Attacking(enemy, player);
	}

	private boolean FirstAtk(Entity p, Entity e) {
		int rollPlayer = p.getVel() + random.nextInt(10);
		int rollEnemy = e.getVel() + random.nextInt(10);

		return rollPlayer >= rollEnemy;
	}

	private void Attacking(Entity attacker, Entity defender) {
		int damage = attacker.getAtk() + random.nextInt(3);
		defender.receiveDamage(damage);
		System.out.println(attacker.getName() + " atacou " + defender.getName() + " causando " + damage + " de dano!");
		System.out.println(defender.getName() + " HP restante: " + defender.getHp());
		System.out.println("______________________________");
	}
}
