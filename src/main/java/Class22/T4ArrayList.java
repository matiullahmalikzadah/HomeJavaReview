package Class22;

import java.util.ArrayList;

public class T1ArrayList {
    public static void main(String[] args) {

        ArrayList<String > names=new ArrayList<>();
        names.add("Jan");
        names.add("tan");
        names.add("ban");
        names.add("shan");
        names.add("wan");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jan"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
