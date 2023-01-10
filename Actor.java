package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("actor")
public class Actor {

	
	private String name;
	private String language;
	private int age;
	public Actor(@Value("Akshay") String name, @Value("Hindi") String language,@Value("56") int age) {
		super();
		this.name = name;
		this.language = language;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getLanguage() {
		return language;
	}
	public int getAge() {
		return age;
	}
	
	
	
	
}
