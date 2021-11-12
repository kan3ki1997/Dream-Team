import java.util.List;

public abstract class VeicoloBenzina extends VeicoloImmatricolato {
   private float serbatoio;

   public VeicoloBenzina(int id, double[] posizioneGPS, boolean affittato, double tariffa, float serbatoio, String targa, List<Patente> patenteNecessaria) {
      super(id,posizioneGPS,affittato,tariffa,targa,patenteNecessaria);
      this.serbatoio = serbatoio;
   }

   public float getSerbatoio() {
      return serbatoio;
   }
}
