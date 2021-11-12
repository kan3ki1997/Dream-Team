import java.util.List;

public abstract class VeicoloElettrico extends VeicoloImmatricolato{
    private int batteria;

    public VeicoloElettrico(int id, double[] posizioneGPS, String targa, Patente patenteNecessaria) {
        super(id, posizioneGPS, targa, patenteNecessaria);
        this.batteria = 100;
    }

    public int getBatteria(){
        return batteria;
    }
}
