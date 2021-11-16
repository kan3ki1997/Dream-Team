import java.util.*;

public class Main {

    public static void main(String[] args) {
      HashSet<Automobile> automobili = new HashSet<Automobile>();
      HashSet<Scooter> scooters = new HashSet<Scooter>();
      HashSet<Furgoncino> furgoncini = new HashSet<Furgoncino>();
      HashSet<MonopattinoElettrico> monopattini = new HashSet<MonopattinoElettrico>();
      HashSet<Bici> bici = new HashSet<Bici>();
      HashSet<Utente> utenti = new HashSet<Utente>();
      Database database = new Database();

      /*Automobile ferrari = new Automobile (2, PosizioneIniziale, false, 25.0, 30.0f, "AA000AA");
      Furgoncino piaggioPorter = new Furgoncino(3, PosizioneIniziale, false, 2, 30.0f, "BB123CC");*/

   }

   public void addAutomobile(HashSet automobili){
       Scanner sc = new Scanner(System.in);
       int id = automobili.size() + 1;
       System.out.print("Targa: ");
       String targa = sc.nextLine();
       automobili.add(new Automobile(id, targa));
   }

    public void addScooter(HashSet scooters){
        Scanner sc = new Scanner(System.in);
        int id = scooters.size() + 1;
        System.out.print("Targa: ");
        String targa = sc.nextLine();
        boolean haCasco = false;

        /**
         * O metti la risposta giusta o non uscirai mai più da questo loop infernale.
         */
        String risposta = "";
        while(!risposta.equals("s") && !risposta.equals("n"))
        {
            System.out.print("Hai un casco? (s/n): ");
            String rispostaTemp = sc.nextLine();
            risposta = rispostaTemp.toLowerCase();
            if(!risposta.equals("s") && !risposta.equals("n"))
                System.out.println("Scelta non corretta. Scrivi <s> per Sì e <n> per No.");
            //e che famo se ha il casco o meno?
        }
        if (risposta == "s")
            haCasco = true;
        else
            haCasco = false;

        scooters.add(new Scooter(id, targa, haCasco));
    }

    public void addFurgoncino(HashSet furgoncino) {
        Scanner sc = new Scanner(System.in);
        int id = furgoncino.size() + 1;
        System.out.print("Targa: ");
        String targa = sc.nextLine();
        furgoncino.add(new Furgoncino(id, targa));
    }

    public void addMonopattino(HashSet monopattini) {
        int id = monopattini.size() + 1;
        double[] posizioneGPS = new double[]{0,0};
        monopattini.add(new MonopattinoElettrico(id, posizioneGPS));
    }

    public void addBici(HashSet bici) {
        int id = bici.size() + 1;
        bici.add(new Bici(id));
    }

    public void addUtente(HashSet utenti) {
        //String nome, String cognome, Date dataNascita, String codiceFiscale, Set<Patente> patenti
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Cognome: ");
        String cognome = sc.nextLine();
        System.out.print("Data di nascita: GG/MM/AAAA: ");
        String dataNascita = sc.nextLine();
        System.out.print("Codice fiscale: ");
        String codiceFiscale = sc.nextLine();
        HashSet <Patente> patentiUtente = new HashSet<Patente>();
        System.out.print("Patente A presente? (y/n): ");
        String p = sc.nextLine();
        if (p == "y")
            patentiUtente.add(Patente.A);
        else if(!p.equals("y") && !p.equals("n"))
            System.out.println("Scelta non corretta. Scrivi <y> per Sì e <n> per No.");
        System.out.print("Patente B presente? (y/n): ");
        p = sc.nextLine();
        if (p == "y")
            patentiUtente.add(Patente.B);
        else if(!p.equals("y") && !p.equals("n"))
            System.out.println("Scelta non corretta. Scrivi <y> per Sì e <n> per No.");
        if (patentiUtente == null)
            patentiUtente.add(Patente.nisba);
        utenti.add(new Utente(nome, cognome, dataNascita, codiceFiscale, patentiUtente));
    }

}