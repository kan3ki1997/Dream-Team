import java.util.ArrayList;
import java.util.Set;

public abstract class VeicoloImmatricolato extends Veicolo {
   private String targa;
   private Set<Patente> patenteNecessaria ;

   public VeicoloImmatricolato(int id, double[] posizioneGPS, String targa,double tariffa, Set<Patente> patenteNecessaria) {
      super(id, posizioneGPS,tariffa);
      this.targa = targa;
      this.patenteNecessaria = patenteNecessaria;
   }

   public VeicoloImmatricolato(int id, double[] posizioneGPS ,double tariffa) {
      super(id, posizioneGPS,tariffa);
   }

}
