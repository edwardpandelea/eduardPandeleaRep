package Seminar3;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;


    public Student(String nume, String prenume, Integer varsta, Integer punctaj, Integer nrProiecte, String[] denumireProiect, String facultate, Integer anStudii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }


    @Override
    public String toString() {
        return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect=" + Arrays.toString(denumireProiect) + "Facultate=" + facultate + ", An_studii=" + anStudii;
    }


}
