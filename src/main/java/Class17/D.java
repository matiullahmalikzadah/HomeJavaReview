package Class17;

public class D {
    String name;
    void printInf(){
        System.out.println(name);
    }
}

class F extends D{
    String lastName;
    void printLatName(){
        System.out.println(lastName);
    }
}

class H extends F{
    void PrintH(){
        System.out.println(name+" "+lastName);
    }
}
