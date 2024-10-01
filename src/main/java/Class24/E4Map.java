package Class24;

import java.util.TreeMap;

public class E4Map {
    public static void main(String[] args) {
        TreeMap<String ,Double> makeup=new TreeMap<>();
        makeup.put("Lipstrin",20.0);
        makeup.put("BlushOn",45.0);
        makeup.put("Bas",8.0);
        makeup.put("Foundation",122.0);
        makeup.put("Foundation",122.0);
        makeup.put("EyeLiner",39.0);
        makeup.forEach((key,value)-> System.out.println(key+" "+value));
        System.out.println();
        makeup.forEach((key,value)-> System.out.println(key));
        System.out.println();
        makeup.forEach((key,value)-> System.out.println(value));
        makeup.forEach((key,value)-> {
            if (key.contains("B")) {
                System.out.println(value);
            }

        } );

    }
}
