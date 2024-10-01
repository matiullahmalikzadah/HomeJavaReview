package Class24;

import java.util.Collection;
import java.util.TreeMap;

public class E3Map {
    public static void main(String[] args) {
        TreeMap<String ,Double> makeup=new TreeMap<>();
        makeup.put("Lipstrin",20.0);
        makeup.put("BlushOn",45.0);
        makeup.put("Bas",8.0);
        makeup.put("Foundation",122.0);
        makeup.put("Foundation",122.0);
        makeup.put("EyeLiner",39.0);
        System.out.println(makeup);
        System.out.println();
        makeup.put("EyeLiner",39.0);
        System.out.println(makeup);
        Collection<String> onlyKey=makeup.keySet();
        System.out.println(onlyKey);
        Collection<Double> onlyValue=makeup.values();
        System.out.println(onlyValue);
    }
}
