class Oblig6{
    public static void main(String[] args) throws Exception {

        Ordliste bok = new Ordliste();
	String txt = "scarlet.text";

	bok.lesBok(txt);

	int a = bok.antallOrd();
	int b = bok.antallForekomster("Holmes");
	int c = bok.antallForekomster("elementary");
	String d = bok.vanligste().toString();


	System.out.println ("Tekst som behandles : "+txt);
	System.out.println ("a) Antall unike ord : "+a);
	System.out.println ("b) Forekomster av ordet 'Holmes' : "+b);
	System.out.println ("c) Forekomster av ordet 'elementary' : "+c);
	System.out.println ("d) Vanligste ord i teksten : "+d+" ("+bok.vanligste().hentAntall()+")");

 }
}
