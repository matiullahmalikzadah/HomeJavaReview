package Class23;

import java.util.LinkedHashSet;

public class E8Sets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        System.out.println(numbers);
        numbers.forEach(x-> System.out.println(x));
    }
}
