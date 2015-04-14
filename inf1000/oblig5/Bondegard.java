import java.util.Arrays;
import java.util.Scanner;

class Bondegard{
    Gris [] grisebinge = new Gris [10];
    Hest [] stall = new Hest [5];
    Ku [] fjos = new Ku[30];



    // main metoden
    public static void main(String[] args){
        Bondegard b = new Bondegard ();

        // setter inn 5 griser i bingen
        for (int i = 0; i < 5; i++){
            Gris g = new Gris ();
            String navn = "Gris-"+(i+1);
            g.giData(navn);
            b.settInnGris(g);
            System.out.println ("Grisen "+b.grisebinge[i].hentNavn()+" har faatt ett nytt hjem.");
        }

        // setter inn 2 hester i stallen
        for (int i = 0; i < 2; i++){
            Hest h = new Hest();
            String navn = "Hest-"+(i+1);
            h.giData(navn);
            b.settInnHest(h);
            System.out.println ("Hesten "+b.stall[i].hentNavn()+" har faat ett nytt hjem.");
        }

        // setter 8 kyr inn i fjoset
        for (int i = 0; i < 8; i++){
            Ku k = new Ku();
            String navn = "Ku-"+(i+1);
            k.giData(navn);
            b.settInnKu(k);
            System.out.println ("Kua "+b.fjos[i].hentNavn()+" har faat ett nytt hjem.");
        }
        //selger 3 griser, 1 hest og 4 kuer.
        b.selgDyr("gris", 3);
        b.selgDyr("hest", 1);
        b.selgDyr("ku", 4);

    }

    // metode for aa selge dyr
    void selgDyr(String type, int antall){

        // for gris - min metode
        if (type.equals("gris")){
            for (int i = grisebinge.length-1; i > 0; i--){
                if(antall!=0){
                    if (grisebinge[i]!=null){
                        System.out.println("Gris "+grisebinge[i].hentNavn()+" solgt.");
                        grisebinge[i] = null;
                        antall--;
                    }
                }
            }
        }

        // for hest - Ole-Christian sin metode

        if (type.equals("hest")){
            for(int i = stall.length-1; antall > 0; i--){
                if (stall[i] != null){
                    System.out.println("Hest "+stall[i].hentNavn()+" solgt.");
                    stall[i] = null;
                    antall--;

                }
            }
        }

        // for ku - bruker Ole-Christian sin igjen, fordi den var fin.

        if (type.equals("ku")){
            for (int i = fjos.length-1; antall > 0; i--){
                if (fjos[i] != null){
                    System.out.println("Ku "+fjos[i].hentNavn()+" solgt.");
                    fjos[i] = null;
                    antall--;
                }
            }
        }
    }

    // metode for aa sette inn en gris i grisebinge-arrayen
    void settInnGris(Gris g){
        for (int i = 0; i < grisebinge.length; i++){
            if (grisebinge[i] == null){
                grisebinge[i] = g;
                return;
            }
        }
        System.out.println ("Grisebingen er full!");
    }
    // metode for aa sette inn en hest i stall-arrayen
    void settInnHest(Hest h){
        for (int i = 0; i < stall.length; i++){
            if (stall[i] == null){
                stall [i] = h;
                return;
            }
        }
        System.out.println ("Stallen er full!");
    }

    // metode for aa sette inn en ku i fjos-arrayen
    void settInnKu(Ku k){
        for (int i = 0; i < fjos.length; i++){
            if (fjos[i] == null){
                fjos [i] = k;
                return;
            }
        }
        System.out.println("Fjoset er fullt!");
    }
}
