package Class08;

public class T6EnhancedLoop {
    public static void main(String[] args) {

        //find the smallest number from arrzy
        int[] num={12,30,13,49,56,66,77,88,30};

        int smallest=num[0];
        for (int n:num){
            if (n<smallest){
                smallest=n;
            }
        }
        System.out.println(smallest);
    }
}
