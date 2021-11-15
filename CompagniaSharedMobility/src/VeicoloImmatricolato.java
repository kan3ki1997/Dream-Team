import java.util.ArrayList;
import java.util.List;

public abstract class VeicoloImmatricolato extends Veicolo {
   private final String targa;
   private final List<Patente> patenteNecessaria = new ArrayList<Patente>();
}
