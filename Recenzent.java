import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * <klasa Recencenzent wystawia randomowe oceny książką>
 *     <rand> : <Random>, instancja klasy służąca do generowania liczb psełdo losowych
 *     <wypiszKsiazki()> : <Lista<Objects>>, metoda wypisująca książki i generująca im pseudo losowe oceny
 * @author: <Bartosz> <Winiarczyk>
 */
public class Recenzent extends Czytelnik{

    Random rand = new Random();
    public List<Objects> wypiszKsiazki(){
        return listaKsiazek;
    }
}
