import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static int MenuPrincipale() {
        System.out.println("\nCosa vuoi fare?");
        System.out.println("1. Aggiungi un veicolo");
        System.out.println("2. Rimuovi un veicolo");
        System.out.println("3. Aggiungi utente");
        System.out.println("4. Noleggia un veicolo");
        System.out.println("5. Esci");
        System.out.print("Scelta: ");
        int scelta = sc.nextInt();
        return scelta;
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
