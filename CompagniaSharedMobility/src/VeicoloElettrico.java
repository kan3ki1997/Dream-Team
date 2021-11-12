import java.util.List;

public abstract class VeicoloElettrico extends VeicoloImmatricolato{
    int batteria;

    public VeicoloElettrico(int id, double[] posizioneGPS, boolean affittato, double tariffa, String targa, List<Patente> patenteNecessaria) {
        super(id, posizioneGPS, affittato, tariffa, targa, patenteNecessaria);
    }

    public int getBatteria(){
        return batteria;
    }

    public void setBatteria(int batteria){
        this.batteria = batteria;
    }
}
