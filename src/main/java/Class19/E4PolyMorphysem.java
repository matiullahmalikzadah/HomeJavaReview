package Class19;

import Class17.D;

public class E4PolyMorphysem {
    public static void main(String[] args) {


       /* Animal a = new Animal();
        a.speak();
        a.sleep();
        a.eat();
        Dog d=new Dog();
        d.speak();
        d.sleep();
        d.eat();
        Cat c=new Cat();
        c.speak();
        c.sleep();
        c.eat();*/


        // Note: here replacement of more method we should use polymorphic to ovid to write more than
        //code and print out all the value from the child classes
        Animal[] arr={new Cat(),new Dog(),new Animal()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].speak();
            arr[i].sleep();
            arr[i].eat();
        }
    }
}
