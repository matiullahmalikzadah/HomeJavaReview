package Class22;

import java.util.ArrayList;

public class T5ArrayList {
    public static void main(String[] args) {

        ArrayList<String > fruit=new ArrayList<>();
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Watermelon");
        fruit.add("peach");
        fruit.add("milk");

        fruit.removeIf(x->x.endsWith("e")||x.contains("a"));
        System.out.println(fruit);
    }
}
