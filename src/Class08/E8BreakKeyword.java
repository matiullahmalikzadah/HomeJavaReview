package Class08;

public class E8BreakKeyword {
    public static void main(String[] args) {
        //you have to search the array for number 45 it is present in the array
        //print found

        int[] number={2,3,4,465,67,67,45,89,9};

        for (int n:number){
            if (n==45){
                System.out.println("found");
            }
        }
    }
}
