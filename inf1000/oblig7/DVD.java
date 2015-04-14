class DVD{
    private String tittel;
    private Person eier;
    private Person besittelse; // hvem har DVD atm.


    // constructor
    public DVD (String tittel, Person eier){
	this.tittel = tittel;
	this.eier = eier;
	this.besittelse = this.eier;
    }
    
    public String toString() { // <<-- bedre? :)
	return this.tittel;
    }

    public Person hentEier() {
	return this.eier;
    }

    public Person hentBesittelse() {
	return this.besittelse;
    }

    // endrer DVD eier
    public void endreEier(Person nyEier){
	this.eier = nyEier;
    }

    // endrer DVD lokasjon
    public void endreBesittelse(Person nyBesittelse){
	this.besittelse = nyBesittelse;
    }
}
