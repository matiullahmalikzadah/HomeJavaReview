package Class09;

import java.util.Arrays;

public class E22DArrays {
    public static void main(String[] args) {
        int [] [] numbers={
                {10,20,30,40},
                {100,200,303},
                {100,200,303,400},
        };
        int [] row=numbers[0];// this returns us a complete 1D array
        int firstRow = numbers[0][1];// this returns us one single element
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers[0]));
    }
}
