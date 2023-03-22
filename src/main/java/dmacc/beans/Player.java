package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity
public class Player {
	
	@Id
	@GeneratedValue
	private long id;
	private String playerName;
	private String phoneNumber;
	private String availability;
	@Autowired
	private Character character;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String playerName) {
		super();
		this.playerName = playerName;
		// TODO Auto-generated constructor stub
	}
	
	public Player(String playerName, String phoneNumber, String availability) {
		super();
		this.playerName = playerName;
		this.phoneNumber = phoneNumber;
		this.availability = availability;
	}
	
	public Player(long id, String playerName, String phoneNumber, String availability) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.phoneNumber = phoneNumber;
		this.availability = availability;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", phoneNumber=" + phoneNumber + ", availability="
				+ availability + ", character=" + character + "]";
	}

	
}
