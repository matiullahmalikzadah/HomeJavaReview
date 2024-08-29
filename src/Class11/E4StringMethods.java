package Class11;

public class E3StringMethods {
    public static void main(String[] args) {
        String ste="Batch 17 is great.";
        int count=0;
        for (int i = 0; i < ste.length(); i++) {
            if (ste.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
    }
}
