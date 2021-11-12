public abstract class Veicolo {
   int id;
   double[] posizioneGPS;
   boolean affittato;
   double tariffa;

   public Veicolo(int id, double[] posizioneGPS, boolean affittato, double tariffa) {
      this.id = id;
      this.posizioneGPS = posizioneGPS;
      this.tariffa = tariffa;
   }

   // getters
   public int getId() {
      return id;
   }

   public double[] getPosizioneGPS() {
      return posizioneGPS;
   }

   public boolean isAffittato() {
      return affittato;
   }

   public double getTariffa() {
      return tariffa;
   }

   // setters

   public void setId(int id) {
      this.id = id;
   }

   public void setPosizioneGPS(double[] posizioneGPS) {
      this.posizioneGPS = posizioneGPS;
   }

   public void setAffittato(boolean affittato) {
      this.affittato = affittato;
   }

   public void setTariffa(double tariffa) {
      this.tariffa = tariffa;
   }
}
