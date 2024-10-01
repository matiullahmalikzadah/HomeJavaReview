package Class23;

import java.util.LinkedList;

public class E6LinkedList {
    public static void main(String[] args) {

        LinkedList<Dog> dogs=new LinkedList<>();
        dogs.add(new Dog("jim","german"));
        dogs.add(new Dog("Tom","persaion "));
        dogs.add(new Dog("max","Rusia"));
        // here just will print the 2 index and storing in d variable
        Dog d=dogs.get(2);
        d.printInfo();


    }
}
class Dog{
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name+" "+breed);
    }
}
