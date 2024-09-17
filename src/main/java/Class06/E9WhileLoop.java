package Class06;

import java.util.Scanner;

public class E9WhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the start number");
        int start=scanner.nextInt();

        System.out.println("please enter the end number");
        int end=scanner.nextInt();

        System.out.println("please enter the step number as well");
        int step=scanner.nextInt();

        while (start <= end){
            System.out.print(start +" ");
            start+=step;
        }
    }
}
