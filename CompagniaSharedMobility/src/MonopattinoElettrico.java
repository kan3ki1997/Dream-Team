import java.util.List;
import java.util.Set;

public class MonopattinoElettrico extends VeicoloElettrico{
    private double[] posizioneGPS;
    private Database database;

    public MonopattinoElettrico(int id, double[] posizioneGPS, double tariffa, int batteria) {
        super(id, posizioneGPS, 0.15, batteria);
        this.posizioneGPS = new double[]{0, 0};
    }

    public void registraMonopattino(MonopattinoElettrico monopattinoElettrico) {
        database.registrazioneMonopattino(monopattinoElettrico);
    }


}
