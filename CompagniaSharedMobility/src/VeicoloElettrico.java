import java.util.List;

public abstract class VeicoloElettrico extends VeicoloImmatricolato{
    private int batteria;

    public VeicoloElettrico(int id, double[] posizioneGPS, String targa, int batteria) {
        super(id, posizioneGPS, targa);
        this.batteria = batteria;
    }

    public int getBatteria(){
        return batteria;
    }
}
