package com.rpg.bloodivine.Models;

public class Player extends Character {
	Long id;

	public Player(String name, int hp, int attack, int speed) {
		super(name, hp, attack, speed);
	}

}
