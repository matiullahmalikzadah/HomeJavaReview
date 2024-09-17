package Class11;

public class E9StringMethods {
    public static void main(String[] args) {
        //if we want to replace other word
        String ste = "ewyhrfhbabew39475973 465$%76%*&*^ %&%$HCBCKHKKL";
        System.out.println(ste.replaceAll("[A-Z]","="));
        System.out.println(ste.replaceAll("[A-C]","="));
        System.out.println(ste.replaceAll("[a-z]","="));
        System.out.println(ste.replaceAll("[0-9]","1"));
        System.out.println(ste.replaceAll(" ",""));
        System.out.println(ste.replaceAll("[^A-Z]",""));
        System.out.println(ste.replaceAll("[^A-Z0-9a-z]",""));



    }
    }

