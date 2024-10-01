package Class24;

import java.util.TreeMap;

public class T1Map {
    public static void main(String[] args) {
        TreeMap<Integer,String > building=new TreeMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Facebook");
        building.put(4,"SlesForce");
        building.put(5,"TikTak");
        building.put(6,"WhatsUp");
        building.put(7,"Tech");
        System.out.println(building);
        System.out.println("Company size: "+building.size());
        building.replace(2,"Dill");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);

    }
}
