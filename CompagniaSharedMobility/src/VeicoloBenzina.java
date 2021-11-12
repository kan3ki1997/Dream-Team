public abstract class VeicoloBenzina extends VeicoloImmatricolato {
   private float serbatoio;

   public VeicoloBenzina(int ID,double[] PosizioneGPS,boolean Affitato,double tariffa,float serbatoio) {
      super(ID,PosizioneGPS,Affitato,tariffa,serbatoio);
      this.serbatoio = serbatoio;
   }

   public float getSerbatoio() {
      return serbatoio;
   }
}
