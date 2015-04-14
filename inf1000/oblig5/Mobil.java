class Mobil {
    private String merke;
    private String eier;
    private String telefonnummer;

    // metoder for aa fylle variablene med data

    void settMerke(String m){
	merke = m;
    }

    void settEier(String e){
	eier = e;
    }

    void settTelefonnummer(String t){
	telefonnummer = t;
    }

    // metoder for aa lese data fra variablene

    String printMerke(){
	return merke;
    }

    String printEier(){
	return eier;
    }

    String printTelefonnummer(){
	return telefonnummer;
    }
}
