//importerer Scanner
import java.util.Scanner; // science magic

public class HeiStudent {
    public static void main(String [] args ) {
	Scanner innleser;       // more science magic
	String navn;            // 
        String heltall1string;  // Deklarerer variablene vi har tenkt å bruke
	String heltall2string;  //
	int heltall1;           //
	int heltall2;           //
	innleser = new Scanner(System.in);
	// navn = "Erik";
	// heltall1 = 5;
	// heltall2 = 8;
 	System.out.println ("Hei Student!");   // bruker string navn ovenfra
	System.out.print ("Hva heter du? : "); // Sier hei og ber om navn til bruker. 
	navn = innleser.nextLine();            // bruker så navnet til en mer personlig
	System.out.println ("Hei " + navn);    // velkomst
	System.out.print ("Skriv inn ett tall er du snill : "); // Ber om ett tall 
	heltall1string = innleser.nextLine();                   // bruker skriver inn, lagres i heltall1string
	System.out.print ("Enda ett : ");      // enda ett tall
	heltall2string = innleser.nextLine();  // legger i heltall2string
	heltall1 = Integer.parseInt (heltall1string); // parser heltall stringene om
	heltall2 = Integer.parseInt (heltall2string); // til integer, lagrer i heltall1 og heltall 2
	System.out.println ("Summen av de to heltallene er : " + (heltall1 + heltall2)); // Legger sammen de to heltallene og printer til skjerm
	}
}