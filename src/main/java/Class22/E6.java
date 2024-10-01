package Class22;

import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {

        ArrayList<String > names=new ArrayList<>();
        names.add("Jan");
        names.add("tan");
        names.add("ban");
        names.add("shan");
        names.add("wan");

        /*for (String n:names){
            System.out.println(n);
        }*/
        names.forEach(x-> System.out.println(x));
    }
}
