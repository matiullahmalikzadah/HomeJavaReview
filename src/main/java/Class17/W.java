package Class17;

public class W {
    static String name="Jamil";

    static void printF(){
        System.out.println("f");
    }
}

class Z extends W{
    public static void main(String[] args) {
        printF();
        System.out.println(name);
    }
}
