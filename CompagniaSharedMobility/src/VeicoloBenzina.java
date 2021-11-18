import java.util.List;
import java.util.Set;

public class VeicoloBenzina extends VeicoloImmatricolato {
   private float serbatoio;

   public VeicoloBenzina(int id, double[] posizioneGPS, String targa, float serbatoio, double tariffa, Set <Patente> patenteNecessaria) {
      super(id, posizioneGPS, targa,tariffa,patenteNecessaria);
      this.serbatoio = serbatoio;
   }

   public float getSerbatoio() {
      return serbatoio;
   }

   /*
   @param serbatoio Quanto è pieno il serbatoio, in percentuale
    */
   public void setSerbatoio(float serbatoio) {
      if (serbatoio >= 0 && serbatoio <= 100)     //Forzo i valori entro un certo range (0-100%)
      this.serbatoio = serbatoio;
   }
}
