package Class04;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {

        System.out.println("please enter your name");

        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello" +" "+ name);
    }
}
