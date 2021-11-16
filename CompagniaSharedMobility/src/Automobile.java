import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Automobile extends VeicoloBenzina {
   Database database;

   // constructor
   public Automobile(int id, double[] posizioneGPS, String targa, float serbatoio, double tariffa, Set<Patente> patenteNecessaria) {
      super(id, posizioneGPS, targa, serbatoio, tariffa, patenteNecessaria);
      patenteNecessaria.add(Patente.B);
   }

   public void registraAutomobile(Automobile automobile) {
      database.registrazioneAutomobile(automobile);
   }

}
