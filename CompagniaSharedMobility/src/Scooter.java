import java.util.List;

public class Scooter extends VeicoloBenzina{
    private boolean haCasco;

    public Scooter(int id, double[] posizioneGPS, boolean affittato, double tariffa, float serbatoio, boolean haCasco, String targa, List<Patente> patenteNecessaria) {
        super(id,posizioneGPS,affittato,tariffa,serbatoio,targa,patenteNecessaria);
        this.haCasco = haCasco;
    }

    public boolean isHaCasco() {
        return haCasco;
    }
}
