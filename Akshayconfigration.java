package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.things.Actor;
import com.xworkz.spring.things.Rocket;
import com.xworkz.spring.things.Season;

@Configuration
@ComponentScan("com.xworkz.spring")
public class Akshayconfigration {
	
	
	
	
	@Bean
	public Rocket getoverLoad()
	{
		Rocket rocket=new Rocket();
		rocket.setBudget(4575788D);;
		rocket.setContry("Russia");
		rocket.setNamme("putin");
		
		return rocket;
	}

	@Bean
	public Actor getActorname() {
		Actor actor=new Actor("Dboss", "Kannada", 458455);
		return actor;
		
	}
	
	

}
