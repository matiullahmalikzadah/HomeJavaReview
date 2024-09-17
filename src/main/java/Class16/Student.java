package Class16;

public class Student {
    private String name;
    private String address;

    public Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    public void printIno(){
        System.out.println(name+" "+address);
    }
}

