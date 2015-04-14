import java.util.Scanner;

class Meny {

    void kjoer(){
        int i = 1;
        while (i == 1){

            printMeny();
            Scanner sc = new Scanner(System.in);
            String valg = sc.nextLine();
	    System.out.println("");

            if (valg.equalsIgnoreCase("a")){
               i = 0;
            }

            if (valg.equalsIgnoreCase("k")){
                System.out.print("Hva er tittelen paa filmen? ");
                String tittel = sc.nextLine();
                System.out.print("Hvem har kjoept filmen? ");
                String eier = sc.nextLine();
            }

            if (valg.equalsIgnoreCase("l")){
		System.out.print("Hvilken film gjelder dette? ");
		String tittel = sc.nextLine();
		System.out.print("Hvem laaner filmen? ");
		String laaner = sc.nextLine();
		System.out.print("Hvem eier filmen? ");
		String eier = sc.nextLine();
            }

            if (valg.equalsIgnoreCase("n")){
		System.out.print("Hva heter vedkommende? ");
		String person = sc.nextLine();
            }

            if (valg.equalsIgnoreCase("o")){
		System.out.println("Oversikt");
            }

            if (valg.equalsIgnoreCase("r")){
		System.out.print("Hvilken film blir returnert? ");
		String tittel = sc.nextLine();
		System.out.print("Hvem er det som returnerer? ");
		String person = sc.nextLine();
            }

            if (valg.equalsIgnoreCase("v")){
		System.out.print("Hvem sin DVD samling onsker du aa se? (skriv 'alle' for alle) ");
		String person = sc.nextLine();
            }
        }
    }

    private  void printMeny() {
        System.out.println("");
        System.out.println("DVD - Administrasjon");
        System.out.println("");
        System.out.println("A : Avslutt");
        System.out.println("K : Kjoep");
        System.out.println("L : Laan");
        System.out.println("N : Ny person");
        System.out.println("O : Oversikt");
        System.out.println("R : Retur");
        System.out.println("V : Vis");
        System.out.println("");
        System.out.print("Skriv inn valg : ");
    }
}
