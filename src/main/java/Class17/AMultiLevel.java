package Class17;

public class AMultiLevel {
    String name;

    void printName(){
        System.out.println(name);
    }

}

class Khan extends AMultiLevel{
    String color;
    void printColor(){
        System.out.println(color);
    }
}

class Jan extends Khan{
    void printNameColor(){
        System.out.println(name+" "+color);
    }
}
