import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scooter extends VeicoloBenzina{
    private boolean haCasco;
    Database database;

    public Scooter(int id, double[] posizioneGPS, float serbatoio, boolean haCasco, String targa) {
        super(id,posizioneGPS,targa,serbatoio,0.05,new ArrayList<Patente>( Arrays.asList(Patente.A, Patente.B)));
        this.haCasco = haCasco;
        database.registrazioneScooter(this);

    }

    public void setHaCasco(boolean haCasco) {
        this.haCasco = haCasco;
    }
}
