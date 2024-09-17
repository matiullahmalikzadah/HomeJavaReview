package Class04;

public class E5NestedIf {
    public static void main(String[] args) {

        float rate= 4.4f;
        int price=50001;

        if (rate> 4.5){
            System.out.println("you will not buy the house ");
        }else {
            System.out.println("you will consider buying the house ");
        }
        if (price>5000){
            System.out.println("take a loan");
        }else {
            System.out.println("will pay cash ");
        }
    }
}
