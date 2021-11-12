public class Bici extends VeicoloNonImmatricolato{
    boolean haCasco;


    public Bici(int id, double[] posizioneGPS, boolean affittato, double tariffa) {
        super(id, posizioneGPS, affittato, tariffa);
        this.haCasco=true;
        this.tariffa=0.10;
    }


}
