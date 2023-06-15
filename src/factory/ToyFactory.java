package factory;

import toys.Toy;

import java.util.ArrayList;
import java.util.Random;

public class ToyFactory {

    public static ArrayList<Toy> createToys (int toyCount){
        ArrayList<Toy> toysList = new ArrayList<>();
        for(int i = 0; i < toyCount; i++){
            Random random = new Random();
            Toy newToy = new Toy();
            newToy.setToyId(i);
            newToy.setName("toy" +  String.valueOf(i + 1));
            newToy.setDrawWeight(random.nextInt(1, 100));
            newToy.setPrice(random.nextInt(200, 5000));
            toysList.add(newToy);
        }
        return toysList;
    }
}