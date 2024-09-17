package Class11;

public class E6StringMethods {
    public static void main(String[] args) {
        String ste="Batch";
        if (ste.length()%2!=0&&ste.length()>=3){
            int middle=ste.length()/2;
            System.out.println(ste.charAt(middle));
        }


    }
}
