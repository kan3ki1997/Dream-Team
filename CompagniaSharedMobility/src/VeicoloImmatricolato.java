import java.util.ArrayList;
import java.util.List;

public abstract class VeicoloImmatricolato extends Veicolo {
   private String targa;
   private List<Patente> patenteNecessaria = new ArrayList<Patente>();
}
