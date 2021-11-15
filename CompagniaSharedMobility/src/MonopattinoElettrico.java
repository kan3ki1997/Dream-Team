import java.util.List;

public class MonopattinoElettrico extends VeicoloElettrico{
    Database database;

    public MonopattinoElettrico() {
        super();
        this.tariffa = 0.15;
        database.registrazioneMonopattino(this);
    }

}
