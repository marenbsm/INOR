public class Bok implements TilUtlaan{
    private String laaner,eier,tittel;

    public Bok(String tittel, String eier){
	this.eier=eier;
	this.tittel=tittel;
	this.laaner=null;
    }

    public Bok(String tittel, String eier, String laaner){
	this.eier=eier;
	this.tittel=tittel;
	this.laaner=laaner;
    }

    public boolean laanUt(String laaner){
	if (this.utlaant()) return false;
	this.laaner=laaner;
	return true;
    }

    public boolean leverTilbake(){
	if (!utlaant())return false;
	this.laaner=null;
	return true;
    }

    public boolean utlaant(){
	if (this.laaner==null)return false;
	return true;
	//return (!this.laaner==null);
    }

    public String laaner(){
	return this.laaner;
    }

    public String eier(){
	return this.eier;
    }

    public String tittel(){
	return this.tittel;
    }
}
