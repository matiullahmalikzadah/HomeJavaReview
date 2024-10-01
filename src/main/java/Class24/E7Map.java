package Class24;

import java.util.TreeMap;

public class E7Map {
    public static void main(String[] args) {

        TreeMap<String ,Double>makeup=new TreeMap<>();
        makeup.put("Lipstrin",20.0);
        makeup.put("BlushOn",45.0);
        makeup.put("Bas",8.0);
        makeup.put("Foundation",122.0);
        makeup.put("Foundation",122.0);
        makeup.put("EyeLiner",39.0);
        makeup.entrySet();

        var entries=makeup.entrySet();
        for (var e:entries)
        System.out.println(e.getKey()+" "+e.getValue());

    }
}
