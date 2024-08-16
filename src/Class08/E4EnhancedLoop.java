package Class08;

public class E4EnhancedLoop {
    public static void main(String[] args) {
        int[] num={12,30,49,56,66,77,88,30};
        int count=0;
        for (int t:num) {

            if (t > 20) {
                count++;
            }
        }
        System.out.println(count);
    }
}
