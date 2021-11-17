import java.util.HashMap;
import java.util.Set;

public class Database {
   private HashMap<Integer, String> utenti;
   private Set<Integer> automobili;
   private Set<Integer> scooters;
   private Set<Integer> furgoncini;
   private Set<Integer> monopattiniElettrici;
   private Set<Integer> biciclette;
   private Set<Integer> noleggi;

   public Database() {
   }
   public void registrazioneUtente(Utente utente) {
      utenti.put(utente.getId(), utente.getCognome());
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

   public boolean cercaUtente(int id) {
      boolean Search = utenti.containsKey(id);
      return Search;
   }

   public boolean cercaAutomobile(Automobile automobile) {
      boolean Search = automobili.contains(automobile);
      return Search;
   }

   public boolean cercaBici(Bici bici) {
      boolean Search = biciclette.contains(bici);
      return Search;
   }

   public boolean cercaFurgoncino(Furgoncino furgoncino) {
      boolean Search = furgoncini.contains(furgoncino);
      return Search;
   }

   public boolean cercaMonopattino(MonopattinoElettrico monopattinoElettrico) {
      boolean Search = monopattiniElettrici.contains(monopattinoElettrico);
      return Search;
   }

   public boolean cercaScooter(Scooter scooter) {
      boolean Search = scooters.contains(scooter);
      return Search;
   }

   public boolean cercaNoleggio(Noleggio noleggio) {
      boolean Search = noleggi.contains(noleggio);
      return Search;
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
      automobili.add(automobile.getId());
   }

   public void inserisciScooter(Scooter scooter) {
      scooters.add(scooter.getId());
   }

   public void inserisciFurgoncino(Furgoncino furgoncino) {
      furgoncini.add(furgoncino.getId());
   }

   public void inserisciMonopattino(MonopattinoElettrico monopattinoElettrico) {
      monopattiniElettrici.add(monopattinoElettrico.getId());
   }

   public void inserisciBici(Bici bicicletta) {
      biciclette.add(bicicletta.getId());
   }

   public HashMap<String, Integer> getUtenti() {
      return utenti;
   }
}
