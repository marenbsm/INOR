class Ordtest{
    public static void main(String[] args) throws Exception {
        /*
          Ord o = new Ord ("utmark");
          System.out.println(o.toString());
          o.oekAntall();
          System.out.println(o.hentAntall());
        */

        Ordliste bok = new Ordliste();
	System.out.println("Det er "+bok.antallOrd()+" forskjellige ord i boken");
        bok.lesBok("test.txt");
	System.out.println("Det er "+bok.antallOrd()+" forskjellige ord i boken");
	System.out.println("Ordet "+bok.finnOrd("fire")+" forekommer "+bok.antallForekomster("fire")+" ganger i teksten");
	System.out.println("Ordet '"+bok.vanligste().toString()+"' er ett av de vanligste ordene med "+bok.vanligste().hentAntall()+" forekomster.");
    }
}
