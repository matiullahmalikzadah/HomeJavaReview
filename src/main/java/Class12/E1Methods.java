package Class12;

import java.util.Scanner;

public class E1Methods {
    public static void main(String[] args) {

       takeUserInput();
        System.out.println("please enter the detail again");
        takeUserInput();
    }
    static void takeUserInput() {
        // we are creating the object of Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        //using the scanner object we are calling the nextIn method
        String name = scanner.nextLine();
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        System.out.println("your name is " + " " + name + " and you age is" + " " + age + " years old");
    }
}
