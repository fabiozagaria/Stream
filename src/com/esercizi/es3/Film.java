package com.esercizi.es3;



public class Film {
	private String titolo;
	private String regista;
	private Integer durata;
	
	public Film(String titolo, String regista, Integer durata) {
		setTitolo(titolo);
		setRegista(regista);
		setDurata(durata);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public Integer getDurata() {
		return durata;
	}

	public void setDurata(Integer durata) {
		this.durata = durata;
	}
	
	@Override
    public String toString() {
		return String.format("""
				Film: %s
				Diretto da %s
				Durata: %s
				""", getTitolo(), getRegista(), getDurata());
	}
	
  
}
