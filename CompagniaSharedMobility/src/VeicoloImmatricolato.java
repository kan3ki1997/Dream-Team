import java.util.ArrayList;
import java.util.List;

public class VeicoloImmatricolato extends Veicolo {
   private String targa;
   private List<Patente> patenteNecessaria = new ArrayList<Patente>();

   public VeicoloImmatricolato(int id, double[] posizioneGPS, boolean affittato, double tariffa,String targa,List<Patente> patenteNecessaria) {
      super(id, posizioneGPS, affittato, tariffa);
      this.targa=targa;
      this.patenteNecessaria=patenteNecessaria;
   }
}
