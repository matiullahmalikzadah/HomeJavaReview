package Class12;

public class E2MethodsTester {
    public static void main(String[] args) {
        E2Methods e2=new E2Methods();
        int sum=e2.add(10,20);
        System.out.println(sum);
       /* Scanner scanner=new Scanner(System.in);
        int age= scanner.nextInt();
        */
        // Note: if we have void type we can not store
        // like the below (int D= e2.multiply(20);)
        //it well has not int D =
       int D= e2.multiply(20);
        System.out.println(D);

    }
}
