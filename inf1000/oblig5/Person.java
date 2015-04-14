class Person {
    private String navn;
    private int alder;
    private String bosted;

    // metoder for aa fylle variablene med data

    void settNavn(String n){
	navn = n ;
    }

    void settAlder(String a){
	alder = Integer.parseInt(a) ;
    }

    void settBosted(String b){
	bosted = b ;
    }

    // metoder for aa hente data fra variablene

    String printNavn(){
	return navn;
    }

    int printAlder(){
	return alder;
    }

    String printBosted(){
	return bosted;
    }
}

