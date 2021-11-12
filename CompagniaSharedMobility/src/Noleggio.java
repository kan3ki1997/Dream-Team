import java.util.Date;

public class Noleggio {

    private Utente utente;
    private Veicolo veicolo;
    private Database database;
    private Date dataInizio;
    private Date dataFine;

    public Noleggio(Utente utente, Veicolo veicolo, Date dataInizio, Date dataFine) {
        this.utente = utente;
        this.veicolo = veicolo;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    // metodi
    public void registraUtente() {
        database.getUtenti(this.utente);

    }

    public void loginUtente() {

    }

    public boolean veicoliDisponibili() {
        boolean veicoloDisponibile;
        if (this.veicolo.affittato != false) veicoloDisponibile = false;

        if (this.veicolo instanceof VeicoloBenzina) {

        }
        return false;
    }

    public void affittoVeicolo() {

    }

    public void fineNoleggio() {

    }

    // getters and setters

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataFine() {
        return dataFine;
    }

    public void setDataFine(Date dataFine) {
        this.dataFine = dataFine;
    }
}
