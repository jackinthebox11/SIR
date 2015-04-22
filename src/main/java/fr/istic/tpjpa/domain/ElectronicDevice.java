package fr.istic.tpjpa.domain;

import javax.persistence.Entity;

@Entity
public class ElectronicDevice extends Device {

	private int consommationMoyenne;
	
	public ElectronicDevice() {
		super();
	}
	
	public ElectronicDevice(int consoMoyenne) {
		super();
		this.consommationMoyenne = consoMoyenne;
	}
	
	public int getConsoMoyenne() {
		return consommationMoyenne;
	}
	
	public void setConsoMoyenne(int consoMoyenne) {
		this.consommationMoyenne = consoMoyenne;
	}
}
