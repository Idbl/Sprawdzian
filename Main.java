import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Osoba> lista = new LinkedList<>();
        Osoba o1 = new Osoba("Wojtuś", "Hendejewski", 17);
        lista.add(o1);
        System.out.println(lista);

    }
}