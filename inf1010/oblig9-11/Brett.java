import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Brett {
	private Rute[][] brett; // [rad] [kolonne]
	private int raderIBoks;
	private int kolonnerIBoks;
	private SudokuBeholder losningsBeholder;

	Brett (Rute [][] r, int raderIBoks, int kolonnerIBoks) {
		this.brett = r;
		this.raderIBoks = raderIBoks;
		this.kolonnerIBoks = kolonnerIBoks;
		losningsBeholder = new SudokuBeholder(2500);
		this.delInnRuter();
	}

	Brett (Brett b) {
		this.raderIBoks = b.getRaderIBoks();
		this.kolonnerIBoks = b.getKolonnerIBoks();
		Rute[][] nyttBrett = new Rute[this.raderIBoks*this.kolonnerIBoks][this.raderIBoks*this.kolonnerIBoks]; 
		for (int r = 0; r < nyttBrett.length; r++) {
			for (int k = 0; k < nyttBrett[r].length; k++) {
				nyttBrett[r][k] = new Rute(b.getRuteVedPosisjon(r,k).getCharVerdi());
			}
		}
		this.brett = nyttBrett;
	}

	Brett (String s) {
		fyllBrettFraFil(s);
		losningsBeholder = new SudokuBeholder(2500);
		this.delInnRuter();
	}

	public void lagre() {
		this.losningsBeholder.settInn(getCopy());
	}

	public String toString() {
		// 1: 421563//653214//134625//265431//512346//346152//
		String losninger = "";
		for (int r = 0; r < this.brett.length; r++) {
			for (int k = 0; k < this.brett[r].length; k++) {
				losninger += (this.brett[r][k].toString());
			}
			losninger += "//";
		}
		losninger += "\n";
		return losninger;
	}

	public void skrivUt(){
		losningsBeholder.skrivUt();
	}

	public void skrivTilFil(String filnavn){
		losningsBeholder.skrivTilFil(filnavn);
	}

	public Rute getRuteVedPosisjon (int rad, int kolonne){
		return this.brett[rad][kolonne];
	}

	public Brett getCopy() {
		Brett b = new Brett (this);
		return b;
	}

	public void solve() {
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
				this.brett[r][k].setBrett(this); // forteller ruten hvilket brett den tilhører.
				if (forrigeRute==null) { //cornercase for første rute.
					forrigeRute = this.brett[r][k];
					k+=1;
				}
				forrigeRute.setNeste(this.brett[r][k]);
				forrigeRute = this.brett[r][k];

			}
		}
	}

	private void fyllBrettFraFil(String s) {
		Scanner sc = null;
		try{
			sc = new Scanner(new File (s) );
		}
		catch (FileNotFoundException e) {
			System.out.println("Fil ikke funnet, stacktrace:");
			e.printStackTrace();
			System.exit(1);
		}
		raderIBoks = Integer.parseInt(sc.nextLine());
		kolonnerIBoks = Integer.parseInt(sc.nextLine());
		brett = new Rute[raderIBoks*kolonnerIBoks][raderIBoks*kolonnerIBoks];
		int r = 0;
		while(sc.hasNextLine()) {
			char[] linje = sc.nextLine().toCharArray();
			for (int k = 0; k < linje.length; k++) {
				brett[r][k] = new Rute(linje[k]);
			}
			r++;
		}
	}
}