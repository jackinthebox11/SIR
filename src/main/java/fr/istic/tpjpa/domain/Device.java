package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {
	
	private long id;
	
	protected String nom;
	
	public Device() {
		
	}
	
	public Device(String name){
		nom = name;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return nom;
	}
	
	public void setName(String name) {
		this.nom = name;
	}
}
