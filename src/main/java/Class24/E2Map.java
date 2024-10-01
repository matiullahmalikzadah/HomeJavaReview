package Class24;

import java.util.LinkedHashMap;

public class E2Map {
    public static void main(String[] args) {


        LinkedHashMap<Integer,String > students=new LinkedHashMap<>();
        students.put(1,"Ahmad");
        students.put(2,"Jan");
        students.put(3,"Shan");
        students.put(4,"Ahmad");
        System.out.println(students);
        students.remove(3);
        System.out.println(students);
        students.replace(2,"Khan");
        System.out.println(students);

    }

}

