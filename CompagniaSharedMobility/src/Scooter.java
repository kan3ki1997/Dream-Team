import java.util.*;

public class Scooter extends VeicoloBenzina{
    private boolean haCasco;
    Database database;

    public Scooter(int id, String targa, boolean haCasco) {
        super(id,new double [] {0,0},targa,100,0.05,new HashSet <> (Arrays.asList(Patente.A,Patente.B)));
        this.haCasco = haCasco;
    }

    public void registraScooter(Scooter scooter) {
        database.registrazioneScooter(scooter);
    }

    public void setHaCasco(boolean haCasco) {
        this.haCasco = haCasco;
    }
}
