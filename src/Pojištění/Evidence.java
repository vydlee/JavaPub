package Pojištění;

import java.util.ArrayList;
import java.util.List;


class Evidence {
    // Seznam pro ukládání Osob
    private List<Osoba> seznamOsob;

    // Inicializace seznamu osob
    public Evidence() {
        seznamOsob = new ArrayList<>();
    }

    // Metoda pro přidání nové osoby do seznamu
    public void pridatOsobu(Osoba osoba) {
        seznamOsob.add(osoba);
    }

    // Metoda pro výpis všech osob v seznamu
    public void vypisVsechOsob() {
        for (Osoba osoba : seznamOsob) {
            System.out.println(osoba);
        }
    }

    // Metoda pro vyhledání osoby podle jména a příjmení
    public Osoba vyhledatPodleJmena(String jmeno, String prijmeni) {
        for (Osoba osoba : seznamOsob) {
            if (osoba.getJmeno().equals(jmeno) && osoba.getPrijmeni().equals(prijmeni)) {
                return osoba;
            }
        }
        return null;
    }
}