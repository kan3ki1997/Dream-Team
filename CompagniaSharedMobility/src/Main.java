import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Automobile> automobili = new ArrayList<Automobile>();
        ArrayList<Scooter> scooter = new ArrayList<Scooter>();
        ArrayList<Furgoncino> furgoncini = new ArrayList<Furgoncino>();
        ArrayList<MonopattinoElettrico> monopattini = new ArrayList<MonopattinoElettrico>();
        ArrayList<Bici> bici = new ArrayList<Bici>();
        ArrayList<Utente> utenti = new ArrayList<Utente>();
    }

    public void addMonopattino(ArrayList monopattini){
        int indice = monopattini.size();
        int id = monopattini.size() + 1;
        double[] posizioneGPS = {0,0};
        monopattini.add(new MonopattinoElettrico(monopattini.size() + 1, posizioneGPS, "null", Patente.nisba));
    }
}