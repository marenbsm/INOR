public class MinOppgave5 {
    public static void main (String[] args){

	Bil b01 = new Bil();
	b01.settEier("Erik");
	b01.settMerke("Toyota");
	b01.printData();

	Bil b02 = new Bil();
	b02.settEier("Martin");
	b02.settMerke("BMW");
	b02.printData();
    }
}


class Bil{
    private String eier;
    private String merke;


    void settEier(String eier){
	this.eier = eier;
    }

    void settMerke(String merke){
	this.merke = merke;
    }

    void printData(){
	System.out.println(this.eier);
	System.out.println(this.merke);
    }

}
