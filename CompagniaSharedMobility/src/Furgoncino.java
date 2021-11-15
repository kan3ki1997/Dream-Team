import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Furgoncino extends VeicoloBenzina {


   Database database;


   public Furgoncino(int id, double[] posizioneGPS, float serbatoio, String targa) {
      super(id, posizioneGPS, targa, serbatoio, 0.12, new ArrayList<Patente>( Arrays.asList(Patente.A, Patente.B)));
   }

   public void registraFurgoncino(Furgoncino furgoncino) {
      database.registrazioneFurgoncino(furgoncino);
   }
}
