import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

class Innleser{
    private ArrayList<Bil> billiste = new ArrayList<>();
    private String arg;
    
    public static void main(String[] args) throws FileNotFoundException{
        Innleser bilarkiv = new Innleser();
	bilarkiv.arg = args[0];
        bilarkiv.skriv(args[0]);
        bilarkiv.les();
    }

    public void skriv(String s) throws FileNotFoundException {
        File file = new File(s);
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] data = line.split(" ");

            switch (data[0]){
            case "BIL" : this.billiste.add(new Bil(data[1]));
                break;
            case "ELBIL" : this.billiste.add(new Elbil(data[1],data[2]));
                break;
            case "FOSSILBIL" : this.billiste.add(new Fossilbil(data[1],data[2]));
                break;
            case "PERSONFOSSILBIL" : this.billiste.add(new Personbil(data[1],data[2],data[3]));
                break;
            case "LASTEBIL" : this.billiste.add(new Lastebil(data[1],data[2],data[3]));
		break; // trenger ikke
            }
        }
    }
    public void les(){
        System.out.println("Skikkelige biler i '"+arg+"'  :");
        for(Bil bil : billiste){
            if (bil instanceof Personbil){
		Personbil personbil = (Personbil)bil;
                System.out.println (personbil.bilnummer()+" "+personbil.co2()+" "+personbil.passasjerkapasitet());
            }
        }
    }
}
