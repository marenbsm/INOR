class MinTraad implements Runnable {
    private String sokeord;
    private String[] liste;
    private SyncTeller teller;

    MinTraad (String sokeord, String[] liste, SyncTeller teller) {
	this.sokeord = sokeord;
	this.liste = liste;
	this.teller = teller;
    }

    public void run(){
	for(String s: liste){
	    if (s.equalsIgnoreCase(sokeord)) this.teller.opp();
	}
    }
}
