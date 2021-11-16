import java.util.List;
import java.util.Set;

public abstract class VeicoloElettrico extends VeicoloImmatricolato{
    private int batteria;

    /*public VeicoloElettrico(int id, double[] posizioneGPS, String targa, int batteria,double tariffa,List<Patente> patenteNecessaria) {
        super(id, posizioneGPS, targa,tariffa,patenteNecessaria);
        this.batteria = batteria;
    }*/

    public VeicoloElettrico(int id, double[] posizioneGPS, String targa,double tariffa, Set<Patente> patenteNecessaria) {
        super(id, posizioneGPS,targa, tariffa, patenteNecessaria);
    }

    public VeicoloElettrico(int id, double[] posizioneGPS, double tariffa, int batteria) {
        super(id, posizioneGPS, tariffa);
    }

    public int getBatteria(){
        return batteria;
    }
}
