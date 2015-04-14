import java.util.Arrays;

public class NegativeTall {

    public static void main (String [] args){

	// Oppgave a)
	int [] a = {1, 4, 5, -2, -4, 6, 10, 3, -2};
	String aString = Arrays.toString(a);
	System.out.println("Vi skal jobbe litt med array 'a' " +aString+ ".");
	int forTeller=0;
	for (int t=0; t < a.length; t+=1){
	    if (a[t]<0){
		forTeller+=1;
	    }

	}
	System.out.println("Ved bruk av en 'for'-lokke, finner vi at array 'a' inneholder "+forTeller+" negative tall.");

	// Oppgave b)
	int whileTeller=0;
	int whileT=0;
	while (whileT < a.length){
	    if (a[whileT] < 0) {
		whileTeller+=1;
	    }
	    whileT+=1;
	}
	System.out.println("Ved bruk av en 'while'-lokke, finner vi at array 'a' inneholder "+whileTeller+ " negative tall.");

	// Oppgave c)

	System.out.println("Naa erstatter vi alle negative tall i arrayen med posisjonen de har i arrayen, forste posisjon er 0,");

	for (int t=0; t < a.length; t+=1){
	    if (a[t]<0){
		a[t] = t;
	    }
	}
	aString = Arrays.toString(a);
	System.out.println(" vaar nye array 'a' blir da seende slik ut : "+aString);
    }
}
