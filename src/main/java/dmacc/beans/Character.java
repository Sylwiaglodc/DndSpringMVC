package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Character {
	
	private String characterName;
	private String characterClass;
	private String race;
	private int level;
	
	
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Character(String characterName, String characterClass, String race, int level) {
		super();
		this.characterName = characterName;
		this.characterClass = characterClass;
		this.race = race;
		this.level = level;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getCharacterClass() {
		return characterClass;
	}
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "Character [characterName=" + characterName + ", characterClass=" + characterClass + ", race=" + race
				+ ", level=" + level + "]";
	}

}
