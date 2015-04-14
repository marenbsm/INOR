//
import java.util.Scanner;
//
public class LikeVerdier {
    public static void main (String [] args) {
	int c=1;
	int d=2;
	//
	Scanner innleser = new Scanner (System.in);
	System.out.print ("Skriv inn en verdi 'c' : ");
	// prøver å "neste" innleser inn i Integer.parseInt
	c = Integer.parseInt (innleser.nextLine());
	System.out.print ("Skriv inn en verdi 'd' : ");
	d = Integer.parseInt (innleser.nextLine());
	// enkel if else som sjekker om c=d.
	if (c == d){
	    System.out.println ("c og d er like");
	}
	else{
	    System.out.println("c er ikke lik d");
	}
    }
}
