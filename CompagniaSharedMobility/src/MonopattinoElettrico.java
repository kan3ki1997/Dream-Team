import java.util.List;

public class MonopattinoElettrico extends VeicoloElettrico{
    Database database;

    public MonopattinoElettrico() {
        //this.id = boh;
        //this.posizioneGPS = PosizioneGPS;

        super(); //batteria
        this.tariffa = 0.15;
        database.registrazioneMonopattino(this);
    }
}
