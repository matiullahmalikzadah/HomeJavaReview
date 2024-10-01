package Class21;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        // if we have more value then we want to print the specific name then we should use this
        ArrayList<String > arr=new ArrayList();
        arr.add("Jan");
        arr.add("khan");
        arr.add("shan");
        arr.add("zazi");
        System.out.println(arr.get(2));
        System.out.println(arr.contains("Jan"));
        System.out.println(arr.indexOf("zazi"));
    }
}
