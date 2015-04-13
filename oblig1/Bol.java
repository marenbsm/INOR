class Bol <T>{
    private T beboer;

    public T beboer(){
        return this.beboer;
    }

    public void settInn(T noe){
        this.beboer = noe;
    }

    public T taUt(){
        T t = this.beboer;
        this.beboer=null;
        return t;
    }

    public boolean tomt (){
        if (beboer==null){
            return true;
        }
        return false;
    }
}
