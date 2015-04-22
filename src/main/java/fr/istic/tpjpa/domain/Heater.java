package fr.istic.tpjpa.domain;

import javax.persistence.Entity;

@Entity
public class Heater extends Device {

	private int power;
	
	//private int temperatureMin;
	
	//private int temperatureMax;
	
	public Heater() {
		
	}
	
	public Heater(String name, int power) {
		super(name);
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
}
