import java.util.Set;

public class Furgoncino extends VeicoloBenzina {
   private final Set<Patente> patenteNecessaria;
   Database database;

   public Furgoncino(int id, double[] posizioneGPS, boolean affittato, double tariffa, float serbatoio, String targa) {
      super(id, posizioneGPS, affittato, tariffa, serbatoio, targa, patenteNecessaria);
      patenteNecessaria.add(Patente.B);
      database.registrazioneFurgoncino(this);
   }
}
