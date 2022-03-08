package Seminar3;

public class Angajat extends Aplicant {
    private final String ocupatie;
    private final int salariu;

    public Angajat(String nume, String prenume, Integer varsta, Integer punctaj, Integer nrProiecte, String[] denumireProiecte, Integer salariu, String ocupatie) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte);
        this.salariu = salariu;
        this.ocupatie = ocupatie;
    }
    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Angajat");
        stringBuilder.append(super.toString());
        stringBuilder.append("Ocupatie=").append(ocupatie);
        stringBuilder.append(", salariu=").append(salariu);
        return stringBuilder.toString();
    }
}
