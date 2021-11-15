import java.util.ArrayList;
import java.util.List;

public abstract class VeicoloImmatricolato extends Veicolo {
   private final String targa;
   private final List<Patente> patenteNecessaria = new ArrayList<Patente>();

   public VeicoloImmatricolato(int id, double[] posizioneGPS, String targa) {
      super(id, posizioneGPS);
      this.targa = targa;
   }
}
