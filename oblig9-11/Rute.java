class Rute {
    char verdi;
    Boks boks;
    Kolonne kolonne;
    Rad rad;

    Rute(char c){
        this.verdi = c;
    }
    public String toString(){
        return this.verdi+"";
    }

    public boolean setBoks(Boks b) {
	this.boks = b;
	return (this.boks == b);
    }

    public Boks getBoks() {
	return this.boks;
    }

    public boolean setKolonne(Kolonne k) {
	this.kolonne = k;
	return (this.kolonne == k);
    }

    public Kolonne getKolonne() {
	return this.kolonne;
    }

    public boolean setRad(Rad r) {
	this.rad = r;
	return (this.rad == r);
    }

    public Rad getRad() {
	return this.rad;
    }
}
