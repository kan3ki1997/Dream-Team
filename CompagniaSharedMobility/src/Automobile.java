import java.util.ArrayList;
import java.util.Set;

public class Automobile extends VeicoloBenzina {
   private final Set<Patente> patenteNecessaria;
   Database database;

   // constructor
   public Automobile(int id, double[] posizioneGPS, boolean affittato, double tariffa,
                     float serbatoio, String targa) {
      super(id, posizioneGPS, affittato, tariffa, serbatoio, targa, patenteNecessaria);
      patenteNecessaria.add(Patente.B);
   }

   public void registraAutomobile(Automobile automobile) {
      database.registrazioneAutomobile(automobile);
   }

}
