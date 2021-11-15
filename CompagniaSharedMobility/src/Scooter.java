import java.util.ArrayList;
import java.util.List;

public class Scooter extends VeicoloBenzina{
    private boolean haCasco;
    private final List<Patente> patenteNecessaria = new ArrayList<Patente>();
    Database database;

    public Scooter(int id, double[] posizioneGPS, boolean affittato, double tariffa, float serbatoio, boolean haCasco, String targa, List<Patente> patenteNecessaria) {
        super(id,posizioneGPS,targa,serbatoio,tariffa,patenteNecessaria);
        patenteNecessaria.add(Patente.A);
        patenteNecessaria.add(Patente.B);
        database.registrazioneScooter(this);

        this.haCasco = haCasco;
        this.tariffa=0.5;
    }

    public boolean isHaCasco() {
        return haCasco;
    }


}
