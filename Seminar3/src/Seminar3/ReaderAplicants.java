package Seminar3;

import java.io.FileNotFoundException;
import java.util.List;

public interface ReaderAplicants {
    List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}
