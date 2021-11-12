import java.util.List;

public abstract class VeicoloElettrico extends VeicoloImmatricolato{
    private int batteria;

    public VeicoloElettrico(int id, double[] posizioneGPS, boolean affittato, double tariffa, String targa, List<Patente> patenteNecessaria, int batteria) {
        super(id, posizioneGPS, affittato, tariffa, targa, patenteNecessaria);
        this.batteria = batteria;
    }

    public int getBatteria(){
        return batteria;
    }
}
