package Class23;

import java.util.TreeSet;

public class T4HashSets {
    public static void main(String[] args) {
        TreeSet<String > city=new TreeSet<>();
        city.add("Kabul");
        city.add("NYW");
        city.add("Doshanbe");
        city.add("Dehli");
        city.add("Paris");
        city.add("IslamAbad");
        city.add("Istanbul");
        city.add("Bizhing");
        city.add("Baghdad");
        city.add("Paris");
        city.add("Dehli");
        System.out.println(city);
        city.removeIf(x->x.startsWith("K"));
        System.out.println(city);


    }
}
