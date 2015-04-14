import java.util.Scanner;



public class Metoder {
    public static void innleser(){
        Scanner tastatur = new Scanner(System.in);
        System.out.print ("Navn : ");
        String navn = tastatur.nextLine();
        System.out.print ("Bosted : ");
        String bosted = tastatur.nextLine();
        System.out.println ("Hei, du er " + navn + " fra " + bosted + ".");
    }
    public static void main (String[] args){
        /*
          Scanner tastatur = new Scanner(System.in);
          String navn = "ikke satt";
          String bosted = "ikke satt";
          System.out.print ("Navn : ");
          navn = tastatur.nextLine();
          System.out.print ("Bosted : ");
          bosted = tastatur.nextLine();
          System.out.println ("Hei, du er " + navn + " fra " + bosted + ".");
        */
	innleser();
	innleser();
	innleser();
    }
}
