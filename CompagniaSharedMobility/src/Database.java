import java.util.HashMap;
import java.util.Set;

public class Database {
   private HashMap<String, Integer> utenti;
   private Set<Integer> automobili;
   private Set<Integer> scooters;
   private Set<Integer> furgoncini;
   private Set<Integer> monopattiniElettrici;
   private Set<Integer> biciclette;
   private Set<Integer> noleggi;

   public Database() {
   }

   public void registrazioneUtente(Utente utente) {
      utenti.put(utente.getCognome(), utente.getId());
   }

   public void registrazioneAutomobile(Automobile automobile) {
      automobili.add(automobile.getId());
   }

   public void registrazioneFurgoncino(Furgoncino furgoncino) {
      scooters.add(furgoncino.getId());
   }

   public void registrazioneMonopattino(MonopattinoElettrico monopattinoElettrico) {
      scooters.add(monopattinoElettrico.getId());
   }

   public void registrazioneBici(Bici bici) {
      scooters.add(bici.getId());
   }

   public void registrazioneScooter(Scooter scooter) {
      scooters.add(scooter.getId());
   }

   public void registrazioneNoleggio(Noleggio noleggio) {
      scooters.add(noleggio.getId());
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
