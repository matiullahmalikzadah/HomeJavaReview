package Class22;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {

        Integer number=new Integer(10);
        //shortcut is
        Integer number2=10;
        int d=number2.intValue(); // cONVERTING FROM A CLASS TO A PRIMITIVE
        System.out.println(d);

        Integer c=10;    // AutoBoxing
        int f=c;        //  AutoUnBoxing
        System.out.println(f);
    }
}
