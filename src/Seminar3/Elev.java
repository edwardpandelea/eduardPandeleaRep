package Seminar3;

import java.util.Arrays;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;

    public Elev(String nume, String prenume, Integer varsta, Integer punctaj,
                Integer nr_proiecte, String[] denumireProiect, Integer clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }


    @Override
    public String toString() {
        return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
                + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
                + Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
    }


    public int finantare() {
        Integer s = 30;
        System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
        return s;
    }

}
