package com.esercizi.es11;

public class Atleta {
	private String nome;
	private int punteggio;
	
	public Atleta(String nome, int punteggio) {
		setNome(nome);
		setPunteggio(punteggio);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null) throw new IllegalArgumentException();
		this.nome = nome;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggio) {
		if(punteggio < 0) this.punteggio = 0;
		this.punteggio = punteggio;
	}
	
	@Override
	public String toString() {
		return String.format("""
				Nome Atleta: %s
				Punteggio: %d
				""", 
				getNome(),
				getPunteggio());
	}
	
	

}
