package Draw;

import toys.Toy;
import toyscatalogue.ToysCatalogue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class DrawUtils {

    public static LinkedList<Draw> createDrawList(ArrayList<ToysCatalogue> stock){
        LinkedList<Draw> drawlist = new LinkedList<>();
        int i = 0;
        for(ToysCatalogue item: stock){
            if(item.getQuantity() != 0){
                Draw drawItem = new Draw();
                drawItem.setToy(item.getToys());
                drawItem.setStart(i);
                i = i + item.getToys().getDrawWeight();
                drawItem.setEnd(i);
                drawlist.addLast(drawItem);
            }
        }
        return drawlist;
    }

    public static Toy drawChose(LinkedList<Draw> drawList){
        if(drawList.size() != 0) {
            int maximum = drawList.getLast().getEnd();
            Random random = new Random();
            int drawWin = random.nextInt(0, maximum);
            for (Draw item : drawList) {
                if (drawWin >= item.getStart() && drawWin <= item.getEnd()) {
                    return item.getToy();
                }
            }
        }
        return null;
    }

    public static void drawResult(ArrayList<ToysCatalogue> stock, LinkedList<Toy> prizeQueue) {
        LinkedList<Draw> drawList = createDrawList(stock);
        Toy drawToy = drawChose(drawList);
        if (drawToy != null) {
            for (ToysCatalogue item : stock) {
                if (item.getToys().equals(drawToy)) {
                    item.takeToy();
                }
            }
            prizeQueue.addLast(drawToy);
            System.out.println(drawToy.getName() + " drawed and added to Que");
        } else {
            System.out.println("stock is empty");
        }
    }
}