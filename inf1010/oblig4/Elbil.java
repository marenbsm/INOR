class Elbil extends Bil{
    private int batteri;

    Elbil(String s, int i){
	super(s);
	this.batteri(i);
    }

    Elbil(String s, String ss){
	super(s);
	this.batteri(ss);
    }

    public int batteri(){
	return this.batteri;
    }

    public void batteri(int i){
	this.batteri=i;
    }

    public void batteri(String s){
	this.batteri(Integer.parseInt(s));
    }
}
