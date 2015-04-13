class Personbil extends Fossilbil{
    private int passasjerkapasitet;

    Personbil(String s, double d, int i){
	super(s,d);
	this.passasjerkapasitet(i);
    }

    Personbil(String s, String ss, String sss){
	super(s,ss);
	this.passasjerkapasitet(sss);
    }

    public int passasjerkapasitet(){
	return this.passasjerkapasitet;
    }

    public void passasjerkapasitet(int i){
	this.passasjerkapasitet=i;
    }
    public void passasjerkapasitet(String s){
	this.passasjerkapasitet(Integer.parseInt(s));
    }

}
