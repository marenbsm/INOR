import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;

class DVDadministrasjon {
    private ArrayList<Person> dvdEiere = new ArrayList<Person>();
    String filnavn = "";

    public DVDadministrasjon(String fil) throws Exception{
	lastFraFil(fil);
	this.filnavn = fil;
    }

    public void nyPerson(String navn){
	if (!erPerson (navn) ){
	    Person a = new Person(navn);
	    this.dvdEiere.add(a);
	}
    }

    public boolean erPerson(String navn){
	for (int i = 0; i<dvdEiere.size(); i++){
	    Person p = dvdEiere.get(i);
	    if (navn.equalsIgnoreCase(p.toString() ) ){
		return true;
	    }
	}
	return false;
    }

    public Person hentPerson(String navn){
	if(erPerson(navn) ) {
	    for (int i = 0; i<dvdEiere.size(); i++){
		Person p = dvdEiere.get(i);
		if(navn.equalsIgnoreCase(p.toString() ) ){
		    return p;
		}
	    }
	}
	return null;
    }

    public void oversikt(){
	for (int i=0; i < this.dvdEiere.size(); i++) {
	    Person person = this.dvdEiere.get(i);
	    person.tellSamling();
	    int teller = 0;

	    for (int j=0; j < this.dvdEiere.size(); j++){
		Person laaner = this.dvdEiere.get(j);
		if (person != laaner){
		    int tall= laaner.sjekkLaaner(person);
		    teller = teller+tall;
		}
	    }
	    System.out.println("Har selv laant "+teller+" filmer.");
	}
    }
    public void laan(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Hvilken film gjelder dette? ");
	String tittel = sc.nextLine();
	System.out.print("Hvem laaner filmen? ");
	String laaner = sc.nextLine();
	System.out.print("Hvem eier filmen? ");
	String eier = sc.nextLine();

	if (erPerson(laaner) && erPerson(eier) ){
	    Person eieren = hentPerson(eier);
	    Person laaneren = hentPerson(laaner);
	    eieren.laanBortDVD(laaneren, tittel, 0);
	}
	else {
	    System.out.println("");
	    System.out.println("En eller flere av personene finnes ikke");
	}
    }

    public void retur(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Hvilken film blir returnert? ");
	String tittel = sc.nextLine();
	System.out.print("Hvem er det som returnerer? ");
	String laaner = sc.nextLine();
	System.out.print("Hvem eier filmen originalt? ");
	String eier = sc.nextLine();

	if (erPerson(laaner) && erPerson(eier) ){
	    Person eieren = hentPerson(eier);
	    Person laaneren = hentPerson(laaner);
	    if(eieren.leverDVD(tittel, laaneren) ){
		System.out.println("");
		System.out.println("Filmen er levert");
	    }
	    else{
		System.out.println("");
		System.out.println("Filmen ble ikke levert, sikker paa at det er riktig film?");
	    }
	}
	else{
	    System.out.println("");
	    System.out.println("En eller flere av personene finnes ikke.");
	}
    }
    public void kjoep(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Hva er tittelen paa filmen? ");
	String tittel = sc.nextLine();
	System.out.print("Hvem har kjoept filmen? ");
	String eier = sc.nextLine();

	if (erPerson(eier) ){
	    Person a = hentPerson(eier);
	    a.nyDVD(tittel);
	}
	else{
	    System.out.println("");
	    System.out.println("Personen finnes ikke");
	}
    }
    public void nyPerson(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Hva heter vedkommende? ");
	String navn = sc.nextLine();
	nyPerson(navn);
    }

    public void vis(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Hvem sin DVD samling onsker du aa se? (* for alle) ");
	String navn = sc.nextLine();
	System.out.println("");
	if(navn.equals("*")){
	    visAlle();
	}
	else if (erPerson(navn) ){
	    Person personen = hentPerson(navn);
	    personen.skrivUtSamling();
	}
	else {
	    System.out.println(navn+ " finnes ikke.");
	}
    }
    /*
      hele greia tryner om ikke siste linje i filen er whitespace.
    */
    public void lastFraFil(String filnavn) throws Exception {
	File fil = new File(filnavn);
	Scanner filScanner = new Scanner (fil);
	String linje = "";
	String forrigeLinje = "";
	Person eier = null;

	while (filScanner.hasNextLine() ){
	    forrigeLinje = linje;
	    linje = filScanner.nextLine();

	    // skipper tom linje
	    while (linje.trim().length()==0 && filScanner.hasNextLine()){
		forrigeLinje = linje.trim();
		linje = filScanner.nextLine();
	    }

	    // om forrige linje var tom er denne linjen navnet paa en person
	    if (forrigeLinje.length()==0 ){
		if(!(linje.trim().length()==0)){
		nyPerson(linje);
		eier = hentPerson(linje);
		}
	    }
	    /*
	      sjekker forrige linje for *, hvis true, lager en nyperson(laaneren), skaper filmen og soerger for at filmen blir laant bort til laaneren.
	    */
	    else if (forrigeLinje.startsWith("*") ){
		forrigeLinje=forrigeLinje.substring(1);
		nyPerson(linje);
		eier.laanBortDVD(hentPerson(linje),forrigeLinje, 1);

	    }
	    // lager ny dvd med navn uten *
	    else{
		if (linje.startsWith("*") ){
		    eier.nyDVD(linje.substring(1) );
		}
		else{
		    eier.nyDVD(linje);
		}
	    }

	}
    }
    /*
      Fant ett eksempel paa nett
      http://www.programcreek.com/2011/03/java-write-to-a-file-code-example/
    */

    public void visAlle(){
	for (int i = 0; i < this.dvdEiere.size(); i++) {
	    Person person = this.dvdEiere.get(i);
	    System.out.println(person.toString());
	    int samling = person.antallDVD();
	    for(int j = 0; j < samling; j++){
		DVD a = person.nummerDVD(j);
		if (person == a.hentBesittelse()){
		    System.out.println(a.toString());
		}
		else{
		    System.out.print(a.toString());
		    System.out.println(" - laant av : "+a.hentBesittelse().toString());
		}
	    }
	    System.out.println("");
	}
    }

    public int avslutt() throws Exception{
	PrintWriter pw = new PrintWriter (filnavn);

	for (int i = 0; i < this.dvdEiere.size(); i++) {
	    Person person = this.dvdEiere.get(i);
	    pw.println(person.toString() );
	    int samling = person.antallDVD();
	    for(int j = 0; j < samling; j++){
		DVD a = person.nummerDVD(j);
		if (person == a.hentBesittelse() ){
		    pw.println(a.toString() );
		}
		else{
		    pw.println("*"+a.toString() );
		    pw.println(a.hentBesittelse().toString() );
		}
	    }
	    pw.println("");
	}
	pw.close();
	return 0;
    }
    public void kjoer() throws Exception{
	int i = 1;
	while (i == 1){

	    printMeny();
	    Scanner sc = new Scanner(System.in);
	    String valg = sc.nextLine();
	    System.out.println("");

	    // A for avslutt
	    if (valg.equalsIgnoreCase("a")){
		i = avslutt();
	    }

	    //  K for kjoep
	    if (valg.equalsIgnoreCase("k")){
		kjoep();
	    }

	    // L for Laan
	    if (valg.equalsIgnoreCase("l")){
		laan();
	    }

	    // N for ny person
	    if (valg.equalsIgnoreCase("n")){
		nyPerson();
	    }

	    // O for oversikt
	    if (valg.equalsIgnoreCase("o")){
		oversikt();
	    }

	    // R for retur
	    if (valg.equalsIgnoreCase("r")){
		retur();
	    }
	    // V for vis
	    if (valg.equalsIgnoreCase("v")){
		vis();
	    }
	}
    }

    private  void printMeny() {
	System.out.println("");
	System.out.println("DVD - Administrasjon");
	System.out.println("");
	System.out.println("A : Avslutt");
	System.out.println("K : Kjoep");
	System.out.println("L : Laan");
	System.out.println("N : Ny person");
	System.out.println("O : Oversikt");
	System.out.println("R : Retur");
	System.out.println("V : Vis");
	System.out.println("");
	System.out.print("Skriv inn valg : ");
    }
}
