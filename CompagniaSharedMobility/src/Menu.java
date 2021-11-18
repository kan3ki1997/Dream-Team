import java.util.HashSet;
import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);
    private static int scelta = 0;
    private static Database database;

    public static void MenuPrincipale() {
        scelta = 0;

        while (scelta != 1 && scelta != 2 && scelta != 3 && scelta != 4) {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Aggiungi un veicolo");
            System.out.println("2. Aggiungi utente");
            System.out.println("3. Noleggia un veicolo");
            System.out.println("4. Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    Menu.MenuAggiungiVeicoli();
                    break;

                case 2:
                    Main.addUtente();
                    break;

                case 3:
                    Menu.MenuNoleggi();
                    break;

                case 4:
                    System.out.println("Addio.");
                    System.exit(0);

                default:
                    System.out.println("Scelta non corretta.");
                    break;
            }
            /*if (scelta == 5)
                break;
            else
                scelta = 0;*/
        }
    }

    public static int MenuNoleggi() {
        System.out.println("Inserisci ID utente: ");
        int idUtente = sc.nextInt();

        // Se non esiste l'utente, lo rimando al menu principale per registrarsi
        if(database.cercaUtente(idUtente) == false) {
            System.out.println("Utente non reigstrato. Seleziona l'opzione 2 per registrarti.");
            Menu.MenuPrincipale();
        }
        System.out.println("Quale veicolo vuoi noleggiare?");
        System.out.println("A. Automobile");
        System.out.println("B. Bici");
        System.out.println("C. Scooter");
        System.out.println("D. Furgoncino");
        System.out.println("E. Monopattino Elettrico");
        String q = sc.nextLine();

        System.out.println("Inserisci ID veicolo");
        int idVeicolo = sc.nextInt();

        if (q.equals("A")) {
            Veicolo veicoloScelto = (Automobile)
        }

        scelta = 0;
        while (scelta != 5) {
            System.out.println("Quale veicolo vuoi noleggiare?");
            System.out.println("1. Auto");
            System.out.println("2. Furgoncino");
            System.out.println("3. Scooter");
            System.out.println("4. Bici");
            System.out.println("5. Monopattino");
            System.out.println("6. Torna al menu principale");
            System.out.println("7. Esci");
            int scelta = sc.nextInt();

            switch (scelta) {

                case 666:
                    System.out.println("Addio.");
                    System.exit(0);

                default:
                    System.out.println("Scelta non corretta.");
                    break;
            }
        }
        return scelta;
    }

    public static void MenuAggiungiVeicoli() {
        int scelta = 0;

        while (scelta != 1 && scelta != 2 && scelta != 3 && scelta != 4 && scelta != 5 && scelta != 6) {

            System.out.println("Quale veicolo vuoi aggiungere?");
            System.out.println("1. Auto");
            System.out.println("2. Furgoncino");
            System.out.println("3. Scooter");
            System.out.println("4. Bici");
            System.out.println("5. Monopattino");
            System.out.println("6. Torna al menu principale");
            System.out.println("7. Esci");
            int sceltaAggiungi = sc.nextInt();

            switch (sceltaAggiungi) {
                case 1:
                    Main.addAutomobile((HashSet)database.getAutomobili()); //Dovrei mettere in input un HashSet di automobili. Come faccio?
                    break;
                case 2:
                    Main.addFurgoncino((HashSet)database.getFurgoncini());
                    break;
                case 3:
                    Main.addScooter((HashSet)database.getScooters());
                    break;
                case 4:
                    Main.addBici((HashSet)database.getBiciclette());
                    break;
                case 5:
                    Main.addMonopattino((HashSet)database.getMonopattiniElettrici());
                    break;
                case 6:
                    Menu.MenuPrincipale();
                case 7:
                    System.exit(0);
            }
        }
    }
}
