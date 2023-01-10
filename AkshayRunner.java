package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.Akshayconfigration;
import com.xworkz.spring.things.Actor;
import com.xworkz.spring.things.Rocket;
import com.xworkz.spring.things.Season;

public class AkshayRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Akshayconfigration.class);

		String[] ref = applicationContext.getBeanDefinitionNames();

		System.out.println(Arrays.toString(ref));

		Rocket rocket = applicationContext.getBean("rocket",Rocket.class);
		System.out.println(rocket.toString());
		System.out.println(rocket.getContry());
		System.out.println(rocket.getNamme());
		System.out.println(rocket.getBudget());

		Rocket rocket1 = applicationContext.getBean("getoverLoad", Rocket.class);
		System.out.println(rocket1.toString());
		System.out.println(rocket1.getBudget());
		System.out.println(rocket1.getContry());
		System.out.println(rocket1.getNamme());
		System.out.println(System.lineSeparator());
		Actor actor=applicationContext.getBean("actor",Actor.class);
		System.out.println(actor);
		System.out.println(actor.getName());
		System.out.println(actor.getAge());
		System.out.println(actor.getLanguage());
		Actor actor1=applicationContext.getBean("getActorname",Actor.class);
		System.out.println(actor1);
		System.out.println(actor1.getName());
		System.out.println(actor1.getAge());
		System.out.println(actor1.getLanguage());
		
		Season season=applicationContext.getBean(Season.class);
		System.out.println(season);
		System.out.println(season.getName());
		


		
		
		
	}

}
