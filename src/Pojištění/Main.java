package Pojištění;

import java.util.Scanner;

public class Main {
    private static Evidence evidence = new Evidence();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int volba = 0;
        while (volba != 4) {
            System.out.println("1. Přidat osobu");
            System.out.println("2. Vypsat všechny osoby");
            System.out.println("3. Vyhledat osobu");
            System.out.println("4. Konec");

            switch (volba) {
                case 1:
                    pridatOsobu();
                    break;
                case 2:
                    evidence.vypisVsechOsob();
                    break;
                case 3:
                    vyhledatOsobu();
                    break;
                case 4:
                    System.out.println("Ukončení aplikace");
                    break;
                default:
                    System.out.println("Neplatná volba!");
            }
        }
    }

    private static void pridatOsobu() {
        System.out.println("Zadej jméno: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadej příjmení: ");
        String prijmeni = scanner.nextLine();

        System.out.println("Zadej věk: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Neplatný věk! Zadejte číslo:");
            scanner.next();
        }
        int vek = scanner.nextInt();
        if (vek < 0 || vek > 150) {
            System.out.println("Neplatný věk! Zadejte věk mezi 0 a 150:");
            return;
        }
        scanner.nextLine();

        System.out.println("Zadej telefonní číslo: ");
        String telefon = scanner.nextLine();

        Osoba osoba = new Osoba(jmeno, prijmeni, vek, telefon);
        evidence.pridatOsobu(osoba);
    }

    private static void vyhledatOsobu() {
        System.out.println("Zadej jméno: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadej příjmení: ");
        String prijmeni = scanner.nextLine();

        Osoba nalezenaOsoba = evidence.vyhledatPodleJmena(jmeno, prijmeni);
        if (nalezenaOsoba != null) {
            System.out.println(nalezenaOsoba);
        } else {
            System.out.println("Osoba nebyla nalezena.");
        }
    }
}