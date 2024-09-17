package Class08;

public class T7EnhancedLoop {
    public static void main(String[] args) {

        //fgo through the array and replace all the negative numbers with 0
        int[] num={-12,30,13,49,56,66,77,88,-30};

        for (int i = 0; i <num.length ; i++) {
            if (num[i]<0){
                num[i]=0;
        }
        }
        for (int nums:num){
            System.out.println(nums);
        }
    }
}
