public class MonopattinoElettrico extends VeicoloElettrico{

    public MonopattinoElettrico(int id, double[] posizioneGPS, /*boolean affittato, */double tariffa, int batteria) {
        this.id = id;
        this.posizioneGPS = posizioneGPS;
        this.affittato = false; //Alla creazione di un veicolo, questo sarà sempre non affittato
        this.tariffa = tariffa;
        this.batteria = batteria;
    }

}
