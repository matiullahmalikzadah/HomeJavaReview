package Class23;

import java.util.TreeSet;

public class E9Sets {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        System.out.println(numbers);
        numbers.forEach(x-> System.out.println(x));
    }
}
