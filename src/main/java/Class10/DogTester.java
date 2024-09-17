package Class10;

public class DogTester {
    public static void main(String[] args) {
        //we are creating object from the Dog class
        Dog lunasObj=new Dog();
        //assigning a value to name using lunasobj
        lunasObj.name="Luna";
        lunasObj.gender='F';
        lunasObj.breed="Shiba";
        lunasObj.age=10;
        lunasObj.weight=12;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);

        //we are calling the bark method on lunasObj
        lunasObj.bark();
        lunasObj.eat();
        lunasObj.sleep();


    }
}
