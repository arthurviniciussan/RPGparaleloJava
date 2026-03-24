package Models;

public class Player extends Entity {
	protected int potions;
	protected Player(String name, int hp, int atk, int vel, int potions){
		super(name, hp, atk, vel);
		this.potions = potions;
	}


	public int getPotions() { return potions; }

	public void usePotion() {
		if (potions > 0) {
			this.hp += 30;
			this.potions--;
			System.out.println(name + " usou uma poção! HP atual: " + hp);
		}
		else {
			System.out.println("Sem poções restantes!");
		}
	}


	public static class Warrior extends Player {
		public Warrior(String name){
			super(name, 100, 15, 7, 5);
		}
	}

	public static class Assassin extends Player {
		public Assassin(String name) {
			super(name, 75, 9, 12, 8);
		}
	}

	public static class Tank extends Player {
		public Tank(String name) {
			super(name, 150, 20, 5, 4);
		}
	}

}
