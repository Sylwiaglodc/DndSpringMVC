package dmacc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Player;
import dmacc.beans.Character;

import dmacc.controller.BeanConfiguration;
import dmacc.repository.PlayerRepository;


@SpringBootApplication
// @ComponentScan("dmacc.repository.PlayerRepository")
public class DndSpringMvcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DndSpringMvcApplication.class, args);
			
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Player c = appContext.getBean("player", Player.class);
		
		System.out.println(c.toString());
		((AbstractApplicationContext) appContext).close();

	}
	
	@Autowired
	PlayerRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Character a = new Character("SCAD", "MONK", "HUMAN", 12);
		
		Player p1 = new Player(1, "Sylwia", "2082835757", "yes");
		
		p1.setCharacter(a);
		repo.save(p1);

		((AbstractApplicationContext) appContext).close();
	}
}