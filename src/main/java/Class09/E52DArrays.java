package Class09;

public class E52DArrays {
    public static void main(String[] args) {

        // we add all these numebr
        int [] [] numbers={
                {10,20,30,40},
                {100,200,303,404},
                {100,200,303,400}};

        int sum=0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum=sum+numbers[row][col];
            }
        }
        System.out.println(sum);
    }
}
