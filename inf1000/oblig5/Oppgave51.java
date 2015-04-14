import java.util.Scanner;

public class Oppgave51 {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        /*
        // Oppretter objekt av klassen Mobil
        Mobil m = new Mobil();

        // fyller data i "telefonen" "m"
        m.settMerke ("Samsung");
        m.settEier ("'ingen'");
        m.settTelefonnummer ("904 74 901");

        // printer innholdet i telefon "m" til konsoll

        System.out.println ("\nMerke  : "+m.printMerke());
        System.out.println ("Eier   : "+m.printEier());
        System.out.println ("Tlf #  : "+m.printTelefonnummer()+"\n");
        */
        // oppretter objekt av klassen Person
        Person p = new Person();
	int aldersgrenseForMobil = 14; // personen maa vaere eldre enn.

        // fyller objektet p med data
        System.out.print("\nSkriv in persondata :\nNavn   : ");
        p.settNavn(s.nextLine());

        System.out.print("Alder  : ");
        p.settAlder(s.nextLine());

        System.out.print("Bosted : ");
        p.settBosted(s.nextLine());

        if (p.printAlder()>aldersgrenseForMobil){
            //lager objekt
            Mobil m = new Mobil();
            //setter data
            System.out.print("\nSkriv inn Mobiltelefondata:\nMerke  : ");
            m.settMerke(s.nextLine());
            m.settEier(p.printNavn());
            System.out.print("Tlf #  : ");
            m.settTelefonnummer(s.nextLine());

            // printer data for person p til konsoll
            System.out.println ("\n------\n\nNavn   : "+p.printNavn());
            System.out.println ("Alder  : "+p.printAlder());
            System.out.println ("Bosted : "+p.printBosted());
	    if (p.printAlder()>aldersgrenseForMobil){
		System.out.println ("\nTelefon :\nMerke  : "+m.printMerke());
		System.out.println ("Eier   : "+m.printEier());
		System.out.println ("Tlf #  : "+m.printTelefonnummer());
		}
	}

    }
}
