package Class06;

import java.util.Scanner;

public class E12DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input;
        do {
            System.out.println("please enter your name or shutdown to close the program");
            input=scanner.nextLine();
            System.out.println("you are great "+ input);
        }while (!input.equalsIgnoreCase("shutdown"));
    }
}
