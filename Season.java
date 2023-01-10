package com.xworkz.spring.things;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	@Value("Sql")
	private String name;
	private LocalTime duration;
	private LocalDate StartingMonth;
	
	
	public Season() {
    System.out.println("season is going on ");
    
	
	}


	public String getName() {
		return name;
	}

@Value ("Java")
	public void setName( String name) {
		this.name = name;
	}


	public LocalTime getDuration() {
		return duration;
	}

//	@Value("LocalTime.now()")
	public void setDuration( LocalTime duration) {
		this.duration = duration;
	}


	public LocalDate getStartingMonth() {
		return StartingMonth;
	}

//	 @Value ("LocalDate.now()")
	public void setStartingMonth( LocalDate startingMonth) {
		StartingMonth = startingMonth;
	}

}
