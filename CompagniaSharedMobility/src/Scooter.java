import java.util.ArrayList;
import java.util.List;

public class Scooter extends VeicoloBenzina{
    private boolean haCasco;
    private final List<Patente> patenteNecessaria = new ArrayList<Patente>();

    public Scooter(int id, double[] posizioneGPS, boolean affittato, double tariffa, float serbatoio, boolean haCasco, String targa, List<Patente> patenteNecessaria) {
        super(id,posizioneGPS,affittato,tariffa,serbatoio,targa,patenteNecessaria);
        this.haCasco = haCasco;
        patenteNecessaria.add(Patente.A);
        patenteNecessaria.add(Patente.B);
        this.tariffa=0.5;
    }

    public boolean isHaCasco() {
        return haCasco;
    }

    private addPatenti() {
        patenteNecessaria.add(Patente.A);
        patenteNecessaria.add(Patente.B);
    }
}
