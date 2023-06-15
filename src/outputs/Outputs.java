package outputs;

import toys.Toy;
import toyscatalogue.ToysCatalogue;

import java.util.ArrayList;
import java.util.LinkedList;

public class Outputs {

    public static void printCatalogue(ArrayList<ToysCatalogue> stock){
        System.out.println("in stock: ");
        for(ToysCatalogue item: stock){
            System.out.println(item.getToys().getName() + " " + item.getQuantity());
        }
    }

    public static void printQueue(LinkedList<Toy> prizeQueue){
        System.out.println("in queue: ");
        for(Toy item: prizeQueue) {
            System.out.println(item.getName());
        }
    }
}