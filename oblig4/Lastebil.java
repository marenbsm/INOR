class Lastebil extends Fossilbil{
    private double nyttevekt;

    Lastebil(String s, double d1, double d2){
	super(s,d1);
	this.nyttevekt(d2);
    }

    Lastebil(String s, String ss, String sss){
	super(s,ss);
	this.nyttevekt(sss);
    }

    public double nyttevekt(){
	return this.nyttevekt;
    }

    public void nyttevekt(double d){
	this.nyttevekt=d;
    }

    public void nyttevekt(String s){
	this.nyttevekt(Double.parseDouble(s));
    }
}
