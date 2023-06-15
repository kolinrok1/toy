package takeprize;

import toys.Toy;

import java.util.LinkedList;

public class TakePrize {

    public static void takePrize(LinkedList<Toy> prizeQoeue) {
        if (prizeQoeue.size() != 0) {
            System.out.println(prizeQoeue.removeFirst());
        }
        else {
            System.out.println("no available prizes !!!");
        }
    }
}