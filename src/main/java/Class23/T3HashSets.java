package Class23;

import java.util.TreeSet;

public class T3HashSets {
    public static void main(String[] args) {
        TreeSet<String > country=new TreeSet<>();
        country.add("Japan");
        country.add("USA");
        country.add("Afghanistan");
        country.add("India");
        country.add("Farance");
        country.add("Pakistan");
        country.add("Turkey");
        country.add("Chines");
        country.add("Iraq");
        country.add("Farance");
        country.add("India");
        System.out.println(country);
        country.add(new String("Tajikistan"));
        System.out.println(country);
        System.out.println();
        country.forEach(x-> System.out.println(x));

    }
}
