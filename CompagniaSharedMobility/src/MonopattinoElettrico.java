import java.util.List;
import java.util.Set;

public class MonopattinoElettrico extends VeicoloElettrico{
    private double[] posizioneGPS;
    private Database database;

    public MonopattinoElettrico(int id, double[] posizioneGPS) {
        super(id, posizioneGPS, 0.15);
    }

    public void registraMonopattino(MonopattinoElettrico monopattinoElettrico) {
        database.registrazioneMonopattino(monopattinoElettrico);
    }


}
