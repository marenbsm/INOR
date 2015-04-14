import java.util.Scanner;
import java.util.Arrays;

public class FirstArray {

    public static void main (String [] args){
        // a)
        //       int [] minArray = {0,1,2,3};
	// b)
        int [] minArray= new int[4];

        for (int teller=0; teller < minArray.length; teller+=1){
            minArray[teller]+=teller;
            //      System.out.println(minArray[teller]);
        }
        // c)
        minArray[0] = 1337;
        minArray[3] = 1337;

	// d)
	Scanner tastatur = new Scanner (System.in);
        String [] textArray = new String[5];
	for (int teller=0; teller < textArray.length; teller+=1){
	    System.out.print ("Skriv inn ett navn : ");
	    textArray[teller]=tastatur.nextLine();
    }

    }
}
