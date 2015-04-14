// bruk ord klassen om igjen, lag alle ord som objekter, putt i array.
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class Ordliste{
    private ArrayList<Ord> ordliste = new ArrayList<Ord>(); // lager en arraylist ved navn 'ordliste', som bare tar imot 'Ord'.

    void lesBok (String filnavn) throws Exception { // leser alle ordene i en fil og legger dem inn i ordlisten, krever at filen er organisert med ett ord pr linje.
	File minFil = new File(filnavn);
	Scanner minScanner = new Scanner(minFil);

	while (minScanner.hasNextLine()){
	    String line = minScanner.nextLine();
	    this.leggTilOrd(line);
	}
    }

    void leggTilOrd (String s) {
	/// legger inn s som ett nytt ord i ordlisten, hvis det ikke finnes fra for. Hvis ordet allerede er der, skal antall forekomster oekes med 1. Ikke case sensitiv.
	if ( this.finnOrd(s) == null ){
	    Ord ord = new Ord(s);
	    this.ordliste.add(ord);
	    //	    System.out.println(s+" lagt til i listen");
	}else{
	    Ord ord = this.finnOrd(s);
	    ord.oekAntall();
	    //	    System.out.println(s+" +1");
	}
    }

    Ord finnOrd (String s ) {
	// finner et gitt ord s i ordlisten, hvis ordet ikke finnes, faar vi null som svar. Ellers returnerer den en peker til objektet.
	if ( this.ordliste.isEmpty() ){
	    return null;	}

	for (int i = 0; i < this.antallOrd(); i++){
	    Ord peker = this.ordliste.get(i);
	    if ( peker.toString().equals(s) ){
		return peker;
	    }
	}
	return null;
    }

    int antallOrd() {
	// Forteller hvor mange ulike ord det finnes i ordlisten
	return this.ordliste.size();
    }

    int antallForekomster(String s) {
	// Finner ut hvor mange ganger ordet s forekommer i ordlisten.
	if (this.finnOrd(s) == null){
	    return 0;
	}else{
	    return this.finnOrd(s).hentAntall();
	}
    }

    Ord vanligste() {

	// Finner ett av de vanligste ordene i ordlisten.
	Ord vanligste = null;
	int x = 0;

	for (int i = 0; i < this.antallOrd(); i++){

	    if (this.ordliste.get(i).hentAntall()>x){
		vanligste = this.ordliste.get(i);
		x = vanligste.hentAntall();
	    }
	}
	return vanligste;
    }

    // frivillig - ikke sikker paa hvordan man loeser denne med Ord som output.

    /*
      Ord alleVanligste() {
      // finner alle de vanligste ordene i ordlisten.
      */
}
