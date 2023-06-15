package factory;

import toys.Toy;
import toyscatalogue.ToysCatalogue;

import java.util.ArrayList;
import java.util.Random;

public class CatalogueFactory {

    public static ArrayList<ToysCatalogue> toysStock(ArrayList<Toy> toysList, int stockCapacity){
        ArrayList<ToysCatalogue> stock = new ArrayList<>();
        for (Toy toy : toysList) {
            Random random = new Random();
            ToysCatalogue catalogueItem = new ToysCatalogue();
            catalogueItem.setToys(toy);
            catalogueItem.setQuantity(random.nextInt(1, stockCapacity));
            stock.add(catalogueItem);
        }
        return stock;
    }
}