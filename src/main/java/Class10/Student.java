package Class10;

public class Student {


    //properties/Attributes
    String name;
    int age;
    String ID;

    //Methods/functions/Behaviours
    void study(){
        System.out.println("studying 16 hours a day ................");
    }

    public static void main(String[] args) {
        //we are creating actual student by using student class
        Student ehabObj=new Student();
        ehabObj.name="Ehab";
        ehabObj.age=23;
        ehabObj.ID="etwyew76";
        ehabObj.study();
    }
}
