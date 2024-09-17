package Class04;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {

        System.out.println("please enter your name");

        Scanner scanner=new Scanner(System.in);
        String name = scanner.next();
        if (name.equals("Matiullah")){
            System.out.println("he is Java instructor ");
        }else {
            System.out.println(" i don't know you ");
        }

        }
        //System.out.println("Hello" +" "+ name);

    }

