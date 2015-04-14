/**
 * Grensesnitt for utlaan av ting.
 */ 

public interface TilUtlaan{
    /**
     * Laaner ut.
     *@param laaner navn paa laaner.
     *@return True  om tingen ble utlaant, false ellers.
     */
    public boolean laanUt(String laaner);
    
    /**
     * Leverer tilbake
     *@return True om overleveringen gikk bra, false ellers.
     */
    public boolean leverTilbake();
    
    /**
     * Sjekker status pa utlaan.
     *@return boolean True om utlaant, false ellers.
     */
    public boolean utlaant();
    
    /**
     * Forteller hvem som laaner for oyeblikket.
     *@return String navn paa laaner, null om ikke utlaant.
     */
    public String laaner();
    
}
