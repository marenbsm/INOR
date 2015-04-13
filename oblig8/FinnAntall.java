import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;

class FinnAntall {
    public static void main (String[] args) {
	FinnAntall f = new FinnAntall();
	if (!(args.length == 3)){
	    System.out.println("Prøv: 'søkeord' 'filnavn' '#tråder'");
	    return;
	}
	if(args[2].equalsIgnoreCase("0"))return;
	String[] liste;
	try {
	    liste = f.les(args[1]);
	}
	catch (FileNotFoundException e){
	    System.out.println("Filen '"+args[1]+"' finnes ikke.");
	    return;
	}

	int antall = f.sok(args[0], liste, Integer.parseInt(args[2]));
	System.out.println("Det var "+antall+" forekomst(er) av ordet '"+args[0]+"' i '"+args[1]+"'.");
    }

    public String[] les (String filnavn)throws FileNotFoundException {
	Scanner sc = new Scanner (new File(filnavn));
	int size = Integer.parseInt(sc.nextLine());
	String[] ordliste = new String[size];
	for (int i = 0; i < size; i++) {
	    ordliste[i] = sc.nextLine();
	}
	return ordliste;
    }
    public int sok (String sokeord, String[] liste, int antallTraader) {
	Thread[] traader = new Thread[antallTraader];
	int blokk = liste.length / antallTraader;
	SyncTeller teller = new SyncTeller ();
	for (int i = 0; i < antallTraader; i++) {
	    int start = (i)*blokk;
	    int slutt = ((i+1)==antallTraader) ? liste.length : (i+1)*blokk;
	    traader[i] = new Thread(new MinTraad(sokeord, Arrays.copyOfRange(liste, start, slutt), teller));
	}
	for (Thread t: traader) t.start();
	for (Thread t: traader) {
	    try {
		t.join();
	    }
	    catch (InterruptedException e){
		System.out.println ("Forstyrret!");
	    }
	}
	return teller.verdi();
    }
}
