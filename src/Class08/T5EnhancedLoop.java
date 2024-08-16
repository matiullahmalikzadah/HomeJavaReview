package Class08;

public class T5EnhancedLoop {
    public static void main(String[] args) {

        //find the largest even number
        int[] num={12,30,13,49,56,66,77,88,30};

        int largest=num[0];
        for (int t:num){
            if (t>largest&& t%2==0){
                largest=t;
            }
        }
        System.out.println(largest);
    }
}
