import java.util.ArrayList;

class Person {
    private ArrayList<DVD> dvdListe = new ArrayList<>();
    private String navn;

    // constructor
    public Person (String navn){
        this.navn = navn;
    }

    public String toString() {
        return this.navn;
    }

    public void nyDVD(String tittel){
        DVD a = new DVD (tittel, this );
        this.dvdListe.add(a);
    }

    public void fjernDVD(String tittel){
        int i = finnDVD(tittel);
        if (i==-1){
            return;
        }
        this.dvdListe.remove (i);
    }

    public void laanBortDVD (Person navn, String tittel, int stille){
        int k = finnDVD(tittel);
        if (k<0){
            System.out.println("Filmen finnes ikke.");
            return;
        }
        DVD a = this.dvdListe.get(k);
        if (!(a.hentEier() == (a.hentBesittelse()))){
            System.out.println("Filmen er allerede utlaant til "+a.hentBesittelse().toString()+".");
        }else{
            a.endreBesittelse(navn);
            if (stille==0){
                System.out.println(a.toString()+" laant.");
                System.out.println("");
            }
        }
    }

    public boolean leverDVD (String tittel, Person laaner){
        int i = finnDVD(tittel);
        if(i ==-1){
            return false;
        }
        DVD a = this.dvdListe.get(i);
        if (a.hentBesittelse() == laaner ){
            a.endreBesittelse(a.hentEier());
            return true;
        }
        else{
            return false;
        }
    }

    public int finnDVD(String tittel) {
        for(int i = 0; i < this.dvdListe.size(); i++){
            DVD a = this.dvdListe.get(i);
            if (tittel.equalsIgnoreCase(a.toString() ) ){
                return i;
            }
        }
        return -1;
    }

    public void skrivUtSamling (){
        System.out.println("---- "+this.navn+" ----");
        for (int i = 0; i < this.dvdListe.size(); i++){
            DVD a = dvdListe.get(i);
            String eier = a.hentEier().toString();
            String besittelse = a.hentBesittelse().toString();
            System.out.print (a.toString() );
            if (a.hentEier() == a.hentBesittelse() ){
                System.out.println("");
            }
            else{
                System.out.println(" - laant av "+besittelse);
            }
        }
    }
    
    public int antallDVD(){
        return this.dvdListe.size();
    }
    
    public DVD nummerDVD(int i){
        return this.dvdListe.get(i);
    }
    
    public void tellSamling (){
        int total = 0;
        int bortlaant = 0;
        for (int i=0; i < this.dvdListe.size(); i++) {
            DVD a = this.dvdListe.get(i);
            if (a.hentEier() == a.hentBesittelse() ){
                total++;
            }
            else{
                total++;
                bortlaant++;
            }
        }
        System.out.println ("\n"+this.navn+" har en samling paa "+total+" DVD filmer, "+bortlaant+" er bortlaant.");
    }
    public int sjekkLaaner (Person laaner){
        int k = 0;
        for (int i = 0; i < this.dvdListe.size(); i ++) {
            DVD a = this.dvdListe.get(i);
            if (a.hentBesittelse() == laaner ){
                k ++;
            }
        }return k;
    }

    // the end
}
