package Class22;

import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {

        ArrayList<String > drinks=new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Cola");
        drinks.add("Sprite");
        drinks.add("milk");

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i,"water");

            }

        }
        System.out.println(drinks);
    }
}
