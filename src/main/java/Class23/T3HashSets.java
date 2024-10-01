package Class23;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class T2HashSets {
    public static void main(String[] args) {
        ArrayList<String > aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
 
        LinkedHashSet<String> b=new LinkedHashSet<>(aList);
        aList.clear();
        aList.addAll(b);
        System.out.println(aList);

    }
}
