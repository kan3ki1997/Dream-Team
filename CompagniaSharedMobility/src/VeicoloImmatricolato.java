import java.util.ArrayList;
import java.util.List;

public abstract class VeicoloImmatricolato extends Veicolo {
   private String targa;
   private List<Patente> patenteNecessaria ;

   public VeicoloImmatricolato(int id, double[] posizioneGPS, String targa,double tariffa,List<Patente> patenteNecessaria) {
      super(id, posizioneGPS,tariffa);
      this.targa = targa;
      this.patenteNecessaria=patenteNecessaria;
   }

   public VeicoloImmatricolato() {
      super();
      this.targa = targa;
      this.patenteNecessaria = patenteNecessaria;
   }
}
