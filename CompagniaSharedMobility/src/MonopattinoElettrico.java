import java.util.List;

public class MonopattinoElettrico extends VeicoloElettrico {

   public MonopattinoElettrico(int id, double[] posizioneGPS, boolean affittato, double tariffa, String targa, List<Patente> patenteNecessaria, int batteria) {
      super(id, posizioneGPS, affittato, tariffa, targa, patenteNecessaria, batteria);
   }

}
