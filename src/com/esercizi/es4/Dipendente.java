package com.esercizi.es4;

public class Dipendente  {
	private String matricola;
    private String nome;
    private double stipendio;
    
    public Dipendente(String matricola, String nome, double stipendio) {
    	    setMatricola(matricola);
    	    setNome(nome);
    	    setStipendio(stipendio);
    	
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

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		if(stipendio <= 0) throw new IllegalArgumentException();
		this.stipendio = stipendio;
	}
	
	
	

	@Override
	public String toString() {
		return String.format("""
				Dipendente con matricola: %s
				Nome: %s
				Stipendio Netto: %.2f euro
				""", getMatricola(), getNome(), getStipendio());
	}
	
	
    
    
}
