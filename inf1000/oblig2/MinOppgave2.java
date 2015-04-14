import java.util.Scanner;

public class MinOppgave2 {

    // metoder

    static void sum(int a, int b){
	System.out.println ("     "+a+" + "+b+" = " +(a+b));
    }

    static void differanse(int a, int b){
	System.out.println ("     "+a+" - "+b+" = " +(a-b));
    }

    static void produkt(int a, int b){
	System.out.println ("     "+a+" * "+b+" = " +(a*b));
    }
    static void meny(){
	System.out.println ("");
	System.out.println ("1 : Sum");
	System.out.println ("2 : Differanse");
	System.out.println ("3 : Produkt");
	System.out.println ("");
	System.out.println ("4 : Nye tall for 'a' og 'b'");
	System.out.println ("* : Avslutt");
    }
    // main

    public static void main (String[] args){
	Scanner tastatur = new Scanner (System.in);
	String menyvalg = "4";
	int a = 0;
	int b = 0;

	while (menyvalg.equals("1") || menyvalg.equals("2") || menyvalg.equals("3") || menyvalg.equals("4") || menyvalg.equals ("yolo")){

	    if (menyvalg.equals("1")) {
		sum (a,b);
		menyvalg = "yolo";
	    }

	    if (menyvalg.equals("2")) {
		differanse(a,b);
		menyvalg = "yolo";
	    }

	    if (menyvalg.equals("3")) {
		produkt(a,b);
		menyvalg = "yolo";
	    }

	    if (menyvalg.equals("4")) {
		System.out.println ("");
		System.out.println ("Skriv inn to heltall 'a' og 'b'");
		System.out.print ("'a' = ");
		a = Integer.parseInt(tastatur.nextLine());
		System.out.print ("'b' = ");
		b = Integer.parseInt(tastatur.nextLine());
		menyvalg="yolo";
	    }
	    else {
		meny();
		menyvalg = tastatur.nextLine();
	}
    }

}
}
