package Seminar3;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Angajat> listaAngajati;
        try {
            listaAngajati = Utils.readAngajati("src/angajati.txt");
            for (Angajat angajat : listaAngajati) {
                System.out.println(angajat.toString());
                angajat.statut();
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }

}
