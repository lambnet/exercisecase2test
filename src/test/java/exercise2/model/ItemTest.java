package exercise2.model;

import exercise2.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

class ItemTest {

    Item tas = new Item("tas", 200, 10);
    Item jam = new Item("jam", 200, 10);
    Item earphone = new Item("earphone", 200, 10);
    HashMap<Item, Integer> soldItem = new HashMap<>();
    List<Invoice> invoices = new ArrayList<>();

    @org.junit.jupiter.api.Test
    @DisplayName("Testing item's stock")
    void getStock() {
        Main.buyItem(new Date(),tas,5, soldItem, invoices);
        Main.buyItem(new Date(),tas,5, soldItem, invoices);
        Main.buyItem(new Date(),tas,5, soldItem, invoices);
        Assertions.assertAll(
                () -> Assertions.assertEquals(0, tas.getStock()), // stock item tas habis
                ()-> tas.setStock(10), // tambah stock item tas
                () -> Assertions.assertEquals(10,tas.getStock()));
    }



}