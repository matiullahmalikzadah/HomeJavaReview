package Class09;

public class E62DArrays {
    public static void main(String[] args) {

        // print the first row
        int [] [] numbers={
                {10,20,30,40},
                {100,200,303,404},
                {100,200,303,400}};

        for (int row = 0; row < 4; row++) {
            System.out.println(numbers[0][row]);
        }
    }
}
