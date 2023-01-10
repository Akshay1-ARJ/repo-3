package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("rocket")
public class Rocket {
	@Value("india")
	private String contry;
	@Value("kempegouda international airport")
	private String namme;
	@Value("250000000")
	private double budget;

	public Rocket() {
		System.out.println("Rocket Rinnning constrictor based");
	}

	

	public String getContry() {
		return contry;
	}

	public String getNamme() {
		return namme;
	}

	public double getBudget() {
		return budget;
	}



	public void setContry(String contry) {
		this.contry = contry;
	}



	public void setNamme(String namme) {
		this.namme = namme;
	}



	public void setBudget(double budget) {
		this.budget = budget;
	}

	
	
}
