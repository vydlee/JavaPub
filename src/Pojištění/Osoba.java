package Pojištění;

class Osoba {
    // Deklarace atributů třídy
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;

    // Inicializace Osob
    public Osoba(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    //Výpis informací o osobě
    @Override
    public String toString() {
        return "Osoba{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", vek=" + vek +
                ", telefonniCislo='" + telefonniCislo + '\'' +
                '}';
    }

    // Getter metody pro přístup k atributům
    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }
}