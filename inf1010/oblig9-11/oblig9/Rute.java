class Rute {
	private int verdi;
	private Beholder boks;
	private Beholder kolonne;
	private Beholder rad;
	private boolean laast = true;

	Rute(char c){
		setVerdi(c);
	}

	public int[] finnAlleMuligeTall() {
		if (this.verdi == 0 && !this.laast){
			int[] tall = new int[boks.size()];
			for (int i = 0; i < tall.length; i++) {
				tall[i] = i+1;
			}
			return rad.muligeTall(kolonne.muligeTall(boks.muligeTall(tall)));
		}
		return new int[]{this.verdi};
	}

	public void setVerdi(char c) {
		if (c < '1') {
			this.verdi = 0;
			this.laast = false;
		}
		else if (c < ':') this.verdi = (int)c-'0'; // ':' folger '9'i ascii tabellen
		else this.verdi = (int)( c-'A'+10);
	}

	public char getCharVerdi() {
		if (this.verdi == 0) return '.';
		else if (this.verdi < 10) return (char)(this.verdi+'0'); // 48 = '0'
		else return (char)(this.verdi-10+'A');
	}

	public String toString() {
		return getCharVerdi()+"";
	}

	public boolean setBoks(Beholder b) {
		this.boks = b;
		if (this.verdi != 0) b.setVerdi(this.verdi);
		return (this.boks == b);
	}

	public Beholder getBoks() {
		return this.boks;
	}

	public boolean setKolonne(Beholder k) {
		this.kolonne = k;
		if (this.verdi != 0) k.setVerdi(this.verdi);
		return (this.kolonne == k);
	}

	public Beholder getKolonne() {
		return this.kolonne;
	}

	public boolean setRad(Beholder r) {
		this.rad = r;
		if (this.verdi != 0) r.setVerdi(this.verdi);
		return (this.rad == r);
	}

	public Beholder getRad() {
		return this.rad;
	}

	public boolean getLaast(){
		return this.laast;
	}
}