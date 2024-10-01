package Class23;

import java.util.LinkedList;

public class T1ArrayList {
    public static void main(String[] args) {

        LinkedList<Mom> cats=new LinkedList<>();
        cats.add(new Mom("jim","yellow",10));
        cats.add(new Mom("Tom","black",11));
        cats.add(new Mom("zzzz","white",12));
        Mom d=cats.get(1);
        d.printInfo();
        cats.forEach(x->x.printInfo());


    }
}

class Mom{
    private String name;
    private String color;
    private int age;

    public Mom(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Age: "+age);
    }
}

