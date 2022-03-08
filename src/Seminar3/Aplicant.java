package Seminar3;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;


    public Aplicant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Aplicant(String nume, String prenume, Integer varsta, Integer punctaj, Integer nrProiecte, String[] denumireProiect) {
        super();
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }

    public String getNume() {
        return nume;
    }


    public String getPrenume() {
        return prenume;
    }


    public void statut() {
        if (punctaj > 80)
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        else
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nume=");
        sb.append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", punctaj=").append(punctaj);
        sb.append(", nrProiecte=").append(nrProiecte);
        sb.append(", denumireProiect=").append(Arrays.toString(denumireProiect));
        return sb.toString();
    }
}
