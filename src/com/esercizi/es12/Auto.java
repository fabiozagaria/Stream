package com.esercizi.es12;

import java.time.LocalDate;

public class Auto {
	private String marca;
	private String modello;
	private LocalDate annoDate;
	
	public Auto(String marca, String modello, LocalDate anno) {
		setMarca(marca);
		setModello(modello);
		setAnnoDate(anno);
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if(marca == null) throw new IllegalArgumentException();
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		if(modello == null) throw new IllegalArgumentException();
		this.modello = modello;
	}
	public LocalDate getAnnoDate() {
		return annoDate;
	}
	public void setAnnoDate(LocalDate annoDate) {
		if(annoDate == null) throw new IllegalArgumentException();
		this.annoDate = annoDate;
	}
	
	@Override
	public String toString() {
		return String.format("""
				Auto: %s
				Modello: %s
				Anno: %s
				""", 
				getMarca(),
				getModello(),
				getAnnoDate());

	}
	
	

}
