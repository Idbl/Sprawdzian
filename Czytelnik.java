import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * <Klasa zawiera informacje o książkach>
 * ksiazka : List<Object>, przechowuje książki
 * listaKsiazek : List<Object>, przechowuje liste książek przeczytaną przez danego czytelnika
 * wypiszKsiążki() : List<Object>, metoda wypisująca obiekty z listy książek
 */

public class Czytelnik extends Osoba {
    protected List<Objects> ksiazka = new LinkedList<>();
    protected List<Objects> listaKsiazek = new LinkedList<>();

    public List<Objects> wypiszKsiazki(){
        return listaKsiazek;
    }

    @Override
    public String toString() {
        return "Czytelnik{" +
                "ksiazka=" + ksiazka +
                ", listaKsiazek=" + listaKsiazek +
                '}';
    }
}
