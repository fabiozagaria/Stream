package com.esercizi.es8;

public class Citta {
	private String nome;
	private int abitanti;
	
	public Citta(String nome, int abitanti) {
		setNome(nome);
		setAbitanti(abitanti);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null) throw new IllegalArgumentException();
		this.nome = nome;
	}

	public int getAbitanti() {
		return abitanti;
	}

	public void setAbitanti(int abitanti) {
		if(abitanti == 0) this.abitanti = 1;
		this.abitanti = abitanti;
	}
	
	@Override
	public String toString() {
		return String.format("""
				Nome Citta: %s
				Abitanti: %d
				""", getNome(),
				     getAbitanti());
	}
	
	

}
