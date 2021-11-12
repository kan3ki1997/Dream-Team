import java.util.ArrayList;
import java.util.List;

public abstract class VeicoloImmatricolato extends Veicolo {
   private final String targa;
   private final List<Patente> patenteNecessaria = new ArrayList<Patente>();

   // constructor
   public VeicoloImmatricolato(int id, double[] posizioneGPS, boolean affittato, double tariffa, String targa, List<Patente> patenteNecessaria) {
      super(id, posizioneGPS, affittato, tariffa);
      this.targa = targa;

   }
}
