class Oblig10 {
	private Brett spillebrett;
	private 

	Oblig10 (String[] args) {
		this.spillebrett = new Brett(args[0]);
	}

	public static void main (String[] args) {
		Oblig10 sudoku = new Oblig10(args);
		if (sudoku.tom() ) return;
		sudoku.spillebrett.solve();
		if (args.length < 2) {
			sudoku.spillebrett.skrivUt();
		}
		else {
			sudoku.spillebrett.skrivTilFil(args[1]);
		}
	}

	

	public boolean tom() {
		return (this.spillebrett==null);
	}
}