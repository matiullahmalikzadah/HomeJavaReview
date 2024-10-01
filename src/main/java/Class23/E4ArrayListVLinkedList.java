package Class23;

import java.util.LinkedList;
import java.util.List;

public class E3LinkedList {
    public static void main(String[] args) {

        List<Integer> number=new LinkedList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.forEach(x-> System.out.println(x));
        number.remove(2);
        System.out.println(number);
        number.removeIf(x->x>15);
        System.out.println(number);
        number.add(3,60);
        System.out.println(number);


    }
}
