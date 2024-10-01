package Class23;

import java.util.HashSet;

public class E7Sets {
    public static void main(String[] args) {
        HashSet<String > fruit=new HashSet<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("watermelon");
        fruit.add("apple");

        System.out.println(fruit);

        fruit.forEach(x-> System.out.println(x));
        System.out.println("******************");
        for (String f:fruit){
            System.out.println(f);
        }
    }
}
