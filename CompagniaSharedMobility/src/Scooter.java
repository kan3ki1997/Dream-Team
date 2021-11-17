import java.util.*;

public class Scooter extends VeicoloBenzina{
    private boolean haCasco;
    Database database;

                                                                                // Arrays.asList é l'unico modo per aggiungere delle
    public Scooter(int id, String targa) {                     // patenti nel costruttore
        super(id,new double [] {0,0},targa,100,0.05,new HashSet <> (Arrays.asList(Patente.A,Patente.B)));
        this.haCasco = true;
    }

    public void registraScooter(Scooter scooter) {
        database.registrazioneScooter(scooter);
    }

    public void setHaCasco(boolean haCasco) {
        this.haCasco = haCasco;
    }
}