package Class23;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println(number);
       // number.removeIf(d->d>30);
        //System.out.println(number);
        number.forEach(x-> System.out.println(x));

    }
}
