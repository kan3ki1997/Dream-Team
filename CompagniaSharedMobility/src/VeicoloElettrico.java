import java.util.List;

public abstract class VeicoloElettrico extends VeicoloImmatricolato{
    private int batteria;

    public VeicoloElettrico(int id, double[] posizioneGPS, String targa, int batteria,double tariffa,List<Patente> patenteNecessaria) {
        super(id, posizioneGPS, targa,tariffa,patenteNecessaria);
        this.batteria = batteria;
    }

    public int getBatteria(){
        return batteria;
    }
}
