import java.util.ArrayList;
import java.util.List;

public class Automobile extends VeicoloBenzina {
   private final List<Patente> patenteNecessaria = new ArrayList<Patente>();

   // constructor
   public Automobile(int id, double[] posizioneGPS, boolean affittato, double tariffa,
                     float serbatoio, String targa) {
      super(id, posizioneGPS, affittato, tariffa, serbatoio, targa, patenteNecessaria);
      patenteNecessaria.add(Patente.B);
   }

}
