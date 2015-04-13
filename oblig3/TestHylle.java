public class TestHylle{
    public static void main (String[]args){
	Hylle<Bok> bokhylle = new Hylle<Bok>(100);
	sjekk("bokhylle storrelse",bokhylle.storrelse(), 100);
	Bok testBok = new Bok("Min forste bok", "Erik");
	sjekk ("ny bok paa plass 0", bokhylle.settInn(testBok,0), true);
	sjekk ("om plass O er opptatt", bokhylle.ledig(0), false);
	sjekk ("fjerner boken fra plass 0", bokhylle.taUt(0), testBok);
	sjekk ("om plass O er ledig", bokhylle.ledig(0), true);
	sjekk ("ny bok paa plass 100", bokhylle.settInn(testBok,100), false);
	sjekk ("ny bok paa plass -1", bokhylle.settInn(testBok,-1), false);

    }

    // generisk type for enkel sammenligning.
    private static <T> void sjekk(String hva,T verdi, T fasit){
	System.out.print("Tester "+hva+". ");
	if (verdi == fasit){
	    System.out.println("OK!");
	}
	else{
	    System.out.println("FEIL!");
	}
    }
}
