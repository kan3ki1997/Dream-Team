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

    public void registrazioneUtente(Utente utente) {
        utenti.add(utente);
    }

    public void eliminaAuto(Automobile automobile) {
        automobili.remove(automobile);
    }

    public void eliminaScooter(Scooter scooter) {
        scooters.remove(scooter);
    }

    public void eliminaFurgoncino (Furgoncino furgoncino) {
        furgoncini.remove(furgoncino);
    }

    public void eliminaMonopattino (MonopattinoElettrico monopattinoElettrico) {
        monopattiniElettrici.remove(monopattinoElettrico);
    }

    public void eliminaBici (Bici bicicletta) {
        biciclette.remove(bicicletta);
    }

    public void inserisciAuto(Automobile automobile) {
        automobili.add(automobile);
    }

    public void inserisciScooter(Scooter scooter) {
        scooters.add(scooter);
    }

    public void inserisciFurgoncino (Furgoncino furgoncino) {
        furgoncini.add(furgoncino);
    }

    public void inserisciMonopattino (MonopattinoElettrico monopattinoElettrico) {
        monopattiniElettrici.add(monopattinoElettrico);
    }

    public void inserisciBici (Bici bicicletta) {
        biciclette.add(bicicletta);
    }

}
