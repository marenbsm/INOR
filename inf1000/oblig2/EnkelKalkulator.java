import java.util.Scanner;

public class EnkelKalkulator {

    // metoder

    public static void sum(int a, int b){
	System.out.println (a+" + "+b+" = " +(a+b));
    }

    public static void differanse(int a, int b){
	System.out.println (a+" - "+b+" = " +(a-b));
    }

    public static void produkt(int a, int b){
	System.out.println (a+" * "+b+" = " +(a*b));
    }

    // main

    public static void main (String[] args){
	Scanner tastatur = new Scanner (System.in);
	System.out.println ("Skriv inn to heltall 'a' og 'b'");
	System.out.print ("a : ");
	int a = Integer.parseInt(tastatur.nextLine());
	System.out.print ("b : ");
	int b = Integer.parseInt(tastatur.nextLine());
	sum(a,b);
	differanse(a,b);
	produkt(a,b);
    }
}
