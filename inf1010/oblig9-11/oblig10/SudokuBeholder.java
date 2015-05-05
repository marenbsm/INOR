import java.util.LinkedList;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;

class SudokuBeholder extends LinkedList<Brett>{
	long teller = 0;
	int max;

	SudokuBeholder (int max) {
		this.max = max;
	}
	public void settInn(Brett b) {
		if (teller < max) this.push(b);
		teller++;
	}

	public Brett taUt() {
		Brett b = null;
		if (teller>0) {
			b = this.pop();
			teller--;
		}
		return b;
	}

	public long hentAntallLosninger() {
		return teller;
	}

	public void skrivUt() {
		int l = 1;
		for (Brett b : this) {
			System.out.print(l++ +": "+b);
		}
		System.out.print("Totale løsninger : "+teller+"\n");
	}

	public void skrivTilFil(String filnavn) {
		int l = 1;
		try {
			FileWriter fw = new FileWriter(filnavn);
			BufferedWriter bw = new BufferedWriter(fw);
			for (Brett b : this) {
				bw.write(l++ +": "+b);
			}
			bw.write("Totale løsninger : "+teller+"\n");
			bw.close();
		}

		catch(Exception e) {
			System.out.println("Noe gikk galt ved skriving til fil");
		}

	}
}