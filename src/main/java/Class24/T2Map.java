package Class24;

import java.util.TreeMap;

public class T2Map {
    public static void main(String[] args) {

        TreeMap<String ,String> countries=new TreeMap<>();
        countries.put("Pakistan","IslamAbad");
        countries.put("Turky","Istanbul");
        countries.put("Afghanistan","Kabul");
        countries.put("Iran","Tehran");
        countries.put("USA","NYW");

        countries.forEach((key,value)-> {
            if (key.length()>5 && value.contains("a")) {
                System.out.println(key + " " + value);
            }
        });
        System.out.println();
        countries.forEach((key,value)-> System.out.println(value));

    }
}
