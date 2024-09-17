package Class09;

public class E72DArrays {
    public static void main(String[] args) {

        // print the first row
        int [] [] numbers={
                {10,20,30,40},
                {100,200,303,404},
                {100,200,303,400}};

        for (int[] row :numbers){
            for (int D :row){
                System.out.print(D+" ");
            }
            System.out.println();
        }

    }
}
