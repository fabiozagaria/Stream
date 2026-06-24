package com.esercizi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.esercizi.es1.*;
import com.esercizi.es11.Atleta;
import com.esercizi.es12.Auto;
import com.esercizi.es2.Prodotto;
import com.esercizi.es3.Film;
import com.esercizi.es4.Dipendente;
import com.esercizi.es5.Libro;
import com.esercizi.es8.Citta;



public class Main {

	public static void main(String[] args) {
		List<Studente> list = new ArrayList<>();
		double sommaMedia = 0;
		
		list.add(new Studente("S001", "Marco", 27.5));
		list.add(new Studente("S002", "Luca", 22.0));
		list.add(new Studente("S003", "Anna", 29.0));
		list.add(new Studente("S004", "Giulia", 24.5));
		list.add(new Studente("S005", "Francesco", 30.0));
		list.add(new Studente("S006", "Sara", 26.0));
		list.add(new Studente("S007", "Davide", 21.5));
		list.add(new Studente("S008", "Elena", 28.0));
		list.add(new Studente("S009", "Matteo", 23.0));
		list.add(new Studente("S010", "Martina", 25.5));
		
		for (Studente studente : list) {
			if (studente.getMedia() > 24) {
				System.out.println(studente);
			}
			
			sommaMedia += studente.getMedia();
			System.out.printf("""
					Studente: %s
					Somma Media: %.2f
					""", studente, sommaMedia);
		}
		
		double mediaTuttiStudenti = sommaMedia/list.size();
		System.out.printf("""
				Media Tutti Studenti: %.2f 
				""", mediaTuttiStudenti);
		
		//-------------------------------------------------------------
		
		System.out.println("ES2");

		List<Prodotto> listProdotti = new ArrayList<>();
		
		listProdotti.add(new Prodotto("P001", "Mouse Wireless Logitech", 24.90));
		listProdotti.add(new Prodotto("P002", "Tastiera Meccanica RGB", 79.99));
		listProdotti.add(new Prodotto("P003", "Monitor 27\" Full HD", 189.90));
		listProdotti.add(new Prodotto("P004", "SSD NVMe 1TB", 94.50));
		listProdotti.add(new Prodotto("P005", "Cuffie Bluetooth Sony", 129.99));
		listProdotti.add(new Prodotto("P006", "Webcam Full HD", 49.90));
		listProdotti.add(new Prodotto("P007", "Hub USB-C 7 porte", 34.90));
		listProdotti.add(new Prodotto("P008", "Notebook ASUS VivoBook", 749.00));
		listProdotti.add(new Prodotto("P009", "Power Bank 20000mAh", 39.99));
		listProdotti.add(new Prodotto("P010", "Stampante Laser HP", 159.90));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un prodotto da cercare nella lista: \n");
		String inputString = scanner.nextLine();
		
		
		
		boolean trovato = false;
		
		for (Prodotto prodotto : listProdotti) {
			if(prodotto.getDescrizione().toLowerCase().contains(inputString.trim())) {
				System.out.println(prodotto);
				trovato = true;
				
			} 
		}
		if (!trovato) {
			System.out.println("Prodotto non trovato!");
		}
		
	    //-----------------------------------------------------
		System.out.println("ES3");
		
		List<Film> listFilm = new ArrayList<>();
		List<Film> listFilmLunghi = new ArrayList<>(); 
		
		listFilm.add(new Film("Il Signore degli Anelli - La Compagnia dell'Anello", "Peter Jackson", 178));
		listFilm.add(new Film("Interstellar", "Christopher Nolan", 169));
		listFilm.add(new Film("Shrek", "Andrew Adamson", 90));
		listFilm.add(new Film("Il Cavaliere Oscuro", "Christopher Nolan", 152));
		listFilm.add(new Film("Toy Story", "John Lasseter", 81));
		
		for (Film film : listFilm) {
			if(film.getDurata() > 120) {
				listFilmLunghi.add(film);
			}
		}
		
		System.out.println(listFilmLunghi);
		
		//---------------------------------------------------------------
		
		System.out.println("ES4");
		
		List<Dipendente> listDipendenti = new ArrayList<>();
		
		listDipendenti.add(new Dipendente("D001", "Marco", 1800));
		listDipendenti.add(new Dipendente("D002", "Anna", 2300));
		listDipendenti.add(new Dipendente("D003", "Luca", 1600));
		listDipendenti.add(new Dipendente("D004", "Giulia", 2800));
		listDipendenti.add(new Dipendente("D005", "Francesco", 2000));
		
		
		listDipendenti.sort(Comparator.comparing(Dipendente::getStipendio));
		
		System.out.println(listDipendenti);
		
		//---------------------------------------------------------------
		
		System.out.println("ES5");
		
		List<Libro> listLibri = new ArrayList<>();
		
		
		listLibri.add(new Libro("9788804668237", "Il Signore degli Anelli", 1178));
		listLibri.add(new Libro("9788807881558", "Harry Potter e la Pietra Filosofale", 304));
		listLibri.add(new Libro("9788806229641", "1984", 328));
		listLibri.add(new Libro("9788807901256", "Il Piccolo Principe", 96));
		listLibri.add(new Libro("9788806218256", "Dune", 736));
		
		listLibri.sort(null);
		System.out.println(listLibri);
		
		//-----------------------------------------------------------------
		
		System.out.println("ES6");
		
		Map<String, Integer> assenze = new HashMap<>();
		
		assenze.put("Marco", 3);
		assenze.put("Anna", 7);
		assenze.put("Luca", 1);
		assenze.put("Giulia", 5);
		assenze.put("Francesco", 9);
		assenze.put("Sara", 2);
		
		int massimeAssenze = 0;
		String nomeStudente = null;
		
		for(Map.Entry<String, Integer> entry : assenze.entrySet()) {
			if(massimeAssenze < entry.getValue()) {
			    massimeAssenze = entry.getValue();
			    nomeStudente = entry.getKey();
			}
			
		}
		
		System.out.printf("""
				Assenze Maggiori: %d
				Sono di %s
				""",
				massimeAssenze,
				nomeStudente);
		
		//------------------------------------------------------------
		
		System.out.println("ES7");
		
		Map<String, Integer> conteggioParole = new HashMap<String, Integer>();
		
	
		boolean run = true;
		
		
		while(run) {
			System.out.println("Inserisci la parola!:\n");
			String input2 = scanner.nextLine();
			
			if (input2.equalsIgnoreCase("stop")) {
				run = false;
				continue;
			}
			
			if(conteggioParole.containsKey(input2)) {
				conteggioParole.put(input2, conteggioParole.get(input2) + 1);
				
			} else {
			   conteggioParole.put(input2, 1);
			}
			
			
		}
		scanner.close();
		for (Map.Entry<String, Integer> entry : conteggioParole.entrySet()) {
			if(entry.getValue() >= 3) {
				System.out.println("Parola: "+ entry.getKey() + "\nFrequenza: " + entry.getValue());
			}
			
		}
		
		//----------------------------------------------------------------------
		
		System.out.println("ES8");
		
		List<Citta> listCitta = new ArrayList<>();
		
		listCitta.add(new Citta("Roma", 2748000));
		listCitta.add(new Citta("Milano", 1378000));
		listCitta.add(new Citta("Napoli", 909000));
		listCitta.add(new Citta("Torino", 846000));
		listCitta.add(new Citta("Palermo", 630000));
		listCitta.add(new Citta("Bologna", 392000));
		listCitta.add(new Citta("Viterbo", 67000));
		listCitta.add(new Citta("Frosinone", 45000));
		listCitta.add(new Citta("Tivoli", 56000));
		listCitta.add(new Citta("Anzio", 57000));
		
		List<Citta> listCittaGrandi = listCitta.stream()
				.filter(citta -> citta.getAbitanti() >= 100000)
				.collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(listCittaGrandi);
		
		
		//---------------------------------------------------------------------
		
		System.out.println("ES9");
		
		ArrayList<Studente> listStudenti = new ArrayList<>();

		listStudenti.add(new Studente("S001", "Marco", 24));
		listStudenti.add(new Studente("S002", "Luca", 27));
		listStudenti.add(new Studente("S003", "Anna", 29));
		listStudenti.add(new Studente("S004", "Giulia", 22));
		listStudenti.add(new Studente("S005", "Francesco", 30));
		listStudenti.add(new Studente("S006", "Sara", 25));
		listStudenti.add(new Studente("S007", "Davide", 28));
		listStudenti.add(new Studente("S008", "Elena", 26));
		listStudenti.add(new Studente("S009", "Matteo", 23));
		listStudenti.add(new Studente("S010", "Martina", 27));
		
		boolean votoMassimo = listStudenti.stream()
				.anyMatch(studente -> studente.getMedia() == 30 );
		if(votoMassimo) {
			System.out.println("Ci sono studenti con 30");
		} else {
			System.out.println("Non ci sono studenti con 30");
		}
		
		//--------------------------------------------------------------
		
		System.out.println("ES10");
		
		List<String> listProdottiCostosi = listProdotti.stream()
		.filter(prodotto -> prodotto.getPrezzo() > 50)
		.map(Prodotto::getDescrizione)
		.collect(Collectors.toCollection(ArrayList::new));
		
		//--------------------------------------------------------------------
		
		System.out.println("ES11");
		
		List<Atleta> listAtleti = new ArrayList<>();

		listAtleti.add(new Atleta("Marco", 85));
		listAtleti.add(new Atleta("Luca", 92));
		listAtleti.add(new Atleta("Anna", 78));
		listAtleti.add(new Atleta("Giulia", 95));
		listAtleti.add(new Atleta("Francesco", 88));
		listAtleti.add(new Atleta("Sara", 91));
		listAtleti.add(new Atleta("Davide", 84));
		listAtleti.add(new Atleta("Elena", 97));
		listAtleti.add(new Atleta("Matteo", 89));
		listAtleti.add(new Atleta("Martina", 93));
		
		Optional<Atleta> miglioreAtleta = listAtleti.stream()
				.max(Comparator.comparing(Atleta::getPunteggio));
		miglioreAtleta.ifPresent(System.out::println);
		
		//--------------------------------------------------------------
		
		System.out.println("ES12");
		
		List<Auto> listAuto = new ArrayList<>();

		listAuto.add(new Auto("Fiat", "Panda", LocalDate.of(2018, 1, 1)));
		listAuto.add(new Auto("Volkswagen", "Golf", LocalDate.of(2021, 1, 1)));
		listAuto.add(new Auto("BMW", "Serie 3", LocalDate.of(2020, 1, 1)));
		listAuto.add(new Auto("Audi", "A4", LocalDate.of(2019, 1, 1)));
		listAuto.add(new Auto("Mercedes", "Classe A", LocalDate.of(2022, 1, 1)));
		listAuto.add(new Auto("Toyota", "Yaris", LocalDate.of(2017, 1, 1)));
		listAuto.add(new Auto("Ford", "Focus", LocalDate.of(2016, 1, 1)));
		listAuto.add(new Auto("Hyundai", "i20", LocalDate.of(2023, 1, 1)));
		listAuto.add(new Auto("Kia", "Sportage", LocalDate.of(2024, 1, 1)));
		listAuto.add(new Auto("Peugeot", "208", LocalDate.of(2015, 1, 1)));
		
		List<Auto> listAutoDecrescente = listAuto.stream()
				.sorted(Comparator.comparing(Auto::getAnnoDate).reversed())
				.collect(Collectors.toCollection(ArrayList::new));
		
		listAutoDecrescente.stream()
		.forEach(System.out::println);
	}

}
