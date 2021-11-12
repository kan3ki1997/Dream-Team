import java.util.List;

public class MonopattinoElettrico extends VeicoloElettrico{

    public MonopattinoElettrico(int id, double[] posizioneGPS, String targa, Patente patenteNecessaria) {
        super(id, posizioneGPS, targa, patenteNecessaria);
        this.tariffa = 0.15;
    }

}
