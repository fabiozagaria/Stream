package com.esercizi.es1;

public class Studente {
	private String matricola;
	private String nome;
	private double media;
	
	public Studente(String mat, String n, double media) {
		setMatricola(mat);
		setNome(n);
		setMedia(media);
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		if(media < 18 || media > 30) throw new IllegalArgumentException("Media errata!!");
		this.media = media;
	}
	
	@Override
	public String toString() {
		return String.format("""
				[Studente]
				Nome: %s
				Matricola: %s
				Media: %.2f 
				""", getNome(), getMatricola(), getMedia());

	}
	
	
	
	

}
