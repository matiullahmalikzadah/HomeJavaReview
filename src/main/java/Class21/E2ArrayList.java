package Class21;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add("Jan");
        names.add("Khan");
        names.add(10);
        names.add('F');
        System.out.println(names.size());
        System.out.println(names);
        names.remove(0);
        System.out.println(names.size());
        System.out.println(names);;
    }
}
