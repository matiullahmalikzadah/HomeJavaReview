package Class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E4ListOfMaps {
    public static void main(String[] args) {

        List<String > namjes=new ArrayList<>();
        String name="jan";
        namjes.add(name);
        String n=namjes.get(0);
        System.out.println(n);

        List<Map<String,String >> mapList=new ArrayList<>();

        Map<String,String > map=new HashMap<>();
        map.put("Name","Fahim");
        map.put("City","Kabul");
        map.put("Age","12");
        map.put("Salary","20000$");
        map.put("Gende","F");

        mapList.add(map);

        Map<String,String > map1=new HashMap<>();
        map1.put("Name","Taban");
        map1.put("City","NYW");
        map1.put("Age","900");
        map1.put("Salary","19888987$");
        map1.put("Gende","M");
        mapList.add(map1);

        Map<String,String> FirstMap=mapList.get(0);
        System.out.println(FirstMap);
        System.out.println();

        System.out.println(FirstMap.get("Name"));
    }
}
