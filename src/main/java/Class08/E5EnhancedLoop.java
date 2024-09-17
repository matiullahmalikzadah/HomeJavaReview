package Class08;

public class E5EnhancedLoop {
    public static void main(String[] args) {
        // print all the even numbers one by one from this array using enhanced for loop
        int[] num={12,30,49,56,66,77,88,30};

        for (int n:num){
            if (n%2==0){
                System.out.println(n);
            }
        }
    }
}
