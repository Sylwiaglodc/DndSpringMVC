package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Player;
import dmacc.beans.Character;

@Configuration
public class BeanConfiguration {

	@Bean
	public Player player() {
		Player bean = new Player("Sylwia", "2082835757", "yes");
		return bean;
	}
	
	@Bean
	public Character character() {
		Character bean = new Character("Scad", "Monk", "Human", 25);
		return bean;
	}
}
