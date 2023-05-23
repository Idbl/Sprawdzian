import java.util.Objects;

/**
 * <imie> : <String>, imie osoby
 * <nazwisko> : <String>, nazwisko osoby
 * <wiek> : <int>, wiek osoby
 * @author: <Bartosz> <Winiarczyk>
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(){

    }

    public Osoba (String imie, String nazwisko, int wiek){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return wiek == osoba.wiek && Objects.equals(imie, osoba.imie) && Objects.equals(nazwisko, osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
