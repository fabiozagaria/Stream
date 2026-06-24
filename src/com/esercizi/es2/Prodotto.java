package com.esercizi.es2;



public class Prodotto {
	private String codice;
	private String descrizione;
	private double prezzo;
	private final static String REGEX_CODICE = "^P\\d{3}$";
	
	public Prodotto(String codice, String desc, double prezzo) {
		setCodice(codice);
		setDescrizione(desc);
		setPrezzo(prezzo);
		
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		
		if(!codice.matches(REGEX_CODICE)) throw new IllegalArgumentException("Codice non valido");
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return String.format("""
				Prodotto con codice: %s
				Descrizione: %s
				Prezzo: %.2f euro
				""", getCodice(), getDescrizione(), getPrezzo());
	}
	

	
}
