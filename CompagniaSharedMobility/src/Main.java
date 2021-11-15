import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      ArrayList<Automobile> automobili = new ArrayList<Automobile>();
      ArrayList<Scooter> scooter = new ArrayList<Scooter>();
      ArrayList<Furgoncino> furgoncini = new ArrayList<Furgoncino>();
      ArrayList<MonopattinoElettrico> monopattini = new ArrayList<MonopattinoElettrico>();
      ArrayList<Bici> bici = new ArrayList<Bici>();
      ArrayList<Utente> utenti = new ArrayList<Utente>();
      Database database = new Database();

      /*Automobile ferrari = new Automobile (2, PosizioneIniziale, false, 25.0, 30.0f, "AA000AA");
      Furgoncino piaggioPorter = new Furgoncino(3, PosizioneIniziale, false, 2, 30.0f, "BB123CC");*/

   }

   public void addAutomobile(ArrayList automobili){
       Scanner sc = new Scanner(System.in);
       int indice = automobili.size();
       int id = automobili.size() + 1;
       System.out.print("Targa: ");
       String targa = sc.nextLine();
       automobili.add(new Automobile(id, targa));
   }

    public void addScooter(ArrayList scooter){
        Scanner sc = new Scanner(System.in);
        int indice = scooter.size();
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
        int indice = furgoncino.size();
        int id = furgoncino.size() + 1;
        System.out.print("Targa: ");
        String targa = sc.nextLine();
        furgoncino.add(new Automobile(id, targa));
    }

    public void addMonopattino(ArrayList monopattini) {
        int indice = monopattini.size();
        int id = monopattini.size() + 1;
        monopattini.add(new MonopattinoElettrico(id));
    }

    public void addBici(ArrayList bici) {
        int indice = bici.size();
        int id = bici.size() + 1;
        bici.add(new MonopattinoElettrico(id));
    }

}