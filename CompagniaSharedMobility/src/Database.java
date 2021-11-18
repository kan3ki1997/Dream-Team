import java.util.HashMap;
import java.util.Set;

public class Database {
   private HashMap<Integer, Utente> utenti;
   private HashMap<Integer, Automobile> automobili;
   private HashMap<Integer, Scooter> scooters;
   private HashMap<Integer, Furgoncino> furgoncini;
   private HashMap<Integer, MonopattinoElettrico> monopattiniElettrici;
   private HashMap<Integer, Bici> biciclette;
   private HashMap<Integer, Noleggio> noleggi;

   public Database() {
   }
   public void registrazioneUtente(Utente utente) {
      utenti.put(utente.getId(), utente);
   }

   public void registrazioneAutomobile(Automobile automobile) {
      automobili.put(automobile.getId(), automobile);
   }

   public void registrazioneFurgoncino(Furgoncino furgoncino) {
      furgoncini.put(furgoncino.getId(), furgoncino);
   }

   public void registrazioneMonopattino(MonopattinoElettrico monopattinoElettrico) {
      monopattiniElettrici.put(monopattinoElettrico.getId(), monopattinoElettrico);
   }

   public void registrazioneBici(Bici bici) {
      biciclette.put(bici.getId(), bici);
   }

   public void registrazioneScooter(Scooter scooter) {
      scooters.put(scooter.getId(), scooter);
   }

   public void registrazioneNoleggio(Noleggio noleggio) {
      noleggi.put(noleggio.getId(), noleggio);
   }

   public boolean cercaUtente(int id) {
      boolean Search = utenti.containsKey(id);
      return Search;
   }

   public boolean cercaAutomobile(Automobile automobile) {
      boolean Search = automobili.containsKey(automobile.getId());
      return Search;
   }

   public boolean cercaBici(Bici bici) {
      boolean Search = biciclette.containsKey(bici.getId());
      return Search;
   }

   public boolean cercaFurgoncino(Furgoncino furgoncino) {
      boolean Search = furgoncini.containsKey(furgoncino.getId());
      return Search;
   }

   public boolean cercaMonopattino(MonopattinoElettrico monopattinoElettrico) {
      boolean Search = monopattiniElettrici.containsKey(monopattinoElettrico.getId());
      return Search;
   }

   public boolean cercaScooter(Scooter scooter) {
      boolean Search = scooters.containsKey(scooter.getId());
      return Search;
   }

   public boolean cercaNoleggio(Noleggio noleggio) {
      boolean Search = noleggi.containsKey(noleggio.getId());
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
      automobili.put(automobile.getId(), automobile);
   }

   public void inserisciScooter(Scooter scooter) {
      scooters.put(scooter.getId(), scooter);
   }

   public void inserisciFurgoncino(Furgoncino furgoncino) {
      furgoncini.put(furgoncino.getId(), furgoncino);
   }

   public void inserisciMonopattino(MonopattinoElettrico monopattinoElettrico) {
      monopattiniElettrici.put(monopattinoElettrico.getId(), monopattinoElettrico);
   }

   public HashMap<Integer, Automobile> getAutomobili() {
      return automobili;
   }

   public HashMap<Integer, Scooter> getScooters() {
      return scooters;
   }

   public HashMap<Integer, Furgoncino> getFurgoncini() {
      return furgoncini;
   }

   public HashMap<Integer, MonopattinoElettrico> getMonopattiniElettrici() {
      return monopattiniElettrici;
   }

   public HashMap<Integer, Bici> getBiciclette() {
      return biciclette;
   }

   public HashMap<Integer, Noleggio> getNoleggi() {
      return noleggi;
   }

   public void inserisciBici(Bici bicicletta) {
      biciclette.put(bicicletta.getId(), bicicletta);
   }

   public HashMap<Integer, Utente> getUtenti() {
      return utenti;
   }


}
