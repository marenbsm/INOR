import java.util.Scanner; // henter inn Scanner

public class MinOppgave1 {
    public static void main (String [] args) {
	// klargjør Scanner og deklarerer variablene vi skal bruke.
	Scanner innleser = new Scanner (System.in);
	String karakter;
	String bkarakter;
	String igjen="j";

	// Skal konvertere en tallkarakter til en bokstav karakter, med mulighet til å gjenta operasjonen.
	System.out.println ("\nHei, velkommen til 'not-a-quiz-tall-til-bokstav-karakter-konvertereren'\n");
	while (igjen.equals("j")||igjen.equals("J")) {
	    System.out.print ("Skriv inn en tall karakter 0-6 : ");
	    karakter = (innleser.nextLine());
	    if (karakter.equals("6")) {
		    bkarakter= "A";
		}
		else if (karakter.equals("5")) {
			bkarakter="B";
		}
		else if (karakter.equals("4")){
			    bkarakter="C";
		}
		else if (karakter.equals("3")){
				bkarakter="D";
		}
		else if (karakter.equals("2")){
					bkarakter="E";
		}
		else if (karakter.equals("1")||karakter.equals("0")){
						bkarakter="F";
		}
		else {
		    bkarakter="Feil input";
		}
		System.out.println ("\n"+ bkarakter);
		System.out.print ("\nKonvertere igjen? j/- : ");
		igjen = (innleser.nextLine());
		System.out.println("");
		
	}
    }
}