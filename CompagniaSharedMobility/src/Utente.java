import java.util.Date;
import java.util.HashMap;

public class Utente {
   private int id;
   private final String nome;
   private final String cognome;
   private final Date dataNascita;
   private final String codiceFiscale;
   private float credito;
   Patente[] patenti;
   boolean casco;
   Database database;


   public Utente(String nome, String cognome, Date dataNascita, String codiceFiscale) {
      this.nome = nome;
      this.cognome = cognome;
      this.dataNascita = dataNascita;
      this.codiceFiscale = codiceFiscale;
      this.credito = 0.0f;
      this.casco = false;
      database.registrazioneUtente(this);
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

   public void setId(int id) {
      this.id = id;
   }

   public int getId() {
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
