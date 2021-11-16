import java.util.*;

public class Automobile extends VeicoloBenzina {
   Database database;

   // constructor
   public Automobile(int id, String targa) {
      super(id,new double [] {0,0},targa,100,0.05,new HashSet<>(Arrays.asList(Patente.A,Patente.B)));

   }

   public void registraAutomobile(Automobile automobile) {
      database.registrazioneAutomobile(automobile);
   }

}
