package Class04;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter your Gender F/M");
        char gender= scanner.next().charAt(0);
        System.out.println("your gender is "+gender);
    }
}
