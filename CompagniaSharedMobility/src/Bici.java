public class Bici extends VeicoloNonImmatricolato{
    boolean haCasco;


    public Bici(int id, double[] posizioneGPS, boolean affittato, double tariffa) {
        super(id, posizioneGPS, affittato, tariffa);
    }

    public boolean isHaCasco() {
        return haCasco;
    }

    public void setHaCasco(boolean haCasco) {
        this.haCasco = haCasco;
    }
}
