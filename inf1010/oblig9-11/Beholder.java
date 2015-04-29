class Beholder {
	private int[] tall;

	Beholder (int storrelse){
		this.tall = new int[storrelse];
	}

	public void setVerdi (int verdi) {
		if (verdi>0) this.tall[verdi-1] = verdi;
	}

	public void fjernVerdi(int verdi) {
		if (verdi>0) this.tall[verdi-1] = 0;
	} 
/*
	public boolean sjekkVerdi(int verdi) {
		return (this.tall[verdi-1] != verdi);
	}
*/
	public boolean finnesVerdi(int verdi) {
		for(int i = 0; i < tall.length; i++){
			if (tall[i] == verdi) return true;
		}
		return false;
	}

	public int [] muligeTall(int[] tall) {
		int[] muligeTall = new int[tall.length];
		for (int i = 0; i < tall.length ; i++) {
			if (tall[i] == (i+1)) muligeTall[i] = (this.finnesVerdi(i+1)) ? 0 : i+1;
		}
		return muligeTall;
	}

	public int size(){
		return this.tall.length;
	}
}