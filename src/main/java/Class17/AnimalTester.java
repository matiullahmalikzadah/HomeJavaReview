package Class17;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "Tom";
        c.breed = "Russian";
        c.color = "Black";
        c.age = 12;
        c.attitude = true;
        c.printInfo();

        Dog dog=new Dog();
        dog.bark();
        dog.name="lacky";
        dog.breed="german";
        dog.color="yellow";
        dog.age=20;
        dog.printInfo();

        Animal a=new Animal();
        a.name="Jim";
        a.color="white";
        a.printInfo();

        }

}
