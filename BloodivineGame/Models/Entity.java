package Models;

public abstract class Entity {

	protected String name;
	protected int atk;
	protected int hp;
	protected int vel;

	public Entity( String name, int hp, int atk, int vel) {
		this.name = name;
		this.atk = atk;

		if (hp <= 0) {
			this.hp = 0;
		}
		else {
			this.hp = hp;
		}

		if (vel <= 0) {
			this.vel = 1;
		}
		else {
			this.vel = vel;
		}
	}

	public void receiveDamage(int dano) {
		this.hp -= dano;
		if (this.hp < 0) this.hp = 0;
	}
	public String getName() { return name; }

	public int getAtk() { return atk; }

	public boolean isAlive() { return hp > 0; }

	public int getHp() { return hp; }

	public int getVel() { return vel; }
}
