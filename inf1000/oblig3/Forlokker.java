public class Forlokker {

    public static void main (String [] args){
        int sumpartall = 0;
	int sumoddetall = 0;

	// forlokke for partall, lister opp hvert enkelt og adderer de sammen.
        for (int partall = 2;partall < 10;partall += 2){
            sumpartall += partall;
	    System.out.println("partall : "+partall);
        }

	System.out.println("Summen av alle partallene : "+sumpartall);

	// forlokke for oddetall, adderer opp alle oddetall mellom 0 og 10.
	for (int oddetall = 1;oddetall < 10; oddetall += 2){
	    sumoddetall += oddetall;
	}

	System.out.println("Summen av alle oddetall mellom 0 og 10 er : "+sumoddetall);
    }
}
