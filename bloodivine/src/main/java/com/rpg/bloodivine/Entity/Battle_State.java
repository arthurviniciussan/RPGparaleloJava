package com.rpg.bloodivine.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "battle_states")
public class Battle_State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "player_id", nullable = false, unique = true)
	private Player player;


	@Column(nullable = false)
	private String enemy_name;

	@Column(nullable = false)
	private int enemy_max_hp;

	@Column(nullable = false)
	private int enemy_current_hp;

	@Column(nullable = false)
	private int enemy_attack;

	@Column(nullable = false)
	private int enemy_speed;


	@Column(nullable = false)
	private int turn_number = 1;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Status status;
	public enum Status {
		ONGOING, PLAYER_VICTORY, PLAYER_DEFEATED
	}
	
	@Column(name = "created_at")
		private LocalDateTime created_at;
		
		@Column(name = "updated_at")
		private LocalDateTime updated_at;

	protected Battle_State() {}
}