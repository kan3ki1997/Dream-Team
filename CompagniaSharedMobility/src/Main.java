import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      ArrayList<Automobile> automobili = new ArrayList<Automobile>();
      ArrayList<Scooter> scooter = new ArrayList<Scooter>();
      ArrayList<Furgoncino> furgoncini = new ArrayList<Furgoncino>();
      ArrayList<MonopattinoElettrico> monopattini = new ArrayList<MonopattinoElettrico>();
      ArrayList<Bici> bici = new ArrayList<Bici>();
      ArrayList<Utente> utenti = new ArrayList<Utente>();
      Database database = new Database();
      double[] PosizioneIniziale = {0,0};

      Automobile ferrari = new Automobile (2, PosizioneIniziale, false, 25.0, 30.0f, "AA000AA");
      Furgoncino piaggioPorter = new Furgoncino(3, PosizioneIniziale, false, 2, 30.0f, "BB123CC");

   }

   /*
   @param monopattini La lista dei monopattini
    */
   public void addMonopattino(ArrayList monopattini) {
      int indice = monopattini.size();
      int id = monopattini.size() + 1;
      double[] posizioneGPS = {0, 0};
       monopattini.add(new MonopattinoElettrico(id, posizioneGPS));
   }
}