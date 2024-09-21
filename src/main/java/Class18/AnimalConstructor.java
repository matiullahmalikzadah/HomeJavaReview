package Class18;

public class AnimalConstructor {
    private String name;
    private String color;
    private int age;

    public AnimalConstructor(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}

class Dog extends AnimalConstructor{

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public void printInfo(){
        System.out.println("my own method");
    }
}
