import java.util.ArrayList;
import java.util.List;

public abstract class VeicoloImmatricolato extends Veicolo {
   private final String targa;
   private final List<Patente> patenteNecessaria = new ArrayList<Patente>();

   // constructor
   public VeicoloImmatricolato(int id, double[] posizioneGPS, String targa, double tariffa, boolean affittato) {
      super(id, posizioneGPS, tariffa, affittato);
      this.targa = targa;

   }
}
