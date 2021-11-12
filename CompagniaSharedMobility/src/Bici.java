public class Bici extends VeicoloNonImmatricolato{
    boolean haCasco;


    public Bici(int id, double[] posizioneGPS, boolean affittato, double tariffa) {
        super(id, posizioneGPS, affittato, tariffa);
    }

    public boolean isHaCasco() {
        return haCasco;
    }
    /*
    @param haCasco True se ha casco, false se non lo ha
     */
    public void setHaCasco(boolean haCasco) {
        this.haCasco = haCasco;
    }
}
