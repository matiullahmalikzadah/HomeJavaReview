package Class15;

public class T1 {
   private String  ADDRESS;


    public T1(String userAddess){
        System.out.println("Executed constructors with parameter " + userAddess);
    }
    public T1(){
        System.out.println("Executed constructors with NO parameter");
    }

    public static void main(String[] args) {

        T1 t1=new T1();
        T1 t2=new T1("Canada");

    }


}
