package Class19;

public class E3TypeCasting {
    public static void main(String[] args) {
        //s1 in here variable also some time called object of Student class
        //= here is to equal store Student in s1 variable
        //new here is created the object of class
        // Ahmad, A1234 here is call to Constructor
        Student s1=new Student("Ahmad","A1223");
        Student s2=new Student("Mahmod","B9876");

        Student [] arr={new Student("Ahmad","A1223"),new Student("Mahmod","B9876")};
        arr[0].printInfo();
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            Student d=arr[i];
            d.printInfo();
        }

    }
}
