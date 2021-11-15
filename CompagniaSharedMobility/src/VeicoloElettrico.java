import java.util.List;

public abstract class VeicoloElettrico extends VeicoloImmatricolato{
    private int batteria;

    public VeicoloElettrico() {
    }

    public int getBatteria(){
        return batteria;
    }
}
