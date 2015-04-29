class Brett {
	private Rute[][] brett; // [rad] [kolonne]
	private int raderIBoks;
	private int kolonnerIBoks;

	Brett (Rute [][] r, int raderIBoks, int kolonnerIBoks) {
		this.brett = r;
		this.raderIBoks = raderIBoks;
		this.kolonnerIBoks = kolonnerIBoks;
		this.delInnRuter();
	}
	public void skrivUt(){
		for (int r = 0; r < this.brett.length; r++) {
			for (int k = 0; k < this.brett[r].length; k++) {
			//	String farge = this.brett[r][k].getLaast() ? "\u001b[31m" : "\u001b[0m";
		// ANSI
		// 001b[31m = rødt, 001b[0m = hvit
			//	System.out.print(farge+this.brett[r][k].toString()+"\u001b[0m ");
				System.out.print(this.brett[r][k].toString()+" ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public void solve(){
		this.brett[0][0].fyllUtDenneRuteOgResten();
	}
	public int dimensjon() {
		return (raderIBoks*kolonnerIBoks);
	}

	public int[] finnAlleMuligeTall(int rad, int kol) {
		return brett[rad][kol].finnAlleMuligeTall();
	}

	public int getRaderIBoks() {
		return raderIBoks;
	}

	public int getKolonnerIBoks() {
		return kolonnerIBoks;
	}
	
	public int boksNummer(int rad, int kolonne) {
		return rad - (rad%this.raderIBoks) + (kolonne/this.kolonnerIBoks);
	}

	private void delInnRuter() {
	//  brett[rader][kolonner]
		Beholder[] rader = new Beholder[this.dimensjon()];
		Beholder[] kolonner = new Beholder[this.dimensjon()];
		Beholder[] bokser = new Beholder[this.dimensjon()];

		for (int i = 0; i < this.dimensjon(); i++ ) {
			kolonner[i] = new Beholder(this.dimensjon());
		}

		for (int i= 0; i < this.dimensjon(); i++) {
			bokser[i] = new Beholder(this.dimensjon());
		}

		for (int r = 0; r < this.dimensjon(); r++ ) {
			rader[r] = new Beholder(this.dimensjon());
			for (int k = 0; k < this.dimensjon(); k++ ) {
				//System.out.println("");
				this.brett[r][k].setRad(rader[r]);
				//System.out.println("Rad "+r+" satt");
				this.brett[r][k].setKolonne(kolonner[k]);
				//System.out.println("Kolonne "+k+" satt");
				this.brett[r][k].setBoks(bokser[this.boksNummer(r,k)]);
				//System.out.println("Boks "+this.boksNummer(r,k)+" satt");
			}
		}

		Rute forrigeRute = null;
		for (int r = 0; r < this.dimensjon(); r++) {
			for (int k = 0; k < this.dimensjon(); k++) {
				this.brett[r][k].setBrett(this);
				if (forrigeRute==null) { //cornercase
					forrigeRute = this.brett[r][k];
					k+=1;
				}
				forrigeRute.setNeste(this.brett[r][k]);
				forrigeRute = this.brett[r][k];
			}
		}
	}
}