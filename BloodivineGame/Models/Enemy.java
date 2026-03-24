package Models;

public class Enemy extends Entity {
	public Enemy(String name, int hp, int atk, int vel){
		super(name, hp, atk, vel);
	}

	public static Enemy spawnEnemy(int tipo) {
		switch (tipo) {
    case 1: return new Enemy("Esqueleto",        30,  10,  6);
    case 2: return new Enemy("Goblin",            55,  20,  8);
    case 3: return new Enemy("Demônio",           70,  13, 10);
    case 4: return new Enemy("Cavaleiro das Trevas", 150, 25, 12);
    case 5: return new Enemy("Rei dos Demônios", 200,  30, 12);
    default: return new Enemy("Entidade Caótica", 300, 100, 17);
		}
	}

}
