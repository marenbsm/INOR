class Brett {
    Rute[][] brett; // [rad] [kolonne]
    int raderIBoks;
    int kolonnerIBoks;

    Brett (Rute [][] r, int raderIBoks, int kolonnerIBoks) {
	this.brett = r;
	this.raderIBoks = raderIBoks;
	this.kolonnerIBoks = kolonnerIBoks;
    }
    public void skrivUt(){
	for (int r = 0; r < this.brett.length; r++) {
	    for(int k = 0; k < this.brett[r].length; k++) {
		System.out.print(this.brett[r][k].toString()+" ");
	    }
	    System.out.println("");
	}
    }
    
    public int getRaderIBoks() {
	return raderIBoks;
    }

    public int getKolonnerIBoks() {
	return kolonnerIBoks;
    }
}
