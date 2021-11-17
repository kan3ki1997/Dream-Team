import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSet<Automobile> automobili = new HashSet<Automobile>();
        HashSet<Scooter> scooters = new HashSet<Scooter>();
        HashSet<Furgoncino> furgoncini = new HashSet<Furgoncino>();
        HashSet<MonopattinoElettrico> monopattini = new HashSet<MonopattinoElettrico>();
        HashSet<Bici> bici = new HashSet<Bici>();
        HashSet<Utente> utenti = new HashSet<Utente>();
        HashSet<Noleggio> noleggi = new HashSet<Noleggio>();
        Database database = new Database();

        menu();

        /*Automobile ferrari = new Automobile (2, PosizioneIniziale, false, 25.0, 30.0f, "AA000AA");
        Furgoncino piaggioPorter = new Furgoncino(3, PosizioneIniziale, false, 2, 30.0f, "BB123CC");*/
   }

   public void addAutomobile(HashSet automobili){
       Scanner sc = new Scanner(System.in);
       int id = automobili.size() + 1;
       System.out.print("Targa: ");
       String targa = sc.nextLine();
       Automobile automobile = new Automobile(id, targa);
       automobili.add(automobile);
       automobile.registraAutomobile(automobile);
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

        Scooter scooter = new Scooter(id, targa);
        scooters.add(scooter);
        scooter.registraScooter(scooter);
    }

   public void addFurgoncino(HashSet furgoncini) {
        Scanner sc = new Scanner(System.in);
        int id = furgoncini.size() + 1;
        System.out.print("Targa: ");
        String targa = sc.nextLine();
        Furgoncino furgoncino = new Furgoncino(id, targa);
        furgoncini.add(furgoncino);
        furgoncino.registraFurgoncino(furgoncino);
    }

   public void addMonopattino(HashSet monopattini) {
        int id = monopattini.size() + 1;
        double[] posizioneGPS = new double[]{0,0};
        MonopattinoElettrico monopattino = new MonopattinoElettrico(id, posizioneGPS);
        monopattini.add(monopattino);
        monopattino.registraMonopattino(monopattino);
    }

   public void addBici(HashSet bici) {
        int id = bici.size() + 1;
        Bici bicicletta = new Bici(id);
        bici.add(bicicletta);
        bicicletta.registrazioneBici(bicicletta);
    }

   public static void menu() throws InterruptedException {
        int scelta = 0;
        MenuPrincipale();

       while (scelta != 1) {

           System.out.println("\n");

           switch (scelta){
               case 1:
                   MenuVeicoli();
                   break;

               case 2:
                  addUtente(utenti, database);

               case dibbase:
                   System.out.println("Addio.");
                   break;

               default:
                   System.out.println("Scelta non corretta.");
                   break;
           }
           if (scelta == dibbase)
               break;
           else
               scelta = 0;
       }
   }

   public void addUtente(HashSet<Utente> utenti, Database database){
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
       System.out.print("Patente (A, B, nessuna: "); //da gestire l'input per una o più patenti
       String patenti = ; //???????????????? poi da cosare col set
       Utente utente = new Utente (nome, cognome, dataNascita, codiceFiscale, patenti);
   }

   public static int MenuPrincipale() {
       Scanner sc = new Scanner(System.in);
       System.out.println("\nCosa vuoi fare?");
       System.out.println("1. Aggiungi un veicolo");
       System.out.println("2. Aggiungi utente");
       System.out.println("3. Esci");
       System.out.print("Scelta: ");
       int scelta = sc.nextInt();
       return scelta;
   }

   public static int MenuVeicoli() {
        Scanner sc = new Scanner(System.in);
       System.out.println("Quale veicolo vuoi noleggiare?");
       System.out.println("1. Auto");
       System.out.println("2. Furgoncino");
       System.out.println("3. Scooter");
       System.out.println("4. Bici");
       System.out.println("5. Monopattino");
       System.out.println("6. Torna al menu principale");
       System.out.println("7. Esci");
   }
}