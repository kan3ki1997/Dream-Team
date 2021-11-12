public class Scooter extends VeicoloBenzina{
    private boolean haCasco;

    public Scooter(int ID,double[] PosizioneGPS,boolean Affitato,double tariffa,float serbatoio, boolean haCasco) {
        super(ID,PosizioneGPS,Affitato,tariffa,serbatoio);
        this.haCasco = haCasco;
    }
}
