package Class09;

public class T22DArrays {
    public static void main(String[] args) {
        int [] [] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};

        // write a loop to get all the element from second row ine by one
        for (int row = 0; row < 4; row++) {
            System.out.println(numbers[1][row]);
        }

    }
}
