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
        this.batteria = 100;
    }

    public VeicoloElettrico(int id, double[] posizioneGPS, double tariffa) {
        super(id, posizioneGPS, tariffa);
        this.batteria = 100;
    }

    public int getBatteria(){
        return batteria;
    }
}
