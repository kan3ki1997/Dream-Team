import java.util.ArrayList;
import java.util.List;

public class Automobile extends VeicoloBenzina {
    private List<Patente> patenteNecessaria = new ArrayList<Patente>();

    public Automobile() {
        patenteNecessaria.add(Patente.B);
    }

}
