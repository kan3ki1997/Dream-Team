import java.util.ArrayList;

public class Main {
    double[] POSIZIONEINIZIALE = {0,0};

   public static void main(String[] args) {
      ArrayList<Automobile> automobili = new ArrayList<Automobile>();
      ArrayList<Scooter> scooter = new ArrayList<Scooter>();
      ArrayList<Furgoncino> furgoncini = new ArrayList<Furgoncino>();
      ArrayList<MonopattinoElettrico> monopattini = new ArrayList<MonopattinoElettrico>();
      ArrayList<Bici> bici = new ArrayList<Bici>();
      ArrayList<Utente> utenti = new ArrayList<Utente>();

   }

   /*
   @param monopattini La lista dei monopattini
    */
   public void addMonopattino(ArrayList monopattini) {
      int indice = monopattini.size();
      int id = monopattini.size() + 1;
      double[] posizioneGPS = {0, 0};
      //monopattini.add(new MonopattinoElettrico(monopattini.size() + 1, posizioneGPS, ));
   }
}