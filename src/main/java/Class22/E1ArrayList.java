package Class22;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String > names=new ArrayList<>();
        names.add("jan");
        names.add("khan");
        names.add("shan");
        names.add("tam");
        names.add("zazi");
        names.add("nam");
        //names.remove(0);
        names.remove("jan");
        System.out.println(names);
        names.add("saz");
        System.out.println(names);
        //if we want to add value in the specific place then we should write the below code like:
        // the number here means the location of the value where you want to store it
        names.add(1,"kkkk");
        System.out.println(names);
        //if we want to replacement of a value add other value
        //number here show location of value
        names.set(1,"zzzzzz");
        System.out.println(names);

    }
}
