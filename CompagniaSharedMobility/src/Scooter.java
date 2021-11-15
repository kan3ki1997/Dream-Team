import java.util.Set;

public class Scooter extends VeicoloBenzina{
    private boolean haCasco;
    private final Set<Patente> patenteNecessaria;
    Database database;

    public Scooter(int id, double[] posizioneGPS, boolean affittato, double tariffa, float serbatoio, boolean haCasco, String targa, Set<Patente> patenteNecessaria) {
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
