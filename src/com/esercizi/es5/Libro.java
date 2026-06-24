package com.esercizi.es5;

public class Libro implements Comparable<Libro>{
	private String isbn;
	private String titolo;
	private int numeroPagine;
	
	public Libro(String isbn, String titolo, int numeroPagine) {
		setIsbn(isbn);
		setTitolo(titolo);
		setNumeroPagine(numeroPagine);
		
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getNumeroPagine() {
		return numeroPagine;
	}
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}
	
	public int compareTo(Libro altro) {
		return Integer.compare(this.getNumeroPagine(), altro.getNumeroPagine());
	}
	
	@Override
	public String toString() {
		return String.format("""
				Libro: %s
				Codice ISBN: %s
				Pagine Totali: %d
				""", getTitolo(),
				     getIsbn(),
				     getNumeroPagine());
	}
	
	

}
