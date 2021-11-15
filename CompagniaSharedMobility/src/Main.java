import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
      HashSet<Automobile> automobili = new HashSet<Automobile>();
      HashSet<Scooter> scooter = new HashSet<Scooter>();
      HashSet<Furgoncino> furgoncini = new HashSet<Furgoncino>();
      HashSet<MonopattinoElettrico> monopattini = new HashSet<MonopattinoElettrico>();
      HashSet<Bici> bici = new HashSet<Bici>();
      HashSet<Utente> utenti = new HashSet<Utente>();
      Database database = new Database();

      /*Automobile ferrari = new Automobile (2, PosizioneIniziale, false, 25.0, 30.0f, "AA000AA");
      Furgoncino piaggioPorter = new Furgoncino(3, PosizioneIniziale, false, 2, 30.0f, "BB123CC");*/

   }

   public void addAutomobile(ArrayList automobili){
       Scanner sc = new Scanner(System.in);
       int id = automobili.size() + 1;
       System.out.print("Targa: ");
       String targa = sc.nextLine();
       automobili.add(new Automobile(id, targa));
   }

    public void addScooter(ArrayList scooter){
        Scanner sc = new Scanner(System.in);
        int id = scooter.size() + 1;
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
            if(!risposta.equals("s") && !risposta.equals("n")
                System.out.println("Scelta non corretta. Scrivi <s> per Sì e <n> per No.");
            //e che famo se ha il casco o meno?
        }
        if (risposta == "s")
            haCasco = true;
        else
            haCasco = false;

        scooter.add(new Automobile(id, targa, haCasco));
    }

    public void addFurgoncino(ArrayList furgoncino) {
        Scanner sc = new Scanner(System.in);
        int id = furgoncino.size() + 1;
        System.out.print("Targa: ");
        String targa = sc.nextLine();
        furgoncino.add(new Automobile(id, targa));
    }

    public void addMonopattino(ArrayList monopattini) {
        int id = monopattini.size() + 1;
        monopattini.add(new MonopattinoElettrico(id));
    }

    public void addBici(ArrayList bici) {
        int id = bici.size() + 1;
        bici.add(new MonopattinoElettrico(id));
    }

}