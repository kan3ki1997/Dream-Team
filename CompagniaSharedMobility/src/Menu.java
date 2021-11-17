import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void MenuPrincipale() {
        System.out.println("\nCosa vuoi fare?");
        System.out.println("1. Aggiungi un veicolo");
        System.out.println("2. Rimuovi un veicolo");
        System.out.println("3. Aggiungi utente");
        System.out.println("4. Noleggia un veicolo");
        System.out.println("5. Esci");
        System.out.print("Scelta: ");
        int scelta = sc.nextInt();

        switch (scelta){
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
    }

    public static int MenuNoleggi() {
        System.out.println("Quale veicolo vuoi noleggiare?");
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

    public static int MenuAggiungiVeicoli() {
        System.out.println("Quale veicolo vuoi aggiungere?");
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
