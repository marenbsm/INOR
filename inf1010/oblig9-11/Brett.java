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
    public int dimensjon() {
	return (raderIBoks*kolonnerIBoks);
    }

    public int getRaderIBoks() {
	return raderIBoks;
    }

    public int getKolonnerIBoks() {
	return kolonnerIBoks;
    }
    public int boksNummer(int rad, int kolonne) {
	return rad-(rad%this.raderIBoks)+(kolonne%kolonnerIBoks);
    }

    public void delInnRuter() {
	//  brett[rader][kolonner]
	Rad[] rader = new Rad[this.dimensjon()];
	Kolonne[] kolonner = new Kolonne[this.dimensjon()];
	Boks[] bokser = new Boks[this.dimensjon()];

	for (int i = 0; i < this.dimensjon(); i++ ) {
	    kolonner[i] = new Kolonne();
	}
	
	for (int i= 0; i < this.dimensjon(); i++) {
	    bokser[i] = new Boks();
	}
	
	for (int r = 0; r < this.dimensjon(); r++ ) {
	    rader[r] = new Rad();
	    for (int k = 0; k < this.dimensjon(); k++ ) {
		this.brett[r][k].setRad(rader[r]);
		this.brett[r][k].setKolonne(kolonner[k]);
		this.brett[r][k].setBoks(bokser[boksNummer(r,k)]);
	    }
	}
    }
}
