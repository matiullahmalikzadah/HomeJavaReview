package Class19;

public class Animal {
    void speak(){
        System.out.println("animal can speak");
    }
    void sleep(){
        System.out.println("animal can sleep");
    }
    void eat(){System.out.println("animal eat ");
    }
}

class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow meow");
    }
}
