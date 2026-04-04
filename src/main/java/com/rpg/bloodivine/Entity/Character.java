package com.rpg.bloodivine.Models;


public abstract class Character {
	protected Long id;
	protected String name;
	protected int hp;
	protected int attack;
	protected int speed;

	public Character( String name, int hp, int attack, int speed) {
		this.name = name;
		this.attack = attack;

		if (hp <= 0) {
			this.hp = 0;
		}
		else {
			this.hp = hp;
		}

		if (speed <= 0) {
			this.speed = 1;
		}
		else { 
			this.speed = speed;
		}
	}

	public void receiveDamage(int damage) {
		this.hp -= damage;
		if (this.hp  < 0) { this.hp = 0; }
	}

	public String getName() { return name; }

	public int getAtack() { return attack; }

	public boolean isAlive() { return hp > 0; }

	public int getHp() { return hp; }

	public int  getSpeed() { return speed; }

}
