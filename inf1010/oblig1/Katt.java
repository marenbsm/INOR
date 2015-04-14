class Katt {
    private String navn;
    private int vekt;
    private int antMus;
    private boolean syk;

    public Katt (String navn, int vekt, boolean syk){
	this.navn = navn;
	this.vekt = vekt;
	this.syk = syk;
    }

    public Katt (String navn){
	this.navn = navn;
	this.vekt = 5000;
	this.syk = false;
    }

    public String navn(){	
	return this.navn;
    }

    public String vekt(){
	String s = ""+this.vekt;
	return s;
    }

    public String antMus(){
	String s = ""+this.antMus;
	return s;
    }

    public String syk(){
	String s = ""+this.syk;
	return s;
    }

    private boolean sulten (){
	if (this.antMus<2){
	    return true;
	}
	return false;
    }
    
    public Mus gaaPaaJaktI (Bol<Mus> musebol){
	if (musebol.tomt()){
	    return null;
	}
	Mus bytte = musebol.taUt();
	if (this.sulten() && bytte.lever().equals("true") && !this.syk){
	    bytte.spist();
	    this.syk = bytte.syk().equals("true");
	    this.vekt += Integer.parseInt(bytte.vekt());
	    this.antMus ++;
	    return null;
	}
	else if(this.sulten() && bytte.lever().equals("true") && this.syk){
	    bytte.spist();
	    this.vekt += Integer.parseInt(bytte.vekt());
	    this.antMus ++;
	    return null;
	}
	else{
	bytte.bitt();
	musebol.settInn(bytte);
	return bytte;
	}
    }
}
