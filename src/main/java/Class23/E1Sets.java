package Class23;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(10);
        System.out.println(numbers);

        // HashSet don't allow to store multiple value
        // here if we stored value then print the print position will not be the same potion we stored.
        HashSet<Integer> uniqNumber=new HashSet<>();
        uniqNumber.add(10);
        uniqNumber.add(12);
        uniqNumber.add(10);
        uniqNumber.add(10);
        System.out.println(uniqNumber);
    }
}
