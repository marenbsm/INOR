import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Oblig10 {
	private Brett spillebrett;

	Oblig10 (String s) {
		this.spillebrett = lesFil(s);
	}

	public static void main (String[] args) {
		Oblig10 sodoku = new Oblig10(args[0]);
		if (sodoku.tom() ) return;
		sodoku.spillebrett.skrivUt();
		sodoku.spillebrett.solve();
		/*
		for (int i : sodoku.spillebrett.finnAlleMuligeTall(2,1)) {
			System.out.print(i+" ");
		}
		*/
	}

	private Brett lesFil(String s) {
		Rute[][] brett; // [rad] [kolonne]
		Scanner sc;
		int raderIBoks;
		int kolonnerIBoks;
		try{
			sc = new Scanner(new File (s) );
		}
		catch (FileNotFoundException e) {
			System.out.println("Fil ikke funnet, stacktrace:");
			e.printStackTrace();
			return null;
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
		return (new Brett(brett, raderIBoks, kolonnerIBoks));
	}

	public boolean tom() {
		return (this.spillebrett==null);
	}
}