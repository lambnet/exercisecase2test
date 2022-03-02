import exercise2.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.*;
import exercise2.model.Item;
import exercise2.model.Invoice;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    @DisplayName("test a sold item quantity in sold item list")
    public void buyItemTest() {
        Item tas = new Item("tas", 200, 10);
        List<Invoice> invoices = new ArrayList<>();
        HashMap<Item, Integer> soldItem = new HashMap<>();

        // Sold item qty fot 'tas' should be 5
        Main.buyItem(new Date(), tas, 5, soldItem, invoices);
        assertEquals(5, soldItem.get(tas));

        // Sold item qty fot 'tas' should be 10
        Main.buyItem(new Date(), tas, 5, soldItem, invoices);
        assertEquals(10, soldItem.get(tas));
    }
}
