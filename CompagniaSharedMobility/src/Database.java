import java.util.ArrayList;
import java.util.List;

public class Database {
    private List <Utente> utenti = new ArrayList<Utente>();
    private List <Automobile> automobili = new ArrayList<Automobile>();
    private List <Scooter> scooters = new ArrayList<Scooter>();
    private List <Furgoncino> furgoncini = new ArrayList<Furgoncino>();
    private List <MonopattinoElettrico> monopattiniElettrici = new ArrayList<MonopattinoElettrico>();
    private List <Bici> biciclette = new ArrayList<Bici>();
    private List <Noleggio> noleggi = new ArrayList<Noleggio>();

    public Database() {
    }

    public List<Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(List<Utente> utenti) {
        this.utenti = utenti;
    }

    public List<Automobile> getAutomobili() {
        return automobili;
    }

    public void setAutomobili(List<Automobile> automobili) {
        this.automobili = automobili;
    }

    public List<Scooter> getScooters() {
        return scooters;
    }

    public void setScooters(List<Scooter> scooters) {
        this.scooters = scooters;
    }

    public List<Furgoncino> getFurgoncini() {
        return furgoncini;
    }

    public void setFurgoncini(List<Furgoncino> furgoncini) {
        this.furgoncini = furgoncini;
    }

    public List<MonopattinoElettrico> getMonopattiniElettrici() {
        return monopattiniElettrici;
    }

    public void setMonopattiniElettrici(List<MonopattinoElettrico> monopattiniElettrici) {
        this.monopattiniElettrici = monopattiniElettrici;
    }

    public List<Bici> getBiciclette() {
        return biciclette;
    }

    public void setBiciclette(List<Bici> biciclette) {
        this.biciclette = biciclette;
    }

    public List<Noleggio> getNoleggi() {
        return noleggi;
    }

    public void setNoleggi(List<Noleggio> noleggi) {
        this.noleggi = noleggi;
    }
}
