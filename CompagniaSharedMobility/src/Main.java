import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Automobile> automobili = new HashMap<Integer, Automobile>();
        HashMap<Integer, Scooter> scooters = new HashMap<Integer, Scooter>();
        HashMap <Integer, Furgoncino> furgoncini = new HashMap<Integer, Furgoncino>();
        HashMap<Integer, MonopattinoElettrico> monopattini = new HashMap<Integer, MonopattinoElettrico>();
        HashMap<Integer, Bici> bici = new HashMap<Integer, Bici>();
        HashMap<Integer, Utente> utenti = new HashMap<Integer, Utente>();
        HashMap<Integer, Noleggio> noleggi = new HashMap<Integer, Noleggio>();
        Database database = new Database();

        Menu.MenuPrincipale();

   }

   public static void addAutomobile(HashMap automobili){
       Scanner sc = new Scanner(System.in);
       int id = automobili.size() + 1;
       System.out.print("Targa: ");
       String targa = sc.nextLine();
       Automobile automobile = new Automobile(id, targa);
       automobili.put(id, automobile);
       automobile.registraAutomobile(automobile);
   }

   public static void addScooter(HashMap scooters){
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

        Scooter scooter = new Scooter(id, targa);
        scooters.put(id, scooter);
        scooter.registraScooter(scooter);

    }

   public static void addFurgoncino(HashMap furgoncini) {
        Scanner sc = new Scanner(System.in);
        int id = furgoncini.size() + 1;
        System.out.print("Targa: ");
        String targa = sc.nextLine();
        Furgoncino furgoncino = new Furgoncino(id, targa);
        furgoncini.put(id, furgoncino);
        furgoncino.registraFurgoncino(furgoncino);

    }

   public static void addMonopattino(HashMap monopattini) {
        int id = monopattini.size() + 1;
        double[] posizioneGPS = new double[]{0,0};
        MonopattinoElettrico monopattino = new MonopattinoElettrico(id, posizioneGPS);
        monopattini.put(id, monopattino);
        monopattino.registraMonopattino(monopattino);

    }

   public static void addBici(HashMap bici) {
        int id = bici.size() + 1;
        Bici bicicletta = new Bici(id);
        bici.put(id, bicicletta);
        bicicletta.registrazioneBici(bicicletta);

    }

   public static void menu() {
        int scelta = 0;
        Menu.MenuPrincipale();
    }

   public static void addUtente(){
       Scanner sc = new Scanner(System.in);
       System.out.println("REGISTRAZIONE UTENTE\n");
       System.out.print("Nome: ");
       String nome = sc.nextLine();
       System.out.print("Cognome: ");
       String cognome = sc.nextLine();
       System.out.print("Data di nascita (dd/mm/yyyy): ");
       String dataNascita = sc.nextLine();
       System.out.print("Codice fiscale: ");
       String codiceFiscale = sc.nextLine();
       System.out.print("Patente A?");
       String risposta = sc.nextLine();
       Set<Patente> patentiUtente = new HashSet<Patente>();
       if (risposta == "yes" || risposta == "y" || risposta == "si" || risposta == "s")
           patentiUtente.add(Patente.A);
       System.out.print("Patente B?");
       risposta = sc.nextLine();
       if (risposta == "yes" || risposta == "y" || risposta == "si" || risposta == "s")
           patentiUtente.add(Patente.B);
       if (patentiUtente.isEmpty())
           patentiUtente.add(Patente.nisba);
       Utente utente = new Utente (nome, cognome, dataNascita, codiceFiscale, patentiUtente);
       utente.registraUtente(utente);
   }
}