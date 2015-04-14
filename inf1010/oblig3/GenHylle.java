/**
 * Grensesnitt for generisk hylle, max 2³¹-1 plasser. Plassene starter fra 0.
 */ 

public interface GenHylle<T>{
    
    /**
     * Hvor stor er hyllen?
     * @return int Antall plasser returnert som en int.
     */
    public int storrelse ();
    
    /**
     * Sjekker om en plass er ledig.
     * @param hylleplass Hylleplassen som skal sjekkes
     * @return boolean True hvis plassen er ledig, false ellers.
     */    
    public boolean ledig(int hylleplass);
    
    /**
     * Setter en ting inn i hyllen.
     * @param ting ting som skal settes inn.
     * @param hylleplass plassen tingen skal settes inn paa.
     * @return boolean True hvis tingen ble plassert, false ellers.
     */    
    public boolean settInn(T ting,int hylleplass);
    
    /**
     * Tar noe ut av en hylle.
     * @param hylleplass Plassen noe skal hentes fra
     * @return T returnerer det som skulle hentes, null om det feilet.
     */
    public T taUt(int hylleplass);
}
