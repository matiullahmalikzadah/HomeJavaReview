package Class08;

public class T4EnhancedLoop {
    public static void main(String[] args) {
        int[] num={12,30,49,56,66,77,88,30};

        int H=0;
        for (int t: num){
            if (t>H){
                H=t;
            }
        }
        System.out.println(H);
    }
}
