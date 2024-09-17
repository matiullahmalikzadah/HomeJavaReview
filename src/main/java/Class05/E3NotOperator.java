package Class05;

import java.util.Scanner;

public class E3NotOperator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the name of the country");
        String country = scanner.nextLine();

        if (!country.equals("Iran")){
            System.out.println("Welcome on this country ");
        }
        if (!country.equalsIgnoreCase("Iran")){
            System.out.println("Welcome you on this country");
        }
    }
}
