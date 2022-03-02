package exercise2;

import exercise2.model.Invoice;
import exercise2.model.Item;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item tas = new Item("tas", 200, 10);
        Item jam = new Item("jam", 200, 10);
        Item earphone = new Item("earphone", 200, 10);

        // No 1
        List<Item> list = new ArrayList<>();
        list.add(tas);
        list.add(jam);
        list.add(earphone);
        list.forEach(e -> System.out.println(e.getName() + " " + e.getStock() + " " + e.getPoint()));

        // no 2
        List<Invoice> invoices = new ArrayList<>();
        HashMap<Item, Integer> soldItem = new HashMap<>();
        buyItem(new Date(),tas,  5, soldItem, invoices);
        buyItem(new Date(),tas,  5, soldItem, invoices);
        buyItem(new Date(), tas, 5, soldItem, invoices);
        System.out.println(tas.getStock());
        soldItem.forEach((k,v) -> System.out.println(k.getName() + " " + v.toString()));

        System.out.println("\ninvoice");
        invoices.forEach(invoice -> {
            System.out.println("buy " + invoice.getQty() + " " + invoice.getItemName() + " at " + invoice.getDate());
        });

        // no 4
        tas.setStock(20);
        jam.setPoint(2000);
    }
    // no 3
    public static void buyItem(Date date,Item item,  int qty, HashMap<Item, Integer> map, List<Invoice> invoices){
        //check the item's stock
        if(item.getStock() >= qty){
            System.out.println("Success");
            item.setStock(item.getStock() - qty);
            //adding sold item to hashmap
            if(map.get(item) == null){
                map.put(item, qty);
            }else{
                map.put(item, map.get(item) + qty);
            }
            invoices.add(new Invoice(item, date, qty));
        }
    }
}
