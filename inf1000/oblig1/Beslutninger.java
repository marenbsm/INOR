//importerer scanner
import java.util.Scanner; // science magic

public class Beslutninger {
    public static void main (String [] args) {
	int alder ; // deklarerer variabler vi trenger
	alder = 23; // setter alder til 23
	Scanner in = new Scanner(System.in); // science magic
	String alderstring; // enda en variabel, den siste vi trenger
	System.out.print ("Hvor gammel er du? : "); // Ber om alder fra bruker
	alderstring = in.nextLine();                // lagrer den i alderstring
	alder = Integer.parseInt (alderstring);      // parser alderstring til en integer og lagrer resultatet i  int alder.
	if (alder<18) {
	    System.out.println ("Du er ikke myndig");
	}else{
	    System.out.println ("Du er myndig");
	};
    }
}