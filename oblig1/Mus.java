class Mus {
    private boolean syk;
    private int vekt;
    private boolean lever;
    private int serienummer;
    static private int teller;

    public Mus(int vekt, boolean syk){
	this.vekt = vekt;
	this.syk = syk;
	this.lever = true;
	this.serienummer = ++teller;
    }

    public String syk(){
	String s=""+this.syk;
	return s;
    }
    public String vekt(){
	String s = ""+this.vekt;
	return s;
    }
    public String lever(){
	String s = ""+this.lever;
	return s;
    }
    private String status(){
	if (!lever){
	    return "død";
	}
	else if (syk){
	    return "syk";
	}
	return "lever";
    }
    
    public void sjekktilstand (String testID, String navn, boolean syk, int vekt, boolean lever){
	if(navn.equals("?")){
		System.out.println("--- "+testID+" --- Info om mus: navn: musNr"+this.serienummer+", vekt: "+this.vekt+", "+this.status());
		return;
	    }
	
	System.out.println ("********* Test av musobjekt, testid: "+testID+" ***");
	System.out.println ("** navn: "+navn+", OK.");
	System.out.print ("** syk: "+syk+", ");
	if (this.syk==syk){
	    System.out.println("OK.");
	}else{
	    System.out.println("FEIL.");
	}
	System.out.print ("** vekt: "+vekt+", ");
	if (this.vekt==vekt){
	    System.out.println("OK.");
	}else{
	    System.out.println("FEIL.");
	}
    }

    public void bitt(){
	if (!this.lever){
	    return;
	}
	if (this.syk){
	    this.lever = false;
	    return;
	}
	this.syk = true;
	    return;
    }
    public void spist(){
	this.lever = false;
	return;
    }
}
