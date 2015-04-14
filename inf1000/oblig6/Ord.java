class Ord {
    private String ord;
    private int antall;


    // konstruktor . kjorer en gang ved opprettelse av objekt.
    Ord (String o) {
        // System.out.println ("this.ord = o");
        // System.out.println ("this.antall = 1 ;");
        this.ord = o ;
        this.antall = 1;
        // oppretter et Ord-objekt av den gitte teksten.
        // eks
        // new Ord("utmark")

    }

    public String toString () {
        // System.out.println ("return this.ord;");
        // returnerer ordet.
        // eks
        // new Ord("skog").toString() gir "skog".
        return this.ord;
    }

    int hentAntall() {
        // System.out.println ("return this.antall;");
        // henter data om hvor mange ganger ordet forekoomer.
        // eks
        // Ord o = new Ord("grantre");
        // o.hentAntall(); gir 1.
        return this.antall;
    }

    void oekAntall() {
        // System.out.println ("this.antall++;");
        this.antall++;
        // registrerer at ordet har forekommet en gang til.
        // eks
        // Ord o = new Ord("bjerk");
        // o.oekAntall();
        // o.hentAntall(); gir 2.

    }
}
