package Class24;

import java.util.HashMap;

public class E1Map {
    public static void main(String[] args) {


        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple",30.0);
        fruit.put("Apple",45.0);
        fruit.put("Banana",12.0);
        fruit.put("Peach",4.50);
        fruit.put("Watermelon",11.2);
        fruit.put("orange",30.0);
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsValue(4.50));

    }

}

