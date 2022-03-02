package exercise2.model;

import exercise2.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Item tas = new Item("tas", 200, 10);
    Item jam = new Item("jam", 200, 10);
    Item earphone = new Item("earphone", 200, 10);
    HashMap<Item, Integer> soldItem = new HashMap<>();
    List<Invoice> invoices = new ArrayList<>();

    @Test
    @DisplayName("Testing get quantity of sold item")
    void getQty() {
        Main.buyItem(new Date(),tas,5, soldItem, invoices);
        Main.buyItem(new Date(),tas,5, soldItem, invoices);
        //Assertions.assertEquals(10, );
    }
}