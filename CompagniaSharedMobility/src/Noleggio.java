import java.util.Date;

public class Noleggio {

   private Utente utente;
   private Veicolo veicolo;
   private Database database;
   private Date dataInizio;
   private Date dataFine;
   private int id;

   public Noleggio(Utente utente, Veicolo veicolo, Date dataInizio, Date dataFine, int id) {
      this.utente = utente;
      this.veicolo = veicolo;
      this.dataInizio = dataInizio;
      this.dataFine = dataFine;
      this.id = id;
   }

   // metodi
   public void registraUtente(Utente utente) {
      database.registrazioneUtente(utente);
   }

   public void registraNoleggio(Noleggio noleggio) {
      database.registrazioneNoleggio(noleggio);
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void loginUtente() {
      if (!database.cercaUtente(utente)) System.out.println("utente non registrato");
      else System.out.println("login effettuato con successo");
   }

   public boolean veicoliDisponibili() {
      if (this.veicolo instanceof VeicoloBenzina && ((VeicoloBenzina) this.veicolo).getSerbatoio() < 10) return false; // serbatoio non sufficente
      else if (this.veicolo.isAffittato() == true) return false; // il veicolo è affittato
      else if (this.veicolo instanceof Scooter || this.veicolo instanceof Bici && !this.utente.hasCasco()){
         return false;
      }
      else return true;
   }

   public void affittoVeicolo() {
      this.veicolo.setAffittato(true);
      setDataInizio(dataInizio);

   }

   public void fineNoleggio() {
      this.veicolo.setAffittato(false);
      setDataFine(dataFine);
   }

   // getters and setters

   public Utente getUtente() {
      return utente;
   }

   /*
   @param utente L'utente che noleggia il veicolo
    */
   public void setUtente(Utente utente) {
      this.utente = utente;
   }

   public Veicolo getVeicolo() {
      return veicolo;
   }

   /*
   @param veicolo Il veicolo da noleggiare
    */
   public void setVeicolo(Veicolo veicolo) {
      this.veicolo = veicolo;
   }

   public Date getDataInizio() {
      return dataInizio;
   }

   /*
   @param dataInizio Data inizio noleggio
    */
   public void setDataInizio(Date dataInizio) {
      this.dataInizio = dataInizio;
   }

   public Date getDataFine() {
      return dataFine;
   }

   /*
   @param dataFine Data fine noleggio
    */
   public void setDataFine(Date dataFine) {
      this.dataFine = dataFine;
   }
}
