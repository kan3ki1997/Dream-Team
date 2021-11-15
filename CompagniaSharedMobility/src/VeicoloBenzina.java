import java.util.List;

public abstract class VeicoloBenzina extends VeicoloImmatricolato {
   private float serbatoio;


   public float getSerbatoio() {
      return serbatoio;
   }

   /*
   @param serbatoio Quanto è pieno il serbatoio, in percentuale
    */
   public void setSerbatoio(float serbatoio) {
      this.serbatoio = serbatoio;
   }
}
