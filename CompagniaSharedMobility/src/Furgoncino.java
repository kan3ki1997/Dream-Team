import java.util.List;

public class Furgoncino extends VeicoloBenzina{
    public Furgoncino(int id, double[] posizioneGPS, boolean affittato, double tariffa, float serbatoio,String targa, List<Patente> patenteNecessaria) {
        super(id,posizioneGPS,affittato,tariffa,serbatoio,targa,patenteNecessaria);
        patenteNecessaria.add(Patente.B);
    }
}
