import java.util.Date;

/**
 * <tytul> : <String>, tytul książki
 * <autor> : <Osoba>, autor książki
 * <dataWydania> : <Date>, data wydania książki
 * @author: <Bartosz> <Winiarczyk>
 */
public class Ksiazka {
    private String tytul;
    private Osoba autor;
    private Date dataWydania;

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor=" + autor +
                ", dataWydania=" + dataWydania +
                '}';
    }
}


