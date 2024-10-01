package Class22;

import java.util.ArrayList;

public class T3ArrayList {
    public static void main(String[] args) {

        ArrayList<String > drinks=new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Cola");
        drinks.add("Sprite");
        drinks.add("milk");

        /*for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).endsWith("e")){
                drinks.remove(i);
            }

        }*/
        //this code we should use replacement of the above code
        drinks.removeIf(x->x.endsWith("e"));
        System.out.println(drinks);
    }
}
