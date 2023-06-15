import factory.CatalogueFactory;
import factory.ToyFactory;
import toys.Toy;
import toyscatalogue.ToysCatalogue;

import java.util.ArrayList;
import java.util.LinkedList;

import static Draw.DrawUtils.drawResult;
import static outputs.Outputs.printCatalogue;
import static outputs.Outputs.printQueue;
import static takeprize.TakePrize.takePrize;

public class Main {
    public static void main(String[] args) {

        ArrayList<Toy> toys = ToyFactory.createToys(4);
        ArrayList<ToysCatalogue> stock = CatalogueFactory.toysStock(toys, 8);
        LinkedList<Toy> prizeQueue = new LinkedList<>();
        printCatalogue(stock);
        int j = 0;
        while(j < 4) {
            drawResult(stock, prizeQueue);
            j++;
        }
        System.out.println();
        printCatalogue(stock);
        printQueue(prizeQueue);
        takePrize(prizeQueue);
        takePrize(prizeQueue);
        printQueue(prizeQueue);

    }
}