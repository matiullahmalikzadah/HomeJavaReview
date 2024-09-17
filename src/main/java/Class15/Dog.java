package Class15;

public class Dog {
    //why we make private these?
    //because we should have more control on the data. but no one can have access in these data if we want to
    // they have access on these data then we should use Constructors.
    private String  name;
    private String bread;
    private String  color;
    private int age;

    Dog(String dName,String dBread,String dColor,int dAge){
        name=dName;
        bread=dBread;
        color=dColor;
        age=dAge;

    }

    // this code called method. what is different between the constructor and method?
    // method have return time but constructors doesn't have
    void bark(){
        System.out.println("wuff wuff");
    }

    void printInfo(){
        System.out.println(name+" "+bread+" "+color);
    }

}
