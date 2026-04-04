package com.rpg.bloodivine.DTO;

public record Player_DTO(
	Long id,
	String name,
	int hp,
	int attack,
	int speed
) {}
