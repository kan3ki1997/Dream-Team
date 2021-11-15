import java.util.List;

public class MonopattinoElettrico extends VeicoloElettrico{
    private double[] posizioneGPS;
    private Database database;

    public MonopattinoElettrico(int id) {
        super(); //batteria
        super.setTariffa(0.15);
        this.posizioneGPS = new double[]{0, 0};
    }

    public void registraMonopattino(MonopattinoElettrico monopattinoElettrico) {
        database.registrazioneMonopattino(monopattinoElettrico);
    }


}
