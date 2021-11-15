import java.util.*;

public class Furgoncino extends VeicoloBenzina {


   Database database;


   public Furgoncino(int id, String targa) {
      super(id,new double [] {0,0},targa,100,0.05,new HashSet <> (Arrays.asList(Patente.B)));
   }

   public void registraFurgoncino(Furgoncino furgoncino) {
      database.registrazioneFurgoncino(furgoncino);
   }
}
