public class Hylle<T> implements GenHylle<T>{
    private Object[] hylleplass;

    public Hylle(){
        this.hylleplass = new Object[100];
    }
    public Hylle(int plasser){
        this.hylleplass = new Object[plasser];
    }
    public int storrelse(){
        return hylleplass.length;
    }
    public boolean ledig (int nummer){
        if (nummer >= storrelse())return false;
        else if (nummer < 0)return false;
        return (this.hylleplass[nummer] == null);
    }

    public boolean settInn(T ting, int nummer){
        if (this.ledig(nummer)){
            this.hylleplass[nummer] = ting;
            return true;
        }
        return false;
    }

    /*
      Siden hyllen inneholder objekter av type Object, vi skal returnere av typen T.
      Saa maa vi type objectet i arrayen (Object) som en T.
    */
    public T taUt(int nummer){
        @SuppressWarnings ("unchecked")
            T temp = (T) hylleplass[nummer];
        this.hylleplass[nummer] = null;
	return temp;
    }
}
