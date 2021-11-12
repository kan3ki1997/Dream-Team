import java.util.Date;

public class Utente {
   private String id;
   private final String nome;
   private final String cognome;
   private final Date dataNascita;
   private final String codiceFiscale;
   private float credito;
   Patente[] patenti;
   boolean casco;


   public Utente(String nome, String cognome, Date dataNascita, String codiceFiscale) {
      this.nome = nome;
      this.cognome = cognome;
      this.dataNascita = dataNascita;
      this.codiceFiscale = codiceFiscale;
      this.credito = 0.0f;
      this.casco = false;
   }

   public String getNome() {
      return nome;
   }

   public String getCognome() {
      return cognome;
   }

   public Date getDataNascita() {
      return dataNascita;
   }

   public String getCodiceFiscale() {
      return codiceFiscale;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getId() {
      return id;
   }

   public void setPatenti(Patente[] patenti) {
      this.patenti = patenti;
   }

   public Patente[] getPatenti() {
      return patenti;
   }

   public float getCredito() {
      return credito;
   }

   public void setCredito(float credito) {
      this.credito = credito;
   }

   public boolean hasCasco() {
      return casco;
   }

   public void setCasco(boolean casco) {
      this.casco = casco;
   }
}
