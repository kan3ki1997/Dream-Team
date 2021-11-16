public class Bici extends VeicoloNonImmatricolato{
    boolean haCasco;
    Database database;

    public Bici(int id) {
        super(id, new double [] {0,0},0.02);
        this.haCasco = true;
    }

    public void registrazioneBici(Bici bici) {
        database.registrazioneBici(bici);
    }

    public boolean isHaCasco() {
        return haCasco;
    }
    /*
    @param haCasco True se ha casco, false se non lo ha
     */
    public void setHaCasco(boolean haCasco) {
        this.haCasco = haCasco;
    }
}
