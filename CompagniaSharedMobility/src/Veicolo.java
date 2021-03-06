public class Veicolo {
   private int id;
   private double[] posizioneGPS;
   private boolean affittato;
   private double tariffa;

   // constructor
   public Veicolo(int id, double[] posizioneGPS,double tariffa) {
      this.id = id;
      this.posizioneGPS = posizioneGPS;
      this.tariffa = tariffa;
      this.affittato = false;
   }

   public Veicolo(double[] posizioneGPS) {
      this.posizioneGPS = posizioneGPS;
      this.tariffa = tariffa;
   }

    public Veicolo() {

    }

    // getters
   public int getId() {
      return id;
   }

   public boolean isAffittato() {
      return affittato;
   }

   public double getTariffa() {
      return tariffa;
   }

   public double[] getPosizioneGPS() {
      return posizioneGPS;
   }

   // setters
      /*
   @param id L'ID del veicolo
    */
   public void setId(int id) {
      this.id = id;
   }
   /*
   @param posizioneGPS La posizione GPS del veicolo (latitudine, longitudine)
    */
   public void setPosizioneGPS(double[] posizioneGPS) {
      this.posizioneGPS = posizioneGPS;
   }
   /*
   @param affittato Se il veicolo è affittato o meno
    */
   public void setAffittato(boolean affittato) {
      this.affittato = affittato;
   }
   /*
   @param tariffa Tariffa al minuto
    */
   public void setTariffa(double tariffa) {
      this.tariffa = tariffa;
   }
}
