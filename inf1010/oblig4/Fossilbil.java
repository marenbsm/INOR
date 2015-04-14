class Fossilbil extends Bil{
    private double co2;

    Fossilbil(String s, double d){
        super(s);
        this.co2(d);
    }

    Fossilbil(String s, String ss){
	super(s);
	this.co2(ss);
    }
    

    public double co2(){
        return this.co2;
    }

    public void co2(double d){
        this.co2 = d;
    }

    public void co2(String s){
        this.co2(Double.parseDouble(s));
    }
}
