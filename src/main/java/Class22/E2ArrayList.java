package Class22;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("jan");
        names.add("khan");
        names.add("shan");
        names.add("tam");
        names.add("zazi");
        names.add("nam");


        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("******************************");
        for (String n:names){
            System.out.println(n);
        }
        System.out.println("********************************");

        int i=0;
        while (i<names.size()){
            System.out.println(names.get(i));
            i++;
        }
    }
}
