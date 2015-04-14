import java.util.Scanner;

public class Billettpris {
    public static void main (String [] args ) {
	Scanner innleser;   //
	String alderString;       // Scanner og variablene vi skal bruke
	int alderInt;       //
	int billettpris = 50; // billettpris
	innleser = new Scanner (System.in);

	System.out.print ("Hei, skriv inn kundens alder : ");
	alderString = innleser.nextLine(); // henter alder fra bruker ssom String
	alderInt = Integer.parseInt (alderString); // parser int fra alderString til alderInt
	System.out.println ("");
	System.out.print ("Kunden skal betale ");
	if (alderInt<12) // sjekker om alderInt er under 12.
	    {
	    System.out.print ((billettpris/2));
	}
	else if (alderInt>67) // sjekker om alderInt er over 67.
	    {
		System.out.print ((billettpris/2));
	    }
	else 
	    { 
		System.out.print ((billettpris));
	    }
	System.out.println (",- kroner for billetten.");
    }
}