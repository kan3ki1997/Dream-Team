import java.util.Scanner;

public static class Menu {
    public static int MenuPrincipale() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCosa vuoi fare?");
        System.out.println("1. Aggiungi un veicolo");
        System.out.println("2. Aggiungi utente");
        System.out.println("3. Noleggia un veicolo");
        System.out.println("4. Esci");
        System.out.print("Scelta: ");
        int scelta = sc.nextInt();
        return scelta;
    }

    public static int MenuNoleggi() {
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

    public static int MenuVeicoli() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quale veicolo vuoi aggiungere?");
        System.out.println("1. Auto");
        System.out.println("2. Furgoncino");
        System.out.println("3. Scooter");
        System.out.println("4. Bici");
        System.out.println("5. Monopattino");
        System.out.println("6. Torna al menu principale");
        System.out.println("7. Esci");
    }
}