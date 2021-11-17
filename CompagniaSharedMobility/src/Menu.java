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
            System.out.println("2. Rimuovi un veicolo");
            System.out.println("3. Aggiungi utente");
            System.out.println("4. Noleggia un veicolo");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");
            scelta = sc.nextInt();

            switch (scelta) {
                case 1:
                    Menu.MenuAggiungiVeicoli();
                    break;

                case 2:
                    Menu.MenuRimouviVeicoli();
                    break;

                case 3:
                    Main.addUtente();
                    break;

                case 4:
                    Menu.MenuNoleggi();
                    break;

                case 5:
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
        System.out.print("Inserisci nome utente: ");
        String nomeUtente = sc.nextLine();

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

    public static int MenuAggiungiVeicoli() {
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
                    Main.addAutomobile(); //Dovrei mettere in input un HashSet di automobili. Come faccio?
                    break;
                case 2:
                    Main.addFurgoncino();
                    break;
                case 3:
                    Main.addScooter();
                    break;
                case 4:
                    Main.addBici();
                    break;
                case 5:
                    Main.addMonopattino();
                    break;
                case 6:
                    Menu.MenuPrincipale();
                case 7:
                    System.exit(0);
            }
        }
    }

    public static int MenuRimouviVeicoli() {
        System.out.println("Quale veicolo vuoi rimuovere?");
        System.out.println("1. Auto");
        System.out.println("2. Furgoncino");
        System.out.println("3. Scooter");
        System.out.println("4. Bici");
        System.out.println("5. Monopattino");
        System.out.println("6. Torna al menu principale");
        System.out.println("7. Esci");
        int scelta = sc.nextInt();
        return scelta;
    }
}
