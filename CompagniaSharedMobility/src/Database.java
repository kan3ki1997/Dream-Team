import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Set;

public class Database {
   private HashMap<String, int> utenti;
   private HashMap<String, int> automobili;
   private HashMap<String, int> scooters;
   private HashMap<String, int> furgoncini;
   private HashMap<String, int> monopattiniElettrici;
   private HashMap<String, int> biciclette;
   private Set<int> noleggi;

   public Database() {

   }

   public void registrazioneUtente(Utente utente) {
      utenti.add(utente);
   }

   public boolean cercaUtente(Utente utente) {
      int index = utenti.indexOf(utente);
      if (index == -1)
         return false;
      return true;
   }

   public void eliminaAuto(Automobile automobile) {
      automobili.remove(automobile);
   }

   public void eliminaScooter(Scooter scooter) {
      scooters.remove(scooter);
   }

   public void eliminaFurgoncino(Furgoncino furgoncino) {
      furgoncini.remove(furgoncino);
   }

   public void eliminaMonopattino(MonopattinoElettrico monopattinoElettrico) {
      monopattiniElettrici.remove(monopattinoElettrico);
   }

   public void eliminaBici(Bici bicicletta) {
      biciclette.remove(bicicletta);
   }

   public void inserisciAuto(Automobile automobile) {
      automobili.add(automobile);
   }

   public void inserisciScooter(Scooter scooter) {
      scooters.add(scooter);
   }

   public void inserisciFurgoncino(Furgoncino furgoncino) {
      furgoncini.add(furgoncino);
   }

   public void inserisciMonopattino(MonopattinoElettrico monopattinoElettrico) {
      monopattiniElettrici.add(monopattinoElettrico);
   }

   public void inserisciBici(Bici bicicletta) {
      biciclette.add(bicicletta);
   }

}
