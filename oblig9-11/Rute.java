class Rute {
    int verdi;
    Boks boks;
    Kolonne kolonne;
    Rad rad;

    Rute(char c){
	setVerdi(c);
    }

    public void setVerdi(char c) {
	if (c < '1') this.verdi=0;
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
