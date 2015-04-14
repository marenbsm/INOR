class SyncTeller{
    private int teller = 0;

    public synchronized void opp() {
        this.teller ++;
    }

    public synchronized int verdi() {
        return this.teller;
    }
}
