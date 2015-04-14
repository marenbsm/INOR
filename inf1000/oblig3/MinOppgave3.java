import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/*
Lager en brukerdefinert tallinje fra 0 til x, 
stokker om paa rekkefoelgen, 
lager en kopi og sorterer den tilbake igjen
 */ 

public class MinOppgave3 {
    public static void main (String [] args){
        Scanner tastatur = new Scanner (System.in);
        Random randomGenerator = new Random ();

        // lager en array som inneholder en talllinje med tall fra 0 til x.
        int lengdeTallLinje =1+(Integer.parseInt(tastatur.nextLine()));
        int [] tallLinje = new int[lengdeTallLinje];
        for (int i = 0; i < tallLinje.length; i+=1){
            tallLinje[i] = i;
            //   System.out.println(tallLinje[i]); // test
        }
        // stokker om paa rekkefolgen i arrayet.
        for (int i = 0; i <100000; i+=1){
            int randomInt1 = 0; //randomGenerator.nextInt(lengdeTallLinje);
            int randomInt2 = 0; //randomGenerator.nextInt(lengdeTallLinje);
            while (randomInt1 == randomInt2){
                randomInt1 = randomGenerator.nextInt(lengdeTallLinje);
                randomInt2 = randomGenerator.nextInt(lengdeTallLinje);
            }
            int tempint = tallLinje[randomInt1];
            tallLinje[randomInt1] = tallLinje[randomInt2];
            tallLinje[randomInt2] = tempint;
        }
        /* fra boken
           for (int i = 0; i <tallLinje.length; i++){
           if (i>0);{
           System.out.print(" | ");
           }
           System.out.print(tallLinje[i]);
           }
        */
        int [] sortertTallLinje = new int[lengdeTallLinje];

        for (int i = 0; i<tallLinje.length; i++){
            sortertTallLinje[i]=tallLinje[i];
        }
        Arrays.sort(sortertTallLinje);
        System.out.println("Usortert : "+Arrays.toString(tallLinje));
        System.out.println("Sortert  : "+Arrays.toString(sortertTallLinje));
    }
}
