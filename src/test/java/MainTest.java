import exercise2.Main;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;
import exercise2.model.Item;
import exercise2.model.Invoice;

public class MainTest {

    @Test
    public void buyItemTest() {
        Item tas = new Item("tas", 200, 10);
        List<Invoice> invoices = new ArrayList<>();
        HashMap<Item, Integer> soldItem = new HashMap<>();
        Main.buyItem(new Date(), tas, 5, soldItem, invoices);

    }
}