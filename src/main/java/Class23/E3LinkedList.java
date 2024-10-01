package Class23;

import java.util.LinkedList;

public class E2ArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> number=new LinkedList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.forEach(x-> System.out.println(x));


    }
}
